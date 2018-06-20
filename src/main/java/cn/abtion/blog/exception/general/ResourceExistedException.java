package cn.abtion.blog.exception.general;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;

/**
 * @author abtion
 * @since 2018/6/20 13:12
 * email abtion@outlook.com
 */
public class ResourceExistedException extends BaseException{

    public ResourceExistedException(String resourceName) {
        this.setCode(ConstantSetting.RESOURCE_EXISTED);
        this.setMessage(resourceName+"已经存在");
    }
}
