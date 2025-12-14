class Amstrong{
    public static void main(String[] args) {
    //Amstrong_calculator(153);
    for (int i = 0; i < 2000; i++) {
        int result = Lucky_number(i);
        if(result%9==0 && result!=0) System.out.println("Lucky numbers "+ i +"");
    }
    
    
        
    }
    static void Amstrong_calculator(int ip){
        int temp = ip;
        int result=0;
        while(temp>0){
            result = (int) (result + Math.pow((temp%10),3)) ;
            temp = temp/10;
        }
        if(result==ip) System.out.println("Amstrong"); else System.out.println("Not Amstrong");
    }

    static int Lucky_number(int ip){
        int result =0,evenDigit=0;
        String s = String.valueOf(ip);
        if(s.length()%2==0){
            while(ip>0){
            evenDigit = (evenDigit*10) + ip%10;
            ip = ip/100;
            }
        }
        else{
            while(ip>0){
            evenDigit = evenDigit + (ip%100)/10;
            ip = ip/100;
        }
        }

        while(evenDigit>0){
            result= result + (int) Math.pow((evenDigit%10),2);
            evenDigit = evenDigit/10;
        }
        return result;
        

    }
}
