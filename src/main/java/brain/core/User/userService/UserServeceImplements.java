package brain.core.User.userService;

import brain.core.Role.Role;
import brain.core.User.userDto.UserDto;
import brain.core.User.userModel.UserModel;
import brain.core.User.userModel.UsermModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//здесь у меня лежат все методы запросов
//грубо говоря зарисовки
//в сервисе создаю интерфейс и туда пихаю название всех методов  какие у меня будет иметь сам юзер
@Service
@RequiredArgsConstructor
public class UserServeceImplements implements UserService {
    private final UsermModelRepository usermModelRepository;
    //первый метод который нам добавляет нового юзера с ролями
    @Override
    public UserDto addNewUsers(String name, String secondName, String email, String password, String phone){
        return usermModelRepository.save(
                new UserModel(
                        null,
                        name,
                        secondName,
                        email,
                        password,
                        phone,
                        Role.USER
                )
        ).toDto();
    }

    @Override
    public List<UserDto> getAllUsers(){
        return usermModelRepository.findAll()
                .stream()
                .map(UserModel::toDto)
                .toList();
    }

    @Override
    public UserDto responseUserName(String name){
        return usermModelRepository.findFirstByName(name).toDto();

    }
    @Override
    public UserDto getAllUserByPassword(String password){
        return usermModelRepository.findAllByPassword(password).toDto();
    }


    @Override
    public void updateUser(Long id, Role role) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}
