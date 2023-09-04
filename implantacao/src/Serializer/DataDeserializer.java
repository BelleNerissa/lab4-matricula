package Serializer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@SuppressWarnings("unchecked")
public class DataDeserializer {
    public static <T extends Serializable> T deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            PersistentData<T> persistentData = (PersistentData<T>) objectIn.readObject();
            return persistentData.getData();
        }
    }
}
