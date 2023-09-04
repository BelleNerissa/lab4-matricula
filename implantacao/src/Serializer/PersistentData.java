package Serializer;

import java.io.Serializable;

public class PersistentData<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;

    public PersistentData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}