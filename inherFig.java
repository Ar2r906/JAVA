package inherFig;

abstract class Figure1 {
    protected double param1;
    private String name; 

    public Figure1(String name, double param1) {
        this.name = name;
        setParam1(param1);
    }

    public void setParam1(double param1) {
        if(param1 > 0) {
            this.param1 = param1;
        } else {
            System.out.println("Значение параметра должно быть больше нуля");
            System.exit(0);
        }
    }

    public String getName() {
        return name;
    }

    public double getParam1() {
        return param1;
    }

    public abstract double calcArea();
}

abstract class Figure2 extends Figure1 {
    protected double param2;

    Figure2(String name, double param1, double param2) {
        super(name, param1);
        this.param2 = param2;
    }

    public void setParam2(double param2) {
        if(param2 > 0) {
            this.param2 = param2;
        } else {
            System.out.println("Значение параметра должно быть больше нуля");
            System.exit(0);
        }
    }
    
    public double getParam2() {
        return param2;
    }

    @Override
    public abstract double calcArea();
}

abstract class Figure3 extends Figure2 {
    protected double param3;

    Figure3(String name, double param1, double param2, double param3) {
        super(name, param1, param2);
        this.param3 = param3;
    }

    public void setParam3(double param3) {
        if(param3 > 0) {
            this.param3 = param3;
        } else {
            System.out.println("Значение параметра должно быть больше нуля");
            System.exit(0);
        }
    }

    public double getParam3() {
        return param3;
    }
    
    @Override
    public abstract double calcArea();
}

class Square extends Figure1 {
    public Square(double param1) {
        super("Квадрат", param1);
    }

    @Override
    public double calcArea() {
        return getParam1() * getParam1();
    }
    
    public void printInfo() {
        System.out.println("Фигура: " + getName());
        System.out.println("Параметр 1: " + getParam1());
        System.out.println("Площадь :" + calcArea());
    }
}

class Triangle extends Figure3 {
    public Triangle(double param1, double param2, double param3) {
        super("Треугольник", param1, param2, param3);
    }

    @Override 
    public double calcArea() {
        double res, pp;
        pp = (param1 + param2 + param3) / 2;
        res = Math.sqrt(pp * (pp - param1) * (pp - param2) * (pp -param3));
        return res;
    }

    public void printInfo() {
        System.out.println("Фигура: " + getName());
        System.out.println("Параметр 1: " + getParam1());
        System.out.println("Параметр 2: " + getParam2());
        System.out.println("Параметр 3: " + getParam3());
        System.out.println("Площадь :" + calcArea());
    }
}

public class inherFig {
    public static void main(String[] args) {
        Square sq = new Square(5);
        sq.printInfo();
        Triangle tr = new Triangle(4, 5, 3);
        tr.printInfo();
    }
}
