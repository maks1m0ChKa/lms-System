package brain.core.mappers;

import brain.core.dto.AdminDto;
import brain.core.models.AdminModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR,uses = {UserMapper.class,TeacherMapper.class, HomeworkMapper.class,})
public interface AdminMapper {
      AdminDto toDto (AdminModel adminModel);

    }

