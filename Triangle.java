import java.util.Scanner;

class Triangle {

    int height;
    int base;
    String str;
    int circumference ;
    int index;
    
    static int side1;
    static int side2;                            
    
    Triangle(){
        index = -1;
    }

    Triangle(int x, int y){
        height = x;
        base = y;
    }
    Triangle(String x, int y){
        str = str;
        base = y;
    }
    Triangle(int y, String x){
        str = str;
        base = y;
    }
    Triangle(int height, int base, int circumference){
        this.height = height;
        this.base = base;
        this.circumference = circumference;
    }

    double getArea() {
        double area = 1.0 / 2 * (base * height);
        return area;
    }

    double getArea(int scale) {
        double area = 1.0 / 2 * (base * height) * scale;
        return area;
    }
    
    int getPerimeter() {
        int perimeter = side1 + side2 + base ;
        return perimeter;
    }

    public String toString(){
        return "( base: " + base + ", height: " + height + " )";
    }
    
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.height = 12;
        tri.base = 15;
        System.out.println("Triangle 1 after assignment => " + tri);


        Triangle triNew = new Triangle(12,15);
        System.out.println("Triangle 2 after creation => " + triNew);
        triNew.height = 22;
        triNew.base = 25;
        System.out.println("Triangle 2 after creation => " + triNew);
        
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the side one");
            side1 = sc.nextInt();
            System.out.println("Enter the side two");
            side2 = sc.nextInt();
        }

        String.valueOf(side1);
        System.out.println("jhgfjad".toUpperCase());

        System.out.println( "Area of the triangle "+tri.getArea()); 
        System.out.println( "Perimeter of the triangle "+tri.getPerimeter());

        System.out.println("Triangle is : " + tri);
        int[] arr = new int[10];
        System.out.println("Array is at: " + arr);
        System.out.println("String is at: " + tri.str);
        //Arrays

    }
}