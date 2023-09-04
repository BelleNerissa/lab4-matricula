package Serializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("unchecked")
public class DataDeserializer {
    public static <T extends Serializable> T deserialize(String fileName) throws IOException, ClassNotFoundException {
        Path filePath = Paths.get("C:\\Users\\belle\\Documents\\PUC\\Lab4\\lab4-matricula\\implantacao\\" + fileName);
        try (FileInputStream fileIn = new FileInputStream(filePath.toFile());
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            PersistentData<T> persistentData = (PersistentData<T>) objectIn.readObject();
            return persistentData.getData();
        }
    }
}
