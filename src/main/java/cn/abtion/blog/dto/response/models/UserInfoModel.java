package cn.abtion.blog.dto.response.models;

import cn.abtion.blog.domain.User;

/**
 * @author abtion
 * @since 2018/6/20 14:58
 * email abtion@outlook.com
 */
public class UserInfoModel {
    private Long id;
    private String name;
    private String avatar;
    private String signature;
    private int sex;
    private int type;
    private String addOn;
    private Long createAt;
    private Long updateAt;

    public UserInfoModel(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.avatar = user.getAvatar();
        this.signature = user.getSignature();
        this.sex = user.getSex();
        this.type = user.getType();
        this.addOn = user.getAddOn();
        this.createAt = user.getCreateAt();
        this.updateAt = user.getUpdateAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAddOn() {
        return addOn;
    }

    public void setAddOn(String addOn) {
        this.addOn = addOn;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}
