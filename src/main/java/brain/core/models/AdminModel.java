package brain.core.models;

import brain.abstraktClasses.BaseModel;
import brain.core.dto.AdminDto;
import brain.core.role.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Table(name="admin")
@NoArgsConstructor
@Entity
@Getter
@Setter

public class AdminModel extends BaseModel {


    @Column(name ="second-name", nullable = false)
    private String secondName;

    @Column(name ="email" ,nullable = false)
    private String email;

    @Column(name ="password" ,nullable = false)
    private String password;

    @Column(name ="phone" ,nullable = false)
    private String phone;

    @Column(name ="role" ,nullable = false)
    private Role role;


}
