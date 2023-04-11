package bai1;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a:");
        double a =sc.nextDouble();
        System.out.println("Nhập cạnh b:");
        double b = sc.nextDouble();
        System.out.println("Nhập cạnh c:");
        double c = sc.nextDouble();
        triangleExample(a,b,c);

    }
    public static void triangleExample(double a,double b,double c){
        try {
            if(a<=0 || b<=0 || c<=0){
                throw new IllegalTriangleException("độ dài phải lớn hơn 0.");
            }
            if(a+b<c || a+c<b || b+c<a){
                throw new IllegalTriangleException("độ dài 2 cạnh phải lớn hơn 2 cạnh còn lại.");
            }
            System.out.println("3 số hợp lệ");
        } catch (IllegalTriangleException e) {
            System.out.println("Error -->"+ e.getMessage());
        }
    }


}
// tạo lớp kế thừa
 class  IllegalTriangleException extends Exception{
    public IllegalTriangleException(String m){
        super(m);
    }
}