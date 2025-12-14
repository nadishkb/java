class Prime{
    public static void main(String[] args) {
        fun(200);
    }
    static void fun(int Len){
        boolean temp =true;
        for(int i=1;i<=Len;i=i+2,temp=true){
            for(int j=3;j*j<=i;j=j+2){
                if(i%j==0) {temp=false; break;} 
            }
            if(temp) System.out.println(i);
        }
    }

}




//2 3 5 7 11 13 17 19 