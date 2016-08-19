import java.io.*;

/**
 * Created by davidshuvli on 2016/8/17.
 */

class Person implements Serializable{
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args){
        try {
            //serializePerson();
            Person p = DeseriolizePerson();
            System.out.println(p.getAge() + "  " + p.getName() + " " + p.getSex());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void serializePerson() throws FileNotFoundException, IOException{
        Person person = new Person();
        person.setAge(15);
        person.setName("David");
        person.setSex("Male");

        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:\\person.txt")));
        oo.writeObject(person);
        oo.close();
    }

    public static Person DeseriolizePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\person.txt")));
        Person person = (Person)ois.readObject();
        return person;
    }


}
