class Round{
    public static void main(String[] args) {
        fun(14,7);
    }

    static void fun(int a,int b){
        System.out.println((a/b)+((a%b==0)?0:1));
    }
}