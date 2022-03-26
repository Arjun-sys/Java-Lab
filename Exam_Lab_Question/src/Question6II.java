
import java.lang.Math.*;
import java.lang.Number.*;

class Number {

    private double db;

    public Number() {
        db = 63.0;

    }

    public Number(double d) {
        db = d;

    }

    public boolean isZero() {
        if (db == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive() {
        if (db > 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative() {
        if (db < 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isodd() {
        if (db % 2 != 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven() {
        if (db % 2 == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        int i, lastn;
        double a;
        boolean flag;
        a = Math.sqrt(db);
        lastn = (int) a;
        flag = true;
        for (i = 2; i <= lastn; i++) {
            if (db != i) {
                if (db % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAmstrong() {

        int originalNumber, remainder, result = 0;

        originalNumber = (int) db;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == db) {
            return true;
        } else {
            return false;
        }
    }

    public double getFactorial() {
        db = 56;

        int d = 1;
        int a = (int) db;

        for (int i = 1; i <= a; i++) {
            d *= i;
        }
        return d;
    }

    public double getSqrt() {
        double d;
        d = (double) db;
        d = Math.sqrt(d);
        return d;
    }

    public double getSqr() {
        double d;
        d = (double) db;
        d = d * d;
        return d;
    }

    public double sumDigits() {

        int d = 0;
        db = 56;
        while (db != 0) {
            d += db % 10;
            db = db / 10;
        }

        return d;
    }

    public double getReverse() {
        db = 56;
        long d = 0;
        long temp;
        while (db != 0) {
            temp = (long) db % 10;
            d = d * 10 + temp;
            db = (long) db / 10;

        }

        return d;
    }
    public void dispBinary() {
        db = 56.0;

        System.out.println("ByteValue:" + Long.toBinaryString(Double.doubleToLongBits(db)));
    }
    public void listFactors() {
        db = 56;
        System.out.print("Factors of number:");
        for (int i = 1; i <= db; ++i) {
            if (db % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]) {
        Number mynum = new Number();
        System.out.println("isZero " + mynum.isZero());
        System.out.println("isPositive " + mynum.isPositive());
        System.out.println("isNegative " + mynum.isNegative());
        System.out.println("isOdd " + mynum.isodd());
        System.out.println("isEven " + mynum.isEven());
        System.out.println(" isPrime " + mynum.isPrime());
        System.out.println(" isAmstrong " + mynum.isAmstrong());
        System.out.println("getFactorial " + mynum.getFactorial());
        System.out.println("getSqrt " + mynum.getSqrt());
        System.out.println("getSqr " + mynum.getSqr());
        System.out.println("sumDigits " + mynum.sumDigits());
        System.out.println("getReverse " + mynum.getReverse());
        mynum.dispBinary();
        mynum.listFactors();

    }
}
