package lombok;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Builder

public class Student {
    String id;
    String name;
    String address;
    double grade;
}
