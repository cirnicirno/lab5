package lab5;


public class NumberInput {

    public NumberInput(){

    }

    public int write (){

        int number;
        NumberScanner scanner = new NumberScanner();
        while(true) {
            System.out.print("Введите целое число: ");
            if (scanner.isIntNumber()) {
                number = scanner.getNumber();
                break;
            }


            System.out.println("Извините, вы ввели не целое число!");
        }


        return number;
    }

}
