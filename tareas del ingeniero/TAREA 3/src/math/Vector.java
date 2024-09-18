package math;

public class Vector {
    private int x;
    private int y;

 
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

  
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

  
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

  
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

  
    public Vector multiply(int scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}