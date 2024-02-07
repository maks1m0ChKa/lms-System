package brain.core.mappers;

import brain.core.dto.UserDto;
import brain.core.models.UserModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    UserDto toDto (UserModel usersModel);

}


