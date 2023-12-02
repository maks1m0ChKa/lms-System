package brain.core.User.userService;

import brain.core.Role.Role;
import brain.core.User.userDto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addNewUsers(String name, String secondName , String email, String password, String phone);
    List<UserDto> getAllUsers();

    void updateUser(Long id, Role role);
    void deleteUser(Long id);

    UserDto responseUserName(String name);

    UserDto getAllUserByPassword(String password);



}
