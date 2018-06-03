package lab5;/*
Конечно я бы мог добавить сюда реализацию Рабинса Миллера,
но он слишком громоздский чтоб так его реализовывать, хотя задача интересна и, возможно я оставлю ее на потом.
Также есть функсия стандартной библиотеки bigInteger  , но я что-то не хочу ее пока использовать,
когда могу написать своё
 */


public class SimpleNumber {

    public SimpleNumber(){

    }

    public boolean test(int n){

        if (n < 2) {
            return false;
        }
        for ( int i=2; i < n; i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


