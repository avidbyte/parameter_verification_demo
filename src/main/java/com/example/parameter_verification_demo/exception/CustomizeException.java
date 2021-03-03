package com.example.parameter_verification_demo.exception;


import com.example.parameter_verification_demo.common.result.ErrorCode;
import com.example.parameter_verification_demo.common.result.IErrorCode;

/**
 * 自定义异常
 * @author aaron
 * @since 2021-01-28
 */
public class CustomizeException extends CommonException{

    private static final long serialVersionUID = -3829055812146544592L;

    public CustomizeException() {
        super();
    }

    public CustomizeException(ErrorCode errorCode) {
        super(errorCode.getCode(), errorCode.getMessage());
    }

    public CustomizeException(String code, String msg) {
        super(code, msg);
    }

    public CustomizeException(String msg) {
        super(msg);
    }
}
