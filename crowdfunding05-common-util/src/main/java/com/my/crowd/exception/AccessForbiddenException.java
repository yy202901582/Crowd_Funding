package com.my.crowd.exception;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/19
 *
 * 用户没有登录就访问受到保护资源抛出的异常
 */
public class AccessForbiddenException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public AccessForbiddenException() {
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    public AccessForbiddenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
