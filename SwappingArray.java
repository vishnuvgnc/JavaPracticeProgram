class SwappingArray {
    public static void main(String[] arg){
        int a = 8;
        int b = 9;       
        int temp;
        System.out.println(" Before swapping element ");
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);

        temp = b;
        b = a;
        a = temp;
        System.out.println(" After swapping element ");
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);

    }    
}
