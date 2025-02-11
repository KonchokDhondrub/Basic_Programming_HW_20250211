public class Person {
    String fName;
    String lName;
    int age;
    String email;

    public Person(String fName, String lName, int age, String email) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s, age: %d, email: %s", fName, lName, age, email);
    }
}
