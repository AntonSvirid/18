package by.itstep.sviridanton.controller;

import by.itstep.sviridanton.model.StudentsManager;
import by.itstep.sviridanton.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of student's: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        System.out.print("Input student's marks: ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

//          массив выше - замена инструкций ниже
//        int mark1 = scanner.nextInt();
//        int mark2 = scanner.nextInt();
//        int mark3 = scanner.nextInt();
//        int mark4 = scanner.nextInt();
//        int mark5 = scanner.nextInt();

        double avg = StudentsManager.CalculatedAvgStudentMark(marks);

        String msg = String.format("Student's average mark is %.2f", avg);

        Printer.print(msg);
    }
}
