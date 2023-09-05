package Serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataSerializer {

  public static <T extends Serializable> void serialize(
    PersistentData<T> persistentData,
    String fileName
  ) throws IOException {
    Path filePath = Paths.get(fileName);
    try (
      FileOutputStream fileOut = new FileOutputStream(filePath.toFile());
      ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)
    ) {
      objectOut.writeObject(persistentData);
    }
  }
}
