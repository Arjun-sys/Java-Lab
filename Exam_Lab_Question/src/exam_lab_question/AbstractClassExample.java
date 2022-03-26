package exam_lab_question;

abstract class Bank {

    abstract int getRateOfInterest();
}

class NICAisa extends Bank {

    int getRateOfInterest() {
        return 4;
    }
}

class KumariBank extends Bank {

    int getRateOfInterest() {
        return 5;
    }
}

class AbstractClassExample {

    public static void main(String args[]) {
        Bank b;
        b = new NICAisa();
        System.out.println("Interest rate of NIC Asia Bank is: " + b.getRateOfInterest() + " %");
        b = new KumariBank();
        System.out.println("Interest rate of Kumari Bank is: " + b.getRateOfInterest() + " %");
    }
}
