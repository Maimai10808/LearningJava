public class Student {

    // 属性

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // 构造方法

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // this 指当前对象

    void study(){
        System.out.println(this.name + " is studying");
    }
}

/*

5️⃣ this 关键字
	•	this 代表当前对象的引用
	•	用来区分属性名和方法参数名重名的情况

	this.name = name;  // 左边是属性，右边是参数

		•	如果你不想用相同名字，也可以改成：

		Student(String n, int a, double g) {
    name = n;
    age = a;
    gpa = g;
}

但通常建议参数名与属性名一致，代码更易读。

6️⃣ 构造方法的特性
	1.	自动调用
当你 new 类名(...) 时，构造方法会被调用，无需手动调用。
	2.	可以重载（Overload）
一个类可以有多个构造方法（参数不同）。

Student(String name) { this.name = name; }
Student(String name, int age) { this.name = name; this.age = age; }

	3.	没有返回类型
即使不写 void。
	4.	可以有默认构造方法
如果你自己写了有参构造方法，Java 就不会自动提供无参构造方法；需要自己写一个：

Student() { }

7️⃣ 构造方法的作用总结
	•	初始化对象属性
	•	提供灵活的对象创建方式
	•	保证对象在创建时就处于有效状态
	•	避免多次重复设置属性



 */