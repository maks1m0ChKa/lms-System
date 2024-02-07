package brain.core.controller;

import brain.core.controller.AdminRequests.AdminUpdateRequest;
import brain.core.controller.AdminResponse.GetUsersResponse;
import brain.core.dto.AdminDto;
import brain.core.dto.UserDto;
import brain.core.servises.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("admin/main/page/controller")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/users")
    @ResponseBody
    public GetUsersResponse getAllUsers(){
        List<UserDto> users = adminService.getAllUsers();
        return new GetUsersResponse(users);
    }
    @PutMapping("/update")
    @ResponseBody
    public UserDto updateUser (
            @RequestBody AdminUpdateRequest updateUsersRequest
    ) {
        adminService.updateUser(
                updateUsersRequest.getId(),
                updateUsersRequest.getName(),
                updateUsersRequest.getSecondName(),
                updateUsersRequest.getEmail(),
                updateUsersRequest.getPassword(),
                updateUsersRequest.getPhone(),
                updateUsersRequest.getRole()
        );
        return adminService.getUserById(updateUsersRequest.getId());
    }

    @DeleteMapping("/users/delete/{id}")
    @ResponseBody
    public void   deleteUser(
            @PathVariable Long id
    ) {
        AdminService.deleteUser(id);
    }
    @GetMapping("/users/{id}")
    @ResponseBody
    public AdminDto getUserById(
            @PathVariable Long id
    ) {
        return adminService.getUserById(id);
    }
}

