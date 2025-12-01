class Literal_{
    public static void main(String[] args) {
        //integer Literal
        int bin = 0b101;        //binary
        int dec = 198;         //decimal
        int oct = 0565;         //octal
        int hex = 0x234;        //hexa decimal
        System.out.println(bin+"_" + dec +"_" + oct + "_" +hex);
        
        //floating point literal
        float flo = 5.6f;   //float
        double dou = 5.6;  //doubl
        double ep = 3e2;        //epsilion
        System.out.println(flo + "_" + dou + "_" + ep);

        //String literal "Helo Joe"
        //character literal 
        String str = "\n-1-\n-2-\n-3-";        //new line
        System.out.println(str);  
        char uni = '\u9999';              //unicode
        System.out.println(uni); 

        //null literal
        @SuppressWarnings("unused")
        String a1 = null;   //refrence address
        //char a = null;❌   // primitive data types stores actual values not address like class and objects
    }
}