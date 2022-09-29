package by.itstep.sviridanton.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsManagerTest {

    @Test
    public void testCalculatedAvgStudentMarkPositive() {
        // AAA:

        // int[] marks = new int[]{4, 5, 5, 9, 8};  // содание и инициализация массива нужными данными
        // new int[0]; - создание пустого массива(прим. заглушка вывода)
//A
        int[] marks = {8, 8, 9, 8};
        double expected = 8.25;
//A
        double actual = StudentsManager.CalculatedAvgStudentMark(marks);
//A
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCalculatedAvgStudentMarkWithEmptyObject() {
 //A
        int[] marks = {};   // создание пустого массима
        double expected = -1;
//A
        double actual = StudentsManager.CalculatedAvgStudentMark(marks);
//A
        assertEquals(expected, actual, 0);
    }
    @Test
    public void testCalculatedAvgStudentMarkWithNull() {
//A
        int[] marks = null;
        double expected = -1;
//A
        double actual = StudentsManager.CalculatedAvgStudentMark(marks);
//A
        assertEquals(expected, actual, 0);
    }


}
