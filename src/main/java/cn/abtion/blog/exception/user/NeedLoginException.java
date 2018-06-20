package cn.abtion.blog.exception.user;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;

/**
 * @author abtion
 * @since 2018/4/26 16:33
 * email abtion@outlook.com
 */
public class NeedLoginException extends BaseException {
    public NeedLoginException() {
        this.setCode(ConstantSetting.NEED_LOGIN);
        this.setMessage("Need Login");
    }
}
