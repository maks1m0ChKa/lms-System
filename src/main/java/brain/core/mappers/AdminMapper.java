package brain.core.mappers;

import brain.core.dto.AdminDto;
import brain.core.models.AdminModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AdminMapper {
      AdminDto toDto (AdminModel AdminModel);

    }

