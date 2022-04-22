package ButteredReader;

import org.junit.Test;

import java.io.*;
import static org.junit.Assert.fail;

public class SerializableSampleTest {

    @Test
    public void serializableSample() {
        // シリアライズ
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp/test/person.txt"))) {
            Person person = new Person("John", "Williams", 55);
            oos.writeObject(person);
        } catch (IOException e) {
            fail(e.getMessage());
        }

        // デシリアライズ
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp/test/person.txt"))) {
            Person dePerson = (Person) ois.readObject();
            
            System.out.println(dePerson.getFirstName() + "\t" + dePerson.getLastName() + "\t" + dePerson.getAge());
            
        } catch (IOException | ClassNotFoundException e) {
            fail(e.getMessage());
        }

    }
}
