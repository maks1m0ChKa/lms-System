package brain.core.controller;


import brain.core.controller.UserResponse.GetUsersResponse;
import brain.core.dto.UserDto;
import brain.core.servises.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    //тут я реализую все методы
    //следующий метод ющет юзера по паролю



    @GetMapping("/users")
    @ResponseBody
    public GetUsersResponse getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new GetUsersResponse(users);
    }
//    @PostMapping("/add")
//    @ResponseBody
//    public UserDto addNewUser(
//            @RequestBody AddUsersRequest addUsersRequest
//    ) {
//        return userService.addNewUsers(
//                addUsersRequest.getName(),
//                addUsersRequest.getSecondName(),
//                addUsersRequest.getEmail(),
//                addUsersRequest.getPassword(),
//                addUsersRequest.getPhone()
//
//        );
//    }
//снизу происходят странные вещи
    @PutMapping("/update")
    @ResponseBody
    public UserDto updateUser(
            @RequestBody UpdateUsersRequest updateUsersRequest
    ) {
        userService.updateUser(
                updateUsersRequest.getId(),
                updateUsersRequest.getName(),
                updateUsersRequest.getSecondName(),
                updateUsersRequest.getEmail(),
                updateUsersRequest.getPassword(),
                updateUsersRequest.getPhone(),
                updateUsersRequest.getRole()
        );
        return userService.getUserById(updateUsersRequest.getId());
    }

    @DeleteMapping("/users/delete/{id}")
    @ResponseBody
    public void   deleteUser(
            @PathVariable Long id
    ) {
        userService.deleteUser(id);
    }
    @GetMapping("/users/{id}")
    @ResponseBody
    public UserDto getUserById(
            @PathVariable Long id
    ) {
        return userService.getUserById(id);
    }
}


