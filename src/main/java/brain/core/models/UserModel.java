package brain.core.models;
//создаю параметры + автоматическое создание таблицы в бд.

import brain.core.role.Role;
import brain.core.dto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Table(name="users")
@NoArgsConstructor
@Entity
@Getter
@Setter

public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user-name", nullable = false)
    private String name;

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

    public UserDto toDto(){
        return new UserDto(
                this.id,
                this.name,
                this.secondName,
                this.email,
                this.password,
                this.phone,
                this.role
            );
    }
}
