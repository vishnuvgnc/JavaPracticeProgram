class SchoolManagement{
    static int roll_number;
    string name;
     static void display(){
        System.out.println("Student portal sample " + SchoolManagement.roll_number);
     }
     public static void main(String[] args) {
               SchoolManagement sc = new SchoolManagement();
               sc.roll_number = 21;
               display();
     }
}