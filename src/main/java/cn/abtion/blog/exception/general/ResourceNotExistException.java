package cn.abtion.blog.exception.general;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;

/**
 * @author abtion
 * @since 2018/6/20 13:06
 * email abtion@outlook.com
 */
public class ResourceNotExistException extends BaseException{

    public ResourceNotExistException(String resourceName) {
        this.setCode(ConstantSetting.RESOURCE_NOT_EXIST);
        this.setMessage(resourceName+"不存在");
    }
}
