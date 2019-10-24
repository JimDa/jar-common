package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author dpc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestVo {
    @NotEmpty
    private String principal;
    @NotEmpty
    private String credentials;
    @NotEmpty
    private String loginType;
}
