package brain.core.User.UserReqyestController;

import brain.core.User.userService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class UserController {
    private final UserService userService;

    //следующий метод вытаскивает пароль юзера
    @GetMapping("/users")
    public String getUserByPassword(Model model, @RequestParam("password") String password) {
        model.addAttribute("user", userService.getAllUserByPassword(password));
        return "user-details";// create html page with this name
    }
}
