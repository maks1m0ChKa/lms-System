package brain.core.servises;

import brain.core.dto.UserDto;
import brain.core.mappers.UserMapper;
import brain.core.role.Role;
import brain.core.models.UserModel;
import brain.core.repos.UserModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImplements implements AdminService {

    private final UserModelRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto addNewUser(String name, String secondName, String email, String password, String phone, Role role) {
        UserModel userModel = userRepository.save(
                new UserModel(
                        secondName,
                        email,
                        password,
                        phone,
                        role
                )
        );
        return userMapper.toDto(userModel);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .toList();
    }



    @Override
    public UserDto updateUser(Long id, String name, String secondName, String email, String password, String phone , Role role) {
        UserModel updatedUsersModel = userRepository
                .findById(id)
                .orElseThrow();

        if (updatedUsersModel.getId() == null) {
            throw new IllegalArgumentException(("User id not found"));
        }
        updatedUsersModel.setId(id);
        updatedUsersModel.setName(name);
        updatedUsersModel.setSecondName(secondName);
        updatedUsersModel.setEmail(email);
        updatedUsersModel.setPassword(password);
        updatedUsersModel.setRole(role);
        userRepository.save(
                updatedUsersModel
        );
        return userMapper.toDto(updatedUsersModel);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public UserDto getUserById(Long id) {
        UserModel usermodel = userRepository.findUserModelById(id);

        return userMapper.toDto(usermodel);


    }

}

