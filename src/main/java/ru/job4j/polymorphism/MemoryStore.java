package ru.job4j.polymorphism;

public class MemoryStore extends FileStore {
    private String[] memoryStore = new String[100];
    private int size = 0;

    public void save(String date) {
        memoryStore[size++] = date;
    }

    public String read() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buffer.append(memoryStore[i]);
        }
        return buffer.toString();
    }
}
