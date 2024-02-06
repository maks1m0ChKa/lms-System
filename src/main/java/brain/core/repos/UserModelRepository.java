package brain.core.repos;

import brain.core.role.Role;
import brain.core.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel,Long> {
   // UserModel findFirstByName(String name);
    // UserModel findFirstByEmailAndPassword(String email, String password);

  //  UserModel findFirstByRole(Role role);

    UserModel findByRole(Role role);


    //есди методы не заработают то переписываю их шаблоны сюда ии заебись)
}

//поиск по холодильнику
//тут идет работа с базой данных
// тут я пишу логику поиска и работу с базой данных и могу тут писать методы для работы с ней
