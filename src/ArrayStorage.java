import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size;

    void clear() {
        for(int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        storage[size] = r;
        ++size;
    }

    Resume get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(uuid)){
                storage[i] = null;
                break;
            }
        }
    }

    Resume[] getAll() {
        Resume[] tempStorage = new Resume[storage.length];
        for (int i = 0; i < storage.length; i++) {
            tempStorage[i] = storage[i];
        }
        return tempStorage;
    }

    int size() {
        return size;
    }
}
