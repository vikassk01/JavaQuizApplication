package quizapplication;
import java.util.Scanner;

public class QuizApplication{

    int amount = 0;
    int ll = 3;
    int ap = 1;
    int ff = 1;
    int sk = 1;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QuizApplication obj = new QuizApplication();

        if (!obj.q1()) return;
        if (!obj.q2()) return;
        if (!obj.q3()) return;
        if (!obj.q4()) return;
        if (!obj.q5()) return;
        if (!obj.q6()) return;
        if (!obj.q7()) return;
        if (!obj.q8()) return;
        if (!obj.q9()) return;
        if (!obj.q10()) return;

        System.out.println("You won " + obj.amount);
    }

    boolean q1() {
        System.out.println("Q1 (Reward 1000): Which keyword is used to define a class in Java?");
        System.out.println("1.class \n2.define \n3.struct \n4.object\n5.Lifeline");

        int z = sc.nextInt();

        if (z == 1) {
            amount += 1000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else if (z == 5) {
            if (ll > 0) {
                ll--;

                System.out.println("1.50-50 \n2.Audience Poll \n3.Skip");
                int ch = sc.nextInt();

                if (ch == 1 && ff > 0) {
                    ff--;
                    System.out.println("Options left: 1.class 3.struct");
                    return q1();

                } else if (ch == 2 && ap > 0) {
                    ap--;
                    System.out.println("Audience suggests option 1");
                    return q1();

                } else if (ch == 3 && sk > 0) {
                    sk--;
                    return true;

                } else {
                    return q1();
                }
            }
            return q1();

        } else {
            System.out.println("Your answer is wrong");
            amount = 0;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q2() {
        System.out.println("\nQ2 (Reward 2000): Which method is the entry point of Java program?");
        System.out.println("1.start() \n2.main() \n3.run() \n4.init()\n5.Lifeline");

        int z = sc.nextInt();

        if (z == 2) {
            amount += 2000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else if (z == 5) {
            if (ll > 0) {
                ll--;

                System.out.println("1.50-50 \n2.Audience Poll \n3.Skip");
                int ch = sc.nextInt();

                if (ch == 1 && ff > 0) {
                    ff--;
                    System.out.println("Options left: 2.main() 1.start()");
                    return q2();

                } else if (ch == 2 && ap > 0) {
                    ap--;
                    System.out.println("Audience suggests option 2");
                    return q2();

                } else if (ch == 3 && sk > 0) {
                    sk--;
                    return true;

                } else {
                    return q2();
                }
            }
            return q2();

        } else {
            System.out.println("Your answer is wrong");
            amount = 0;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q3() {
        System.out.println("\nQ3 (Reward 5000): Which of these is not a Java data type?");
        System.out.println("1.int \n2.float \n3.boolean \n4.string \n5.Lifeline");

        int z = sc.nextInt();

        if (z == 4) {
            amount += 5000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else if (z == 5) {
            if (ll > 0) {
                ll--;

                System.out.println("1.50-50 \n2.Audience Poll \n3.Skip");
                int ch = sc.nextInt();

                if (ch == 1 && ff > 0) {
                    ff--;
                    System.out.println("Options left: 4.string 1.int");
                    return q3();

                } else if (ch == 2 && ap > 0) {
                    ap--;
                    System.out.println("Audience suggests option 4");
                    return q3();

                } else if (ch == 3 && sk > 0) {
                    sk--;
                    return true;

                } else {
                    return q3();
                }
            }
            return q3();

        } else {
            System.out.println("Your answer is wrong");
            amount = 0;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q4() {
        System.out.println("\nQ4 (Reward 10000): Which concept allows multiple methods with same name?");
        System.out.println("1.Inheritance \n2.Polymorphism \n3.Encapsulation\n4.Abstraction \n5.Lifeline");

        int z = sc.nextInt();

        if (z == 2) {
            amount += 10000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else if (z == 5) {
            if (ll > 0) {
                ll--;

                System.out.println("1.50-50 \n2.Audience Poll \n3.Skip");
                int ch = sc.nextInt();

                if (ch == 1 && ff > 0) {
                    ff--;
                    System.out.println("Options left: 2.Polymorphism 1.Inheritance");
                    return q4();

                } else if (ch == 2 && ap > 0) {
                    ap--;
                    System.out.println("Audience suggests option 2");
                    return q4();

                } else if (ch == 3 && sk > 0) {
                    sk--;
                    return true;

                } else {
                    return q4();
                }
            }
            return q4();

        } else {
            System.out.println("Your answer is wrong");
            amount = 0;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q5() {
        System.out.println("\nQ5 (Reward 20000): Which keyword is used to inherit a class?");
        System.out.println("1.implement \n2.extends \n3.inherit \n4.super\n5.Lifeline");

        int z = sc.nextInt();

        if (z == 2) {
            amount += 20000;
            System.out.println("Your answer is correct");
            System.out.println("Safe point 20000 secured");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 0;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q6() {
        System.out.println("\nQ6 (Reward 40000): Which package contains Scanner class?");
        System.out.println("1.java.io \n2.java.util \n3.java.lang \n4.java.net");

        int z = sc.nextInt();

        if (z == 2) {
            amount += 40000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 20000;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q7() {
        System.out.println("\nQ7 (Reward 80000): Which keyword is used for inheritance?");
        System.out.println("1.super \n2.this \n3.extends \n4.final");

        int z = sc.nextInt();

        if (z == 3) {
            amount += 80000;
            System.out.println("Your answer is correct");
            System.out.println("Safe point 80000 secured");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 20000;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q8() {
        System.out.println("\nQ8 (Reward 160000): Which collection allows duplicate elements?");
        System.out.println("1.Set \n2.Map \n3.List \n4.Tree");

        int z = sc.nextInt();

        if (z == 3) {
            amount += 160000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 80000;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q9() {
        System.out.println("\nQ9 (Reward 320000): Which keyword is used to handle exceptions?");
        System.out.println("1.try \n2.catch \n3.throw \n4.finally");

        int z = sc.nextInt();

        if (z == 1) {
            amount += 320000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 80000;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }

    boolean q10() {
        System.out.println("\nQ10 (Reward 700000): Which JVM component executes bytecode?");
        System.out.println("1.Compiler \n2.Interpreter \n3.Loader \n4.Garbage Collector");

        int z = sc.nextInt();

        if (z == 2) {
            amount += 700000;
            System.out.println("Your answer is correct");
            System.out.println("Amount in wallet: " + amount);
            return true;

        } else {
            System.out.println("Your answer is wrong");
            amount = 80000;
            System.out.println("Amount in wallet: " + amount);
            return false;
        }
    }
}