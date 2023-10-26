import org.example.AverageCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AverageCalculatorTest {
    private AverageCalculator averageCalculator;

    @Before
    public void setup() {
        averageCalculator = new AverageCalculator();
    }

    // Тест для сравнения, когда среднее первого списка больше
    @Test
    public void testCompareAverage_FirstListGreater() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(10);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(8);

        String result = averageCalculator.compareAverage(list1, list2);

        Assert.assertEquals("Первый список имеет большее среднее значение", result);
    }

    // Тест для сравнения, когда среднее второго списка больше
    @Test
    public void testCompareAverage_SecondListGreater() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(10);

        String result = averageCalculator.compareAverage(list1, list2);

        Assert.assertEquals("Второй список имеет большее среднее значение", result);
    }

    // Тест для сравнения, когда средние равны
    @Test
    public void testCompareAverage_AveragesEqual() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(2);

        String result = averageCalculator.compareAverage(list1, list2);

        Assert.assertEquals("Средние значения равны", result);
    }

    // Тест для вычисления среднего пустого списка
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverage_EmptyList() {
        List<Integer> list = new ArrayList<>();

        averageCalculator.calculateAverage(list);
    }

    // Тест вычисления среднего в списке
    @Test
    public void testCalculateAverage() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);

        double expectedAverage = 5.0;

        double actualAverage = averageCalculator.calculateAverage(list);

        Assert.assertEquals(expectedAverage, actualAverage, 0.0001);
    }
}
