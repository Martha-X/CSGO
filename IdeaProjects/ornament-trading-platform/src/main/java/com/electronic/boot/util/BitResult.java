package com.electronic.boot.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.ToString;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ToString
public class BitResult<T> {
    private Integer code;
    private static final Map<String, Object> data = new LinkedHashMap<>();
    private Object tags;
    private Object items;
    private Integer pageNum;
    private Integer pageSize;
    private long totalCount;
    private Integer totalPage;
    private String msg;
    private String briefInfo;
    private String keyword;
    private String wearZone;
    private String conditionZone;

    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //结果集
    private List<T> list;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;
    //导航页码数
    private Integer navigatePages;
    //所有导航页号
    private int[] navigatePageNums;
    //导航条上的第一页
    private Integer navigateFirstPage;
    //导航条上的最后一页
    private Integer navigateLastPage;
    //当前页面第一个元素在数据库中的行号
    private int startRow;
    //当前页面最后一个元素在数据库中的行号
    private int endRow;
    //当前页的数量
    private int size;


    public BitResult() {
    }

    public BitResult(Object obj) {
        this.tags = obj;
    }

    public BitResult(Page<T> page) {
        dealPage(page, page.getRecords(), 8);
    }

    public BitResult<T> success(String msg) {
        this.msg = msg;
        this.code = 200;
        return this;
    }

    public BitResult<T> fail(String msg) {
        this.msg = msg;
        this.code = 500;
        return this;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public void setData(Object data) {
        if (data instanceof Page) {
            Page<T> page = (Page) data;
            dealPage(page, page.getRecords(), 8);
        } else {
            tags = data;
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private void handleResult(List<T> list) {
        data.put("items", list);
        data.put("pageNum", pageNum);
        data.put("pageSize", pageSize);
        data.put("totalCount", totalCount);
        data.put("isFirstPage", isFirstPage);
        data.put("isLastPage", isLastPage);
        data.put("prePage", prePage);
        data.put("nextPage", nextPage);
        data.put("hasPreviousPage", hasPreviousPage);
        data.put("hasNextPage", hasNextPage);
        data.put("navigatePageNums", navigatePageNums);
        data.put("size", size);
        data.put("totalPage", totalPage);
    }


    public void dealPage(Page<T> page, List<T> list, int navigatePages) {
        if (page != null) {
            this.pageNum = Math.toIntExact(page.getCurrent());
            this.pageSize = Math.toIntExact(page.getSize());

            this.totalPage = Math.toIntExact(page.getPages());
            this.list = page.getRecords();
            this.size = page.getRecords().size();
            this.totalCount = page.getTotal();
//            //由于结果是>startRow的，所以实际的需要+1
//            if (this.size == 0) {
//                this.startRow = 0;
//                this.endRow = 0;
//            } else {
//                this.startRow = myPage.getStartRow() + 1;
//                //计算实际的endRow（最后一页的时候特殊）
//                this.endRow = this.startRow - 1 + this.size;
//            }
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();

            this.totalPage = this.pageSize > 0 ? 1 : 0;
            this.list = list;
            this.size = list.size();
            this.totalCount = list.size();
            this.startRow = 0;
            this.endRow = list.size() > 0 ? list.size() - 1 : 0;
        }
        if (list instanceof Collection) {
            this.navigatePages = navigatePages;
            //计算导航页
            calcNavigatePageNums();
            //计算前后页，第一页，最后一页
            calcPage();
            //判断页面边界
            judgePageBoundary();
        }
        handleResult(list);
    }

    private void calcNavigatePageNums() {
        //当总页数小于或等于导航页码数时
        if (totalPage <= navigatePages) {
            navigatePageNums = new int[totalPage];
            for (int i = 0; i < totalPage; i++) {
                navigatePageNums[i] = i + 1;
            }
        } else { //当总页数大于导航页码数时
            navigatePageNums = new int[navigatePages];
            int startNum = pageNum - navigatePages / 2;
            int endNum = pageNum + navigatePages / 2;

            if (startNum < 1) {
                startNum = 1;
                //(最前navigatePages页
                for (int i = 0; i < navigatePages; i++) {
                    navigatePageNums[i] = startNum++;
                }
            } else if (endNum > totalPage) {
                endNum = totalPage;
                //最后navigatePages页
                for (int i = navigatePages - 1; i >= 0; i--) {
                    navigatePageNums[i] = endNum--;
                }
            } else {
                //所有中间页
                for (int i = 0; i < navigatePages; i++) {
                    navigatePageNums[i] = startNum++;
                }
            }
        }
    }

    /**
     * 计算前后页，第一页，最后一页
     */
    private void calcPage() {
        if (navigatePageNums != null && navigatePageNums.length > 0) {
            navigateFirstPage = navigatePageNums[0];
            navigateLastPage = navigatePageNums[navigatePageNums.length - 1];
            if (pageNum > 1) {
                prePage = pageNum - 1;
            }
            if (pageNum < totalPage) {
                nextPage = pageNum + 1;
            }
        }
    }

    /**
     * 判定页面边界
     */
    private void judgePageBoundary() {
        isFirstPage = pageNum == 1;
        isLastPage = (pageNum.equals(totalPage)) || totalPage == 0;
        hasPreviousPage = pageNum > 1;
        hasNextPage = pageNum < totalPage;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setItems(Object[] items) {
        this.items = items;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public String getBriefInfo() {
        return briefInfo;
    }

    public void setBriefInfo(String briefInfo) {
        this.briefInfo = briefInfo;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getWearZone() {
        return wearZone;
    }

    public void setWearZone(String wearZone) {
        this.wearZone = wearZone;
    }

    public String getConditionZone() {
        return conditionZone;
    }

    public void setConditionZone(String conditionZone) {
        this.conditionZone = conditionZone;
    }
}
