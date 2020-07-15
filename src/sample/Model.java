package sample;

public class Model {

    public long calculate(long number1,long number2,String operator){

        switch (operator){

            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "*":
            case ".":
                return number1*number2;
            case "/":
                if(number2==0)
                    return 0;
                return number1/number2;

        }
        return 0;

    }

}