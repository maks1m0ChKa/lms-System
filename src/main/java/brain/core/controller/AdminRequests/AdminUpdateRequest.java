package brain.core.controller.AdminRequests;

import brain.core.role.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminUpdateRequest {
    private Long id;
    private String name;
    private String secondName;
    private String email;
    private String password;
    private String phone;
    private Role role;
}
