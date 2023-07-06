class Rectangle {
    int length;
    int width;
    int area, perimeter;
    int getArea() {
        int area = length * width;
        return area;
    }
    // int getPerimeter() {
    //     int num = 2;
    //     int perimeter = num * ( length + width);
    //     return perimeter;
    // }
    
    // void populateArea() {
    //     int area = length * width;
    //     this.area = area;
    // }

    void populatePerimeter() {
        int num = 2;
        perimeter = num * ( length + width);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 10;
        rec.width = 20;
        rec.populatePerimeter();
        System.out.println("Area of the rectangle is "+ rec.getArea());
        System.out.println();
        System.out.println("Perimeter of the rectangle is "+ rec.perimeter);
    }
}