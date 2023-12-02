package brain.core.User.userDto;

import brain.core.Role.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class UserDto {
    private Long id;
    private String name;
    private String secondName;
    private String email;
    private String password;
    private String phone;
    private Role role;
}
