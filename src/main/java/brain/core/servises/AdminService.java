package brain.core.servises;

import brain.core.dto.UserDto;
import brain.core.role.Role;

import java.util.List;

public interface AdminService {
   UserDto addNewUser(String name, String secondName, String email, String password, String phone ,Role role);
    List<UserDto>getAllUsers();
    void updateUser(Long id, String name, String secondName, String email, String password, String phone ,Role role);

    void deleteUser(Long id);


}
