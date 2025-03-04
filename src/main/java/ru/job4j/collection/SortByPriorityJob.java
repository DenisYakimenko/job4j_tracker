package ru.job4j.collection;

import java.util.Comparator;

public class SortByPriorityJob implements Comparator<Job> {

    @Override
    public int compare(Job left, Job right) {
        return Integer.compare(left.getPriority(), right.getPriority());
    }
}
