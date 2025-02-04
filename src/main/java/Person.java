public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String pName, int pAge, String pGender) {
        name = pName;
        age = pAge;
        gender = pGender;
    }

    public void  introduceYourself() {
//        System.out.println("Hello, I'm " + name + ". My gender is " + gender + ", and I'm " + age + " years old.");
//        System.out.println(String.format("Hello, I'm %s. My gender is %s, and I'm %d years old.", name, gender, age));
        System.out.printf("Hello, I'm %s. My gender is %s, and I'm %d years old.%n", name, gender, age);
    }
}
