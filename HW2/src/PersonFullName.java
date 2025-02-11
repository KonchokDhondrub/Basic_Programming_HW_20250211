public class PersonFullName implements PersonOperator {

//    @Override
//    public String getData(Person person) {
//        return person.getfName() + " " + person.getlName();
//    }
    public int getDataInt(Person person) {
        return 0;
    }
    @Override
    public String toString(Person person) {
        return person.getfName() + " " + person.getlName();
    }
}
