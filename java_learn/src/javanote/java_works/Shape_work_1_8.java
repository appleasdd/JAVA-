package javanote.java_works;
import java.util.Scanner;//導入函數Scanner
abstract class Shape{//建立抽象類別Shape
    private String shapeName = "";//建立字串
    public Shape(String shapeName){//建立Shape方法
        this.shapeName = shapeName;
    }
    public String getShapeName(){//建立getShapeName方法
        return shapeName;
    }
    public String toString(){//建立toString方法
        return "Shape is a " + shapeName;
    }

    public abstract double computeArea();//建立computeArea方法
    public abstract double computePerimeter();//建立computePerimeter方法
    public abstract void readShapeData();//建立readShapeData方法
}
class Circle extends Shape{//Circle覆寫Shape
    private double radius = 0;//建立半徑變數
    public Circle(){//建立Circle方法
        super("Circle");//指針super "Circle"
    }
    public Circle(double radius){//多載
        super("Circle");
        this.radius = radius;
    }
    public double getRadius(){//建立getRadius方法
        return radius;//回傳radius
    }
    public double computeArea(){//覆寫
        return Math.PI*(radius * radius);//回傳圓面積
    }
    public double computePerimeter(){//覆寫
        return Math.PI * (radius * 2);//回傳圓周長
    }
    public void readShapeData(){//覆寫
        Scanner getSc = new Scanner(System.in);//建立掃描器
        System.out.println("Enter the radius of the Circle");//印出
        radius = getSc.nextDouble();//讀入半徑
        getSc.close();//關閉掃描器
    }
    public String toString(){//覆寫
        return super.toString() + ": radius is " + radius;//回傳資料
    }
}
public class Shape_work_1_8{//建立Shape_work的類別
    public static void main(String[] args){//建立main方式
    Shape myShape;//建立變數
    double perimeter;//建立變數
    double area;//建立變數
    myShape = getShape();//讀入資料
    myShape.readShapeData();//執行
    perimeter = myShape.computePerimeter();//執行
    area = myShape.computeArea();//執行
    displayResult(myShape,area,perimeter);//執行
    System.exit(0);//退出這個程式
    }
    public static Shape getShape(){//建立getShape函式
        return new Circle();//回傳資料
    }
    public static void displayResult(Shape myShape , double area , double perim){//建立displayResult方式
        System.out.println(myShape);//印出
        System.out.printf("The area is %.2f%nThe perimeter is %.2f%n",area,perim);//印出
    }
}

