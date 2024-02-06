package brain.core.repos;

import brain.core.models.AdminModel;
import brain.core.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// main methods
@Repository
public interface AdminModelRepository extends JpaRepository<AdminModel, Long> {
    AdminModel findByUserName(String name);

    AdminModel findFirstByEmailAndPassword(String email, String password);
    AdminModel findFirstByRole(Role role);
    AdminModel findByRole(Role role);
    AdminModel findFirstByPhone(String phone);

}
