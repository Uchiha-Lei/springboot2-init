package com.xulei.yuntobackend.exception;

import lombok.Getter;

/**
 * 自定义异常处理
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int eCode;

    public BusinessException(int eCode, String message) {
        super(message);
        this.eCode = eCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.eCode = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.eCode = errorCode.getCode();
    }
}
