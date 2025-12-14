class Substring{
    public static void main(String[] args) {
        fun("Stringop lopl bgtfg hu",9);
    }
    static void fun(String Str,int Len_split){
        int temp=0;
        try {
            for(int i=0; i<Str.length();i=i+Len_split,temp=i){
            System.out.println(Str.substring(i, i+Len_split));        
            }
        } 
        catch (Exception StringIndexOutofBoundsException) {
            System.out.println(Str.substring(temp));
            
        }
        
        
    }
}