package h.w5;

public class HW5 {
    public  static void  main(String[] args){

        person mainEmployee = new person(
                 "Алина",
                 "Александровна ",
                 "Киясова",
                 "Test Manager",
                 "89768878787",
                 120000,
                1996);

        person [] office ={
                mainEmployee,
                new person( "Валера",
                "Иванович ",
                 "Иванов",
                 "Project Manager",
                 "89654566556",
                80000,
                 1986),

                new person("Катя",
                "Сергеевна ",
                        "Пашкщва",
                 "engineer",
                 "89754566545",
                100000,
                 1978),

                new person( "Павел",
                "Алексеевич",
                 "Сурков",
                 "senior developer",
                 "89287055556",
                 120000,
                 1987)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldperson(office,  40);
    }
    private static void getOldperson(person[] office, int year){
        for (int i=0; i < office.length; i++ )
            if (office[i].getAge()>year){
                System.out.println(office[i].getFullInfo());
            }
    }

    private static void  getAllPersonsInOffice(person[] office){
        System.out.println("All person:");
        for (int i=0;  i< office.length; i++)
            System.out.println((i+1) + " " + office[i].getFullInfo());
    }

}
