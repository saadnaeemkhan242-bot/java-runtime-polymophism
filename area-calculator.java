package area_over;
//Parent class
public class Shape {

    //Method that will be Overriden
    void calculateArea(){
        System.out.println("---Area Calculation---");
    }     
}

//Child class 1
public class Circle extends Shape {
    double pi = 3.14;
    double radius;
    
Circle(double r){
        
     this.radius = r;
    }

    //Overriding method
@Override
void calculateArea(){
        
    //Formula: πr²
    double Area = pi * radius * radius;
        
    System.out.println("\nArea of Circle is : " +Area);
    }   
}

//Child class 2
public class Rectangle extends Shape{
    
    double length;
    double width;
    
Rectangle(double l, double w){
    this.length = l;
    this.width = w;
}    
//Overriding method
@Override
void calculateArea(){
    
    //Formula length * width
    double Area = length * width;
    
    System.out.println("\nArea of Rectangle is : " +Area);    
}
}


//Child class 3
public class Triangle extends Shape {
    
    double base;
    double height;
    
Triangle(double b, double h){
    this.base = b;
    this.height = h;
}    

//Overriding method
@Override
void calculateArea(){
    
    //Formula: 1/2 * base * height
    double Area = 0.5 * base * height;
    
    System.out.println("\nArea of Triangle is : " +Area);    
}
}

//Main class
public class Main {

    public static void main(String[] args) {
        
        //Parent referance, child object
        Shape s = new Shape();
        Shape s1 = new Circle(4.2);
        Shape s2 = new Rectangle(3.4, 5.5);
        Shape s3 = new Triangle(3.2, 7.6);
        
      
        //Runtime Polymorphism
        s.calculateArea();
        s1.calculateArea();
        s2.calculateArea();
        s3.calculateArea();
        
    }
   } 
