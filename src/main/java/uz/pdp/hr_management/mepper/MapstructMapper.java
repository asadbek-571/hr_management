package uz.pdp.hr_management.mepper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;
import uz.pdp.hr_management.entity.User;
import uz.pdp.hr_management.model.UserRegisterDto;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(unmappedTargetPolicy = IGNORE, componentModel = "spring")
@Component
public interface MapstructMapper {

    User toUser(UserRegisterDto dto);

    User toUser(@MappingTarget User user,UserRegisterDto dto);

}
