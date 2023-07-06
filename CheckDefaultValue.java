class CheckDefaultValue{
    
     static boolean val1;
    char val2;
    float val3;
    double val4;
    int val5;
    short val6;
    void print(){
        System.out.println();
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);

    }
    
    public static void main(String[] args) {
       

        CheckDefaultValue tri = new CheckDefaultValue();
        tri.print();
        System.out.println(val1);
    }
}