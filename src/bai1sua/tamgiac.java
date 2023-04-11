package bai1sua;

public class tamgiac {
    private double a,b,c;

    public tamgiac(double a, double b, double c)throws IllegalTriangleException {
        if(a<=0 || b<=0 ||c<=0)throw new  IllegalTriangleException("canh phai lon hon 0");
        if(a+b<c || a+c<b || b+c<a)throw new IllegalTriangleException("canh không hợp lệ");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
