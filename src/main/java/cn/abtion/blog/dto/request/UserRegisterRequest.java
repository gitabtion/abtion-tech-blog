package cn.abtion.blog.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author abtion
 * @since 2018/6/20 14:07
 * email abtion@outlook.com
 */
public class UserRegisterRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    @NotNull
    private int sex;

    private String signature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
