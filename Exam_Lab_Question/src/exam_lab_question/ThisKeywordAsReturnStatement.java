package exam_lab_question;

class ThisExample {

    String name;
    int age;

    ThisExample getMsg() {
        return this;
    }

    void msg(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello,I am " + name + " and I am " + age + " years old.");
        System.out.println("A program to give the example for ‘this’ keyword as return statement");
    }
}

class ThisKeywordAsReturnStatement {

    public static void main(String args[]) {
        new ThisExample().getMsg().msg("Arjun Shrestha", 22);
    }
}
