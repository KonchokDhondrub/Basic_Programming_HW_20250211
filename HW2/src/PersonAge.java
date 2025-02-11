public class PersonAge implements PersonOperator {

    @Override
    public int getDataInt(Person person) {
        return person.getAge();
    }

    @Override
    public String toString(Person person) {
        return String.valueOf(person.getAge());
    }
    //    public String getData(Person person) {
//        return "";
//    }
}
