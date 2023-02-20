package dominio;

public class ej2_13 {


    public static int fib13(int n) {
        if(n<2) {
            return n;
        }else {
            return fib13(n-1)+fib13(n-2);
        }

    }
    public static int fib12(int n) {
        if(n<2) {
            return n;
        }else {
            return fib12(n-1)+fib12(n-2);
        }

    }

    public static boolean equals(double num) {
        double n13=fib13(13);
        double n12=fib13(12);
        double cociente=n13/n12;
        if(num==cociente) {
            return true;
        }else {
            return false;
        }
    }

}

