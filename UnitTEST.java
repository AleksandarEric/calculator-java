 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;

 public class CalculatorTest {
    
    
    public void testCalculate() {

        List<Float> numbers = new ArrayList<>(Arrays.asList(7.0f, 3.0f, 5.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+", "*", "-"));

        Calculator.Calculate(numbers, operations);

        float actualResult = Calculator.finalResult;
        float expectedResult = 22;

        if (expectedResult == actualResult){
            System.out.println("Expected result:"+expectedResult+"Acctual result:"+actualResult +"Test succeeded!");
        }else{
            System.out.println("Expected result:"+expectedResult+"Acctual result:"+actualResult+"Test failed!");
        };
    }

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testCalculate();
    }
}

