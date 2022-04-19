public class HomW2 {

    public static void main(String[] args) {

        System.out.println("Результат 1 >" + within10and20(6, 8));



        isPositiveOrNegative(  7);


        System.out.println("result" +isNegative( 17));


        printWordNTimes("Hello string",  7);


        int currentYear = 2021;
        System.out.println("Year" + currentYear + "is leap? >" + isLeapYear(currentYear));
    }

    public static boolean within10and20(int x, int y) {
        return (x + y <= 20) && (x + y > +10);

    }


    public static void isPositiveOrNegative(int variable) {
        if (variable <= 0) {
            System.out.println(variable + "Is positive");
        } else {
            System.out.println(variable + "Is negative");
        }

    }

    public static boolean isNegative(int variable) {
        if (variable <= 0) {
            System.out.println("true");
        }
        return variable <= 0;
    }



    public static void  printWordNTimes(String value, int count){
        for (int i= 1; i<= count; i++) {
            System.out.println("String #" + i + ":" + value);}

    }





    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0);




    }


}

