package lombok;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor

@Builder

@Value
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
