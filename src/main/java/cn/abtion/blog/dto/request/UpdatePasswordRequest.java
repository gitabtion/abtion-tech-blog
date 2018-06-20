package cn.abtion.blog.dto.request;

import javax.validation.constraints.NotBlank;

/**
 * @author abtion
 * @since 2018/6/20 15:17
 * email abtion@outlook.com
 */
public class UpdatePasswordRequest {
    @NotBlank
    private String oldPassword;
    @NotBlank
    private String newPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
