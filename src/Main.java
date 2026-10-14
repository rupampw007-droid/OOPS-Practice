import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       JudgeAnalytics a1 = JudgeAnalytics.getJudgeAnalytics();
       JudgeAnalytics a2 = JudgeAnalytics.getJudgeAnalytics();
    }
}


// Eager Loading
//class  JudgeAnalytics {
//    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
//
//    private JudgeAnalytics() {}
//
//    public static   JudgeAnalytics getJudgeAnalytics() {
//        return judgeAnalytics;
//    }
//}


//Lazy Loading
class JudgeAnalytics {
    private static JudgeAnalytics judgeAnalytics;

    private JudgeAnalytics() {}

    public static JudgeAnalytics getJudgeAnalytics() {
        if(judgeAnalytics == null) {
            judgeAnalytics = new JudgeAnalytics();
        }
        return judgeAnalytics;
    }
}

class MessagePrinter {
    public void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        MessagePrinter p = new MessagePrinter();
        p.printName("Rupam");
    }
}

class Calculator {
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public int calculateDifference(int a, int b) {
        return Math.abs(a-b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int x = c.calculateSum(2,3);
        int y = c.calculateDifference(2,3);
        System.out.println(x + "," + y);
    }
}

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public Employee(String name, int id) {
        this.id = id;
        System.out.println("Name: " + name);
        System.out.println("Id " + id);
    }

    public Employee(String name, int id, String department) {
        this.id = id;
        this.name = name;
        this.department = department;

        System.out.println("Name: " + name);
        System.out.println("Id " + id);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rupam", 3, "JLSJDf");
    }
}

class Biggest {
    private int [] n;
    public Biggest(int [] n) {
        this.n = n;
    }

    public void display() {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if(n[i] > l) {
                l = n[i];
            }
        }
        System.out.println("The maximum value of the array is: " + l);
    }

    public static void main(String[] args) {
        int [] arr = {4,1,4,6,3,6,7,34,2,5,2};
        Biggest b = new Biggest(arr);
        b.display();
    }
}

class Rectangle {
    private int length = 1;
    private int width  = 1;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void calculateArea() {
     int area = length*width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(5);
        rec.setWidth(4);

        System.out.println(rec.getLength());
        System.out.println(rec.getWidth());

        rec.calculateArea();
    }
}