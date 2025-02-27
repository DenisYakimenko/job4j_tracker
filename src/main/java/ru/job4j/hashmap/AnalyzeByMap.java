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
        Map<String, Integer> subjectScores = new HashMap<>();
        Map<String, Integer> subjectCounts = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectScores.put(subject.name(), subjectScores.getOrDefault(subject.name(), 0)
                        + subject.score());
                subjectCounts.put(subject.name(), subjectCounts.getOrDefault(subject.name(), 0) + 1);
            }
        }
        List<Label> result = new ArrayList<>();
        for (String subject : subjectScores.keySet()) {
            double average = (double) subjectScores.get(subject) / subjectCounts.get(subject);
            result.add(new Label(subject, average));
        }
        return result;
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
                subjectScores.put(subject.name(), subjectScores.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }
        List<Label> subjectLabels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectScores.entrySet()) {
            subjectLabels.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        subjectLabels.sort(Comparator.naturalOrder());
        return subjectLabels.get(subjectLabels.size() - 1);
    }
}
