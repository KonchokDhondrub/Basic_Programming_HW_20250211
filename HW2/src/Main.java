import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jack", "McGregor",20, "jack@mail.com"));
        list.add(new Person("Oleg", "Smeshov",25, "oleg@mail.com"));
        list.add(new Person("Nickolaus","Claus",31, "nicko777@mail.com"));
        list.add(new Person("Anna", "Dark",26, "anna@mail.com"));
        list.add(new Person("Jack","Snow",29, "jack2@mail.com"));
        list.add(new Person("Lena", "Patyomkina",23, "lena@mail.com"));
        list.add(new Person("Oleg","Lesorubov",21, "oleg1234@mail.com"));
        list.add(new Person("Boris","Brodskoy",34, "boris@mail.com"));

//        for (Person person : list) {
//            System.out.println(person);
//        }

//        List<Person> list1 = createListByData(list, new PersonAge());
//        System.out.println(list1);


    }
    public static List<Person> createListByData(List<Person> list, PersonOperator person){
        List<Person> result = new ArrayList<>();
        for (Person lists: list){
            int get = lists.getAge();
            result.add(get...);
        }
        return result;
    }

}