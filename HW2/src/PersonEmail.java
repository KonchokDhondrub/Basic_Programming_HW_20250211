public class PersonEmail implements PersonOperator {

//    @Override
//    public String getData(Person person){
//        return person.getEmail();
//    }
    public int getDataInt(Person person){
        return 0;
    }
    @Override
    public String toString(Person person) {
        return person.getEmail();
    }
}
