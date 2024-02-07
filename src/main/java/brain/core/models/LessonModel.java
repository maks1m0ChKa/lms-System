package brain.core.models;

import brain.abstraktClasses.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Table(name="lesson")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class LessonModel extends BaseModel {

    @Column(name = "description",nullable = false)
    private String description;

}
