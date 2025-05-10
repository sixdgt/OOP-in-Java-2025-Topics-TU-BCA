package main;

public class Student {

    String name;
    double marks[];
    double average;
    String grade;

    public double getAverage() {
        for (int i = 0; i < marks.length; i++) {
            this.average = this.average + marks[i];
        }
        return this.average;
    }

    public String displayGrade(double average) {
        if ((average <= 100) && (average >= 60)) {
            this.grade = "A";
            return this.grade;
        } else if ((average <= 59.99) && (average >= 40)) {
            this.grade = "B";
            return this.grade;
        } else {
            this.grade = "C";
            return this.grade;
        }
    }
}
