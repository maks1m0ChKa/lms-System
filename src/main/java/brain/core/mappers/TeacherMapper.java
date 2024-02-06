package brain.core.mappers;

import brain.core.dto.TeacherDto;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface TeacherMapper {
    TeacherDto toTeacherDto (TeacherMapper TeacherModel);

}

