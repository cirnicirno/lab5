package lab5;

public class CoreSimpleNumbers {

    public void CoreSimpleNumber(){

        NumberInput numberInput = new NumberInput();
        int number = numberInput.write();

        SimpleNumber simpleNumber = new SimpleNumber();
        if (simpleNumber.test(number)){
            System.out.println("Вы ввели простое число!");
            System.out.print("Другие простые числа от 0 до " + number + ": ");
            OtherSimple otherSimple = new OtherSimple();
            otherSimple.print(number);

        } else {
            System.out.println("Вы введи не простое число!");
        }
    }


}
