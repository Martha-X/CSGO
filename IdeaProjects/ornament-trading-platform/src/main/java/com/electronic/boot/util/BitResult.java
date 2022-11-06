package com.electronic.boot.util;

import com.github.pagehelper.PageInfo;
import lombok.Data;

@Data
public class BitResult {
    private Object data;
    private PageInfo pageInfo;
    private String keyword;
    private String wearZone;
    private String conditionZone;
    private Integer code;
    private String msg;

    public BitResult(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public BitResult() {
    }

    public BitResult(Object data) {
        this.data = data;
    }

    public BitResult(Object data, PageInfo pageInfo) {
        this.data = data;
        this.pageInfo = pageInfo;
        this.msg = "OK";
        this.code = 200;
    }

    public BitResult success(String msg) {
        this.msg = msg;
        this.code = 200;
        return this;
    }

    public BitResult fail(String msg) {
        this.msg = msg;
        this.code = 500;
        return this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        return "BitResult{" +
                "data=" + data +
                ", pageInfo=" + pageInfo +
                ", keyword='" + keyword + '\'' +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
