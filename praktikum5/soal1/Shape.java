package praktikum5.soal1;

public abstract class Shape {
    protected String shapeName;
    protected abstract double area();
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString(){
        return this.shapeName;
    }
}
