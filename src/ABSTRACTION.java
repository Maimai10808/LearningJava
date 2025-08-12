public class ABSTRACTION {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //                   Abstraction is the process of hiding implementation details
        //                   and showing only the essential features.
        //                   Abstract classes CAN'T be instantiated directly.
        //                   Can contain 'abstract' methods (which must be implemented)
        //                   Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}


//public abstract class Shape {
//
//    abstract double area(); // ABSTRACT
//
//    void display(){ // CONCRETE
//        System.out.println("This is a shape");
//    }
//}
//



//public class Circle extends Shape{
//
//    double radius;
//
//    Circle(double radius){
//        this.radius = radius;
//    }
//
//    @Override
//    double area(){
//        return Math.PI * radius * radius;
//    }
//}
//
//public class Triangle extends Shape{
//
//    double base;
//    double height;
//
//    Triangle(double base, double height){
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    double area(){
//        return 0.5 * base * height;
//    }
//}
//
//public class Rectangle extends Shape{
//
//    double length;
//    double width;
//
//    Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    double area(){
//        return length * width;
//    }
//}


/*
 Java 中的 抽象（Abstraction） 和 abstract 关键字。

⸻

1️⃣ 什么是抽象（Abstraction）

定义：

抽象是隐藏实现细节、只向用户暴露必要特性的一种方式。

类比：
	•	教别人开车时，只告诉他油门是加速、刹车是停车，不会打开引擎盖解释发动机原理。
	•	用户只需要接口（功能），不需要知道内部实现细节。

⸻

2️⃣ Java 中的 abstract 类
	•	抽象类：用 abstract 修饰的类。
	•	不能直接实例化（不能 new）。
	•	用作父类，给子类提供：
	•	抽象方法（必须由子类实现）
	•	具体方法（子类直接继承用）

例子：

abstract class Shape {   // 抽象类
    abstract double area();  // 抽象方法（没有方法体）

    public void display() {  // 具体方法（有方法体）
        System.out.println("This is a shape");
    }
}


⸻

3️⃣ 抽象方法
	•	只有方法签名，没有方法体（即不写 {} 实现代码）。
	•	必须在子类中 @Override 实现。

例子：

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    double area() {
        return Math.PI * radius * radius; // 圆面积公式
    }
}


⸻

4️⃣ 例子结构

Shape (抽象类)
 ├── Circle (实现 area 方法)
 ├── Triangle (实现 area 方法)
 └── Rectangle (实现 area 方法)

Shape 抽象类：
	•	抽象方法：

abstract double area();


	•	具体方法：

void display() { System.out.println("This is a shape"); }



Circle 子类：

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

Triangle 子类：

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) { this.base = base; this.height = height; }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

Rectangle 子类：

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }

    @Override
    double area() {
        return length * width;
    }
}


⸻

5️⃣ 抽象类的作用
	•	统一接口：确保所有子类都有某个方法（比如 area()）。
	•	代码复用：具体方法在父类实现，子类直接继承。
	•	限制实例化：防止创建过于泛化的对象（比如直接创建一个 Shape）。

⸻

✅ 总结
	•	abstract class：不能直接 new，只能被继承。
	•	抽象方法：声明没有实现，子类必须实现。
	•	具体方法：有实现，子类可以直接用。
	•	抽象是设计思想，让程序结构更清晰、扩展性更好。

⸻



 */