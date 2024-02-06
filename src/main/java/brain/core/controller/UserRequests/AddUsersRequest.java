package brain.core.controller.UserRequests;

import brain.core.role.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class AddUsersRequest {
    private String name;
    private String secondName;
    private String email;
    private String password;
    private String phone;
    private Role role;

}
