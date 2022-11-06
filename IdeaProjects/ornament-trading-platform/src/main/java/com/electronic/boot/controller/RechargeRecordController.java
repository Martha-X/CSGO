package com.electronic.boot.controller;

import com.electronic.boot.bean.RechargeRecord;
import com.electronic.boot.service.RechargeRecordService;
import com.electronic.boot.util.BitResult;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/rechargeRecord")
public class RechargeRecordController {
    @Autowired
    private RechargeRecordService rechargeRecordService;

    @GetMapping("/getAllRechargeRecord/{id}")
    public BitResult getAllRechargeRecord(@PathVariable("id") String userId,
                                          @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                          @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
        PageInfo<RechargeRecord> allRechargeRecord = rechargeRecordService.getAllRechargeRecord(userId, pageNum, pageSize);
        return new BitResult(allRechargeRecord).success("ok");
    }

    @RequestMapping("/dealRechargeRecordWithSuccess")
    public void dealRechargeRecord(HttpServletRequest request) throws UnsupportedEncodingException {
        // 商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
        // 支付宝交易号
        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
        // 交易状态
        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");
        // 付款金额
        String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
        String userId = (String) request.getAttribute("userId");
        log.info("{}", userId);
        if (trade_status.equals("TRADE_SUCCESS")) {
//                String merchantReturnUrl = paymentOrderService.updateOrderPaid(out_trade_no, CurrencyUtils.getYuan2Fen(total_amount));
//                notifyFoodieShop(out_trade_no,merchantReturnUrl);
            RechargeRecord rechargeRecord = new RechargeRecord();
            rechargeRecord.setCreateTime(new Date());
            rechargeRecord.setSerialNumber(out_trade_no);
            rechargeRecord.setRechargeAmount(new BigDecimal(total_amount));
            rechargeRecord.setRechargeStatus("充值成功");
            rechargeRecord.setPaymentAccount("支付宝");
            rechargeRecord.setUserId(userId);
            log.info("************* 支付成功(支付宝异步通知) - 时间: {} *************", System.currentTimeMillis());
            log.info("* 订单号: {}", out_trade_no);
            log.info("* 支付宝交易号: {}", trade_no);
            log.info("* 实付金额: {}", total_amount);
            log.info("* 交易状态: {}", trade_status);
            log.info("*****************************************************************************");
            log.info("{}", "执行余额操作");
            try {
                rechargeRecordService.insertRechargeRecord(userId,rechargeRecord);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
