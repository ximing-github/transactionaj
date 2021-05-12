package com.mytest.mythrowable;

/**
 * ClassName:MyThroable
 * Package: com.mytest.mythroable
 * Description:
 *
 * @Date: 2021/5/12 13:47
 * @Author: 惜名
 */
public class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
