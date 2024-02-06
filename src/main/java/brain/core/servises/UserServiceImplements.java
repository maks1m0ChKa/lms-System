package brain.core.servises;

import brain.core.models.UserModel;
import brain.core.repos.UserModelRepository;
import brain.core.role.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//здесь у меня лежат все методы запросов
//грубо говоря зарисовки
//в сервисе создаю интерфейс и туда пихаю название всех методов  какие у меня будет иметь сам юзер
@Service
@RequiredArgsConstructor
public class UserServiceImplements implements UserService {


    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void updateUser(Long id, String name, String secondName, String email, String password, String phone, Role role){

    }
}
