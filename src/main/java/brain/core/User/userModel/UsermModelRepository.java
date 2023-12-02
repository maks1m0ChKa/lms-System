package brain.core.User.userModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsermModelRepository  extends JpaRepository<UserModel,Long> {
    UserModel findFirstByName(String name);
    UserModel findAllByPassword(String password);
}
