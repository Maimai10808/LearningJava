public class SUPER {
    public static void main(String[] args) {

        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

    }
}

//public class Person {
//
//    String first;
//    String last;
//
//    Person(String first, String last){
//        this.first = first;
//        this.last = last;
//    }
//
//    void showName(){
//        System.out.println(this.first + " " + this.last);
//    }
//}
//
//public class Student extends Person{
//
//    double gpa;
//
//    Student(String first, String last, double gpa){
//        super(first, last);
//        this.gpa = gpa;
//    }
//
//    void showGPA(){
//        System.out.println(this.first + "'s gpa is: " + this.gpa);
//    }
//}
//
//public class Employee extends Person{
//
//    int salary;
//
//    Employee(String first, String last, int salary){
//        super(first, last);
//        this.salary = salary;
//    }
//
//    void showSalary(){
//        System.out.println(this.first + "'s salary is $" + this.salary);
//    }
//}


/*

 Java 中 super 关键字的用法，主要用在**继承（Inheritance）的场景里，
尤其是在构造方法（Constructor）和方法重写（Method Overriding）**中。
我帮你分成几个重点来理解：

⸻

1️⃣ super 的基本概念
	•	super 代表父类（superclass）。
	•	在继承结构中：
	•	子类（subclass）= 继承父类的属性和方法
	•	父类（superclass）= 提供共有属性和方法
	•	super 主要用途：
	1.	调用父类构造方法（常见）
	2.	调用父类的普通方法（在方法重写时）
	3.	访问父类的属性（当子类中有同名属性时）

⸻

2️⃣ 在构造方法中用 super

如果父类构造方法需要参数，子类必须用 super(...) 显式调用并传递这些参数，否则编译不通过。

例子

class Person {
    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(first + " " + last);
    }
}

class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa) {
        // 调用父类构造方法
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(first + "的 GPA 是 " + gpa);
    }
}


⸻

3️⃣ 如果不写 super(...) 会怎样？
	•	Java 会默认在子类构造方法第一行调用 super()（无参构造）。
	•	如果父类没有无参构造，而你又没显式调用 super(...)，就会报错（视频里出现的警告就是这个原因）。

⸻

4️⃣ 实例演示

视频里有三个类：
	1.	Person（父类）→ 有 first 和 last 属性
	2.	Student（子类）→ 继承 Person 并新增 gpa
	3.	Employee（子类）→ 继承 Person 并新增 salary

因为 Person 的构造方法需要 first 和 last 参数，所以在 Student 和 Employee 构造方法里都必须用：

super(first, last);

这样父类的属性才能被正确初始化。

⸻

5️⃣ 方法重写时的 super

虽然视频主要讲构造方法，但 super 也能在方法重写中调用父类版本的方法：

@Override
void showName() {
    super.showName(); // 调用父类版本
    System.out.println("我是子类的额外输出");
}


⸻

✅ 总结
super 在 Java 中就是一个“直通父类”的关键字，主要作用：
	1.	构造方法中调用父类构造器（必须是第一行）。
	2.	访问父类被隐藏的属性。
	3.	调用父类被重写的方法。

⸻

 */