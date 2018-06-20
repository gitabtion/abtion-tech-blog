package cn.abtion.blog.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author abtion
 * @since 2018/6/20 14:05
 * email abtion@outlook.com
 */
public class UserLoginRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    @NotNull
    @Max(2)
    @Min(0)
    private Integer client;

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

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }
}
