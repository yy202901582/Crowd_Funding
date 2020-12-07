package com.my.crowd.exception;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/22
 *
 * 保存更新Admin时账号重复抛出的异常
 */
public class LoginAcctAlreadyInUseForUpdateException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public LoginAcctAlreadyInUseForUpdateException() {
    }

    public LoginAcctAlreadyInUseForUpdateException(String message) {
        super(message);
    }

    public LoginAcctAlreadyInUseForUpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctAlreadyInUseForUpdateException(Throwable cause) {
        super(cause);
    }

    public LoginAcctAlreadyInUseForUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
