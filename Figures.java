class Square {
    private double a;
    public Square(double a) {
        setA(a);
    }
    public void setA(double a) {
        if(a > 0) {
            this.a = a;
        } else {
            System.out.println("Сторона должна быть болльше нуля");
        }
    }
    public double getA() {
        return a;
    }
    public double calcArea() {
        return a*a;
    }
    public void print() {
        System.out.println("Фигура: квадрат");
        System.out.println("Сторона: " + getA());
        System.out.println("Площадь: " + calcArea());
    }
}

class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }
    public void setA(double a) {
        if(a > 0) {
            this.a=a;
        } else {
            System.out.println("Сторона а должна быть больше нуля");
        }
    }
    public void setB(double b) {
        if(b > 0) {
            this.b=b;
        } else {
            System.out.println("Сторона а должна быть больше нуля");
        }
    }
    public void setC(double c) {
        if(c > 0) {
            this.c=c;
        } else {
            System.out.println("Сторона а должна быть больше нуля");
        }
    }
    public double calcArea() {
        double res, pp;
        pp = (a + b + c) / 2;
        res = Math.sqrt(pp * (pp - a) * (pp - b) * (pp -c));
        return res;
    }
    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}

    public void print() {
        System.out.println("Фигура: треугольник");
        System.out.println("Сторона а: " + getA());
        System.out.println("Сторона b: " + getB());
        System.out.println("Сторона c: " + getC());
        System.out.println("Площадь: " + calcArea());
    }
}

public class Figures {
    public static void main(String []args){
        Square circle1 = new Square(5);
        Triangle trap1 = new Triangle(4, 3, 5);
        circle1.print();
        trap1.print();
    }
}