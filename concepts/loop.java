class Looop{
    public static void main(String[] args) {
        //if else
        int a = 0xef;
        if(a<100){
            System.err.println("a < 100");
        }
        else if (a>100) {
            System.err.println(" a > 1000");
        }
        else {
            System.err.println("unknown");
        }


        //ternary
        int oct =15;
        boolean result = (oct==15)?false:true;
        System.err.println(result);

        

        

        //while
        boolean t_bool = true;
        loop1: while(t_bool){
            //for
            loop2: for (int i = 0; i <= 2; i++) {
                 mySwitch(i);
            }
            t_bool = false;
        }
        // do while
        do{
            System.err.println(a);
            a=a-50;} 
            while(a>100);
           
        




    }

    static void mySwitch(int day){
        //switch

        loop3: switch (day){
            case 1 -> {System.err.println("monday"); break loop3;}
            case 2 -> System.err.println("tuesday");
            default -> System.err.println("lol");
        }
    }
}