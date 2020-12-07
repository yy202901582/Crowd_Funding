package com.my.crowd.exception;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/22
 *
 * 保存更新Admin时账号重复抛出的异常
 */
public class LoginAcctAlreadyInUseException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public LoginAcctAlreadyInUseException() {
    }

    public LoginAcctAlreadyInUseException(String message) {
        super(message);
    }

    public LoginAcctAlreadyInUseException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctAlreadyInUseException(Throwable cause) {
        super(cause);
    }

    public LoginAcctAlreadyInUseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
