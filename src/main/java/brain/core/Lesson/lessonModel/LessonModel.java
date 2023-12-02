package brain.core.Lesson.lessonModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Lessons")// make a table in bd

public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// connect to postgress db
    private Long id;

    @Column (name = "user-name", nullable = false)
    private String name;

    @Column (name = "description", nullable = false)
    private String description;
}
