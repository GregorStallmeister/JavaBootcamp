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
        System.out.println("Hello, I'm " + name + ". My gender is " + gender + ", and I'm " + age + " years old.");
    }
}
