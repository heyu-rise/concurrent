package com.heyu.concurrent.heyu;

import com.heyu.concurrent.util.DateTimeUtil;

import java.util.Date;

/**
 * @author heyu
 * @date 2019/8/17
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        String date = DateTimeUtil.date2dateStr(new Date());
        String date2 = DateTimeUtil.date2dateStr(new Date());
        String date3 = DateTimeUtil.date2dateTimeStr(new Date());
        String date4 = DateTimeUtil.date2dateTimeStr(new Date());

    }

    private void aaa(){

    }
}
