package com.urise.webapp.storage;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size;

    void clear() {
        for(int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid) {
                return storage[i];
            }
        }
        return null;
    }
    void update (Resume resume) {
        Resume oldResume = get(resume.uuid);
        oldResume.email = resume.email;
    }

    void delete(String uuid) {
        int i = 0;
        while (i < size) {
            if (storage[i].uuid.equals(uuid)) {
                break;
            }
            i++;
        }
        if (i < size) {
            System.arraycopy(storage, i + 1, storage, i, size - 1 - i);
            storage[size-1] = null;
            size--;
        }
    }

    Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    public int size() {
        return size;
    }
}
