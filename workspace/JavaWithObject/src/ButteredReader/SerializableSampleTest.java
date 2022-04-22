package ButteredReader;

import org.junit.Test;

import java.io.*;
import static org.junit.Assert.fail;

public class SerializableSampleTest {

    @Test
    public void serializableSample() {
        // �V���A���C�Y
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp/test/person.txt"))) {
            Person person = new Person("John", "Williams", 55);
            oos.writeObject(person);
        } catch (IOException e) {
            fail(e.getMessage());
        }

        // �f�V���A���C�Y
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp/test/person.txt"))) {
            Person dePerson = (Person) ois.readObject();
            
            System.out.println(dePerson.getFirstName() + "\t" + dePerson.getLastName() + "\t" + dePerson.getAge());
            
        } catch (IOException | ClassNotFoundException e) {
            fail(e.getMessage());
        }

    }
}
