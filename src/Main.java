public class Main {
    public static void main(String[] args) {
        Animal cow1= new Cow(40,8,'F',"Helly");
        Animal cow2= new Cow(45,6,'F',"Molly");
        Animal cow3= new Cow(35,3,'M',"Fred");
        Animal cow4= new Cow(38,9,'F',"Jenny");
        Animal cow5= new Cow(44,10,'M',"Man");


        Animal sheep1=new Sheep(15,4,'f',"Sally");
        Animal sheep2=new Sheep(17,8,'f',"Fally");
        Animal sheep3=new Sheep(10,2,'M',"Jef");

        Animal horse1=new Horse(15,40,'M',"Jif");
        Animal horse2=new Horse(10,38,'F',"Jenni");

        Animal[] cows={cow1, cow2,cow3};
        Animal [] cows1={cow4,cow5};
        Animal[] sheeps={sheep1,sheep2};
        Animal[] sheeps1={sheep3};
        Animal [] horses={horse1};
        Animal [] horses1={horse2};

        Farm farm= new Farm("Biskek",cows,sheeps,horses,"Abd");
        Farm farm1= new Farm("Biskek",cows1,sheeps1,horses1,"ccd");

        System.out.println();
        System.out.println(farm);
        System.out.println();
        System.out.println(farm1);




    }


    }
