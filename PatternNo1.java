class PatternNo1{
    public static void main(String[] arg){
        System.out.println("Pattern program number one");
        for ( int i = 0; i < 5; i++){
            for ( int j = 0 ; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}