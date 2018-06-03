package lab5;

public class OtherSimple {

    public OtherSimple(){

    }

    public void print(int maxNumber){

        SimpleNumber simpleNumber = new SimpleNumber();

        for (int i=2; i < maxNumber; i++){

            if (simpleNumber.test(i)){

                System.out.println(i);

            }


        }
    }



}
