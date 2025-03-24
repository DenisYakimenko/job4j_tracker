package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int totalScore = 0;
        int totalSubjects = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
        }
        return (double) totalScore / totalSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            int totalSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
            result.add(new Label(pupil.name(), (double) totalScore / totalSubjects));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> totalScores = new LinkedHashMap<>();
        Map<String, Integer> subjectCount = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScores.merge(subject.name(), subject.score(), Integer::sum);
                subjectCount.merge(subject.name(), 1, Integer::sum);
            }
        }
        ArrayList<Label> labels = new ArrayList<>();
        for (String subjectName : totalScores.keySet()) {
            double average = (double) totalScores.get(subjectName) / subjectCount.get(subjectName);
            Label result = new Label(subjectName, average);
            labels.add(result);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> studentScores = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            studentScores.add(new Label(pupil.name(), totalScore));
        }
        studentScores.sort(Comparator.naturalOrder());
        return studentScores.get(studentScores.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectScores.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        LinkedList<Label> labels = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : subjectScores.entrySet()) {
            Label result = new Label(entry.getKey(), entry.getValue());
            labels.add(result);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.getLast();
    }
}
