package session7;

public class Circle extends Shape{
    float area;
    void calculate(float rad){
        area=getPI()*rad*rad;
        System.out.println("Area of circle:"+area);
    }
    public class Rectangle extends Shape{
        float perimeter;
        float length=10;
        void calculate(float width){
            perimeter =2*(length+width);
            System.out.println("perimeter of Rectangle is"+perimeter);
        }
    }
}
