package cn.abtion.blog.exception.general;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;

/**
 * @author abtion
 * @since 2018/6/20 13:23
 * email abtion@outlook.com
 */
public class PermissionDeniedException extends BaseException{
    public PermissionDeniedException() {
        this.setCode(ConstantSetting.PERMISSION_DENIED);
        this.setMessage("没有权限");
    }
}
