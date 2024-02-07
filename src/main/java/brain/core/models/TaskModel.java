package brain.core.models;

import brain.abstraktClasses.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Table(name="tasks")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class TaskModel extends BaseModel {

    @Column(name = "descripton", nullable = false)
    private String description;
// эта колонка нужна для того что бы таск можно было отмечать как выполненый или как не выполненый
    @Column(name = "doneAreNot", nullable = false)
    private Boolean doneAreNot;

}
