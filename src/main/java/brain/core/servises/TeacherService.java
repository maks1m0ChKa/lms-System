package brain.core.servises;

import brain.core.role.Role;

public interface TeacherService {
    void updateUser(Long id, String name, String secondName, String email, String password, String phone , Role role);

    void deleteUser(Long id);
}
