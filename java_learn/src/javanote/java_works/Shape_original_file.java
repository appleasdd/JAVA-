package javanote.java_works;
abstract class Shape_test {
    private String shapeName = "";
    public Shape_test(String shapeName){
        this.shapeName = shapeName;
    }
    public String getShapeName(){
        return shapeName;
    }
    public String toString(){
        return "Shape is a " + shapeName;
    }

    public abstract double computeArea();
    public abstract double computePerimeter();
    public abstract double readShapeData();
}
