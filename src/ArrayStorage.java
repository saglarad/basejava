import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for(int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (Resume resume : storage) {
            resume = r;
            break;
        }
    }

    Resume get(String uuid) {
        if (storage[0].uuid == uuid) {
            return storage[0];
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(uuid)){
                delete(uuid);
            }
        }
    }

    Resume[] getAll() {
        return Arrays.copyOf(storage, storage.length);
    }

    int size() {
        for (int i = 0; i < storage.length; i++){
            System.out.println(i);
        }
        return 0;
    }
}
