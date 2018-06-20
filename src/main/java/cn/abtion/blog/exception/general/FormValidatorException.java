package cn.abtion.blog.exception.general;

import cn.abtion.blog.config.ConstantSetting;
import cn.abtion.blog.exception.BaseException;
import org.springframework.validation.BindingResult;

/**
 * @author abtion
 * @since 2018/6/20 13:20
 * email abtion@outlook.com
 */
public class FormValidatorException extends BaseException{
    public FormValidatorException(String message) {
        this.setMessage(message);
        this.setCode(ConstantSetting.FORM_VALIDATOR);
    }

    public FormValidatorException(BindingResult bindingResult) {
        this.setCode(ConstantSetting.FORM_VALIDATOR);
        this.setMessage(bindingResult.getFieldError().getField()+bindingResult.getFieldError().getDefaultMessage());


    }
}
