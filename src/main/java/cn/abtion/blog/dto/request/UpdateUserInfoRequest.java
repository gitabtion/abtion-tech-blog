package cn.abtion.blog.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author abtion
 * @since 2018/6/20 16:44
 * email abtion@outlook.com
 */
public class UpdateUserInfoRequest {
    @NotBlank
    private String name;
    private String avatar;
    private String signature;
    @NotNull
    private int sex;
    private String addOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddOn() {
        return addOn;
    }

    public void setAddOn(String addOn) {
        this.addOn = addOn;
    }
}
