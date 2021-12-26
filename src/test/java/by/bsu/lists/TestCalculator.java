package by.bsu.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestCalculator {

    @Test
    public  void testFindWordsThatHasAPositive(){
        List<String> input = Arrays.asList("apple","cat","dog");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);

        List<String> expect = Arrays.asList("apple","cat");
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatHasANegative(){
        List<String> input = Arrays.asList("void","english","input");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatHasA(input);

        List<String> expect = Arrays.asList();
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatStartWithCapitalPositive(){
        List<String> input = Arrays.asList("Apple","cat","Dog");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartWithCapital(input);

        List<String> expect = Arrays.asList("Apple","Dog");
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatStartWithCapitalNegative(){
        List<String> input = Arrays.asList("void","english","input");

        TextCalculator calculator = new TextCalculator();
        List<String> result = calculator.findWordsThatStartWithCapital(input);

        List<String> expect = Arrays.asList();
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatGreaterThanXPositive(){
        List<Integer> resultThanX =Arrays.asList(1,2,4,5);

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findWordsThatGreaterThanX(resultThanX,3);

        List<Integer> expect = Arrays.asList(4,5);
        Assert.assertEquals(expect,result);
    }

    @Test
    public  void testFindWordsThatGreaterThanXNegative(){
        List<Integer> resultThanX =Arrays.asList(-100,-50,0,50,100,1000);

        TextCalculator calculator = new TextCalculator();
        List<Integer> result = calculator.findWordsThatGreaterThanX(resultThanX,-70);

        List<Integer> expect = Arrays.asList(-50,0,50,100,1000);
        Assert.assertEquals(expect,result);
    }

}
