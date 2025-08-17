public class COMPOSITION {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //                            For example, an Engine is "part of" a Car.
        //                            Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}

public class Car {

    String model;
    int year;
    Engine engine;

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}

public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}


/*
好的 👍 我来帮你清晰地讲解一下 聚合（Aggregation） 和 组合（Composition） 在 Java 编程中的用法区别。

⸻

🟦 一、共同点
	•	都是 对象之间的关联关系，即 “has-a”。
	•	都表示 一个对象包含另一个对象。
	•	都可以用来构建复杂对象。

⸻

🟩 二、主要区别

特点	聚合（Aggregation）	组合（Composition）
关系强度	弱关系（松散耦合）	强关系（紧密耦合）
生命周期	部分和整体 独立：整体删除，部分仍然存在	部分和整体 绑定：整体删除，部分随之消失
实现方式	整体类 引用传入的对象	整体类 在内部创建部分对象
例子	图书馆（Library）有书（Books），但书可以单独存在	汽车（Car）有发动机（Engine），发动机依赖于汽车
UML 表示	空心菱形（Aggregation）	实心菱形（Composition）


⸻

🟨 三、代码示例对比

1. 聚合（Aggregation）

class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    Book[] books;  // 引用外部传入的 Book
    Library(Book[] books) {
        this.books = books;
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Spring Boot");
        Book[] books = {b1, b2};

        Library lib = new Library(books);
        // 删除 Library，b1 和 b2 依然存在
    }
}

👉 说明：Library 只是“拥有”书，书本身可以在图书馆之外独立存在。

⸻

2. 组合（Composition）

class Engine {
    String type;
    Engine(String type) { this.type = type; }
    void start() { System.out.println("Engine starts..."); }
}

class Car {
    Engine engine; // Car 内部创建 Engine
    Car(String type) {
        this.engine = new Engine(type);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V8");
        car.engine.start();
        // 删除 car 对象 → engine 也随之消失
    }
}

👉 说明：Car 负责创建并管理 Engine 的生命周期。

⸻

🟥 四、如何选择？
	•	用聚合（Aggregation）：当部分对象可以在整体之外继续存在（弱依赖）。
	•	例子：一个大学有很多学生，但学生可以独立存在。
	•	用组合（Composition）：当部分对象必须依赖整体存在（强依赖）。
	•	例子：人有心脏，没有人也就没有心脏。

⸻

✅ 总结一句话：
	•	聚合：整体和部分松耦合，部分可独立存在。
	•	组合：整体和部分强耦合，部分随整体消亡。

⸻

要不要我帮你整理一份 常见场景下该用聚合还是组合的速查表（比如：公司–员工，房子–房间，电脑–CPU 等）？

 */