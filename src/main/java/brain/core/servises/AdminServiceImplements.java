package brain.core.servises;

import brain.core.dto.UserDto;
import brain.core.mappers.UserDtoMapper;
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
    private final UserDtoMapper userMapper;

    @Override
    public UserDto addNewUser(String name, String secondName, String email, String password, String phone, Role role) {
        UserModel userModel = userRepository.save(
                new UserModel(
                        null,
                        name,
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
                .map(UserModel::toDto)
                .toList();
    }



    @Override
    public void updateUser(Long id, String name, String secondName, String email, String password, String phone, Role role) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}

