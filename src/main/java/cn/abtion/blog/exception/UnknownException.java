package cn.abtion.blog.exception;

import cn.abtion.blog.config.ConstantSetting;

import java.lang.invoke.ConstantCallSite;

/**
 * @author abtion
 * @since 2018/4/26 16:32
 * email abtion@outlook.com
 */
public class UnknownException extends BaseException {
    public UnknownException(String message) {
        this.setCode(ConstantSetting.UNKNOWN);
        this.setMessage(message);
    }
}
