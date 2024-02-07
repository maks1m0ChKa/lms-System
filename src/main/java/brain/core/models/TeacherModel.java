package brain.core.models;

import brain.abstraktClasses.BaseModel;
import brain.core.role.Role;
import brain.core.dto.TeacherDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="teacher")
public class TeacherModel extends BaseModel {


    @Column(name = "second-name", nullable = false)
    private String secondName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "role", nullable = false)
    private Role role;
}

