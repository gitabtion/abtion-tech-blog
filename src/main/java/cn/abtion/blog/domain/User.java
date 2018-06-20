package cn.abtion.blog.domain;

import cn.abtion.blog.dto.response.models.UserInfoModel;

/**
 * @author abtion
 * @since 2018/4/26 16:20
 * email abtion@outlook.com
 */
public class User extends Model {
    private long id;
    private String name;
    private String avatar;
    private String password;
    private String signature;
    private int sex;
    private int type;
    private String addOn;
    private long createAt;
    private long updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }


}
