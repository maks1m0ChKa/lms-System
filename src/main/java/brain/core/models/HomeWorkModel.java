package brain.core.models;

import brain.abstraktClasses.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Table(name="home-work")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class HomeWorkModel extends BaseModel {

    @Column(name = "description",nullable = false)
    private String description;

}
