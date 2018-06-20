package cn.abtion.blog.exception.general;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;

/**
 * @author abtion
 * @since 2018/6/20 13:15
 * email abtion@outlook.com
 */
public class PasswordException extends BaseException{
    public PasswordException() {
        this.setCode(ConstantSetting.PASSWORD_ERROR);
        this.setMessage("密码错误");
    }
}
