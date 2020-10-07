package com.gumpread.exception.user;

/**
 * 用户输入的验证码不对的异常
 */
public class CaptchaNotEqualException extends UserExcpetion {
    public CaptchaNotEqualException(){
        this(null);
    }
    public CaptchaNotEqualException(Object[] args) {
        super("user.captcha.error", args, "用户输入的验证码不正确");
    }
}
