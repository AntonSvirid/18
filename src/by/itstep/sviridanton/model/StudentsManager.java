package by.itstep.sviridanton.model;

public class StudentsManager {
   // public static final int STUDENT_COUNT = 5;

    public static double CalculatedAvgStudentMark(int[] marks) {
        double s = 0;

        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }
        //   double avg = (mark1 + mark2 + mark3 + mark4 + mark5) * 1.0 / STUDENT_COUNT;

        return s / marks.length;
    }
}
