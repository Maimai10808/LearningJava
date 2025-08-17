public class POLYMORPHISM {
    public static void main(String[] args) {

        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.
        //                               Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

//public class Car extends Vehicle{
//
//    @Override
//    void go(){
//        System.out.println("You drive the car");
//    }
//}
//public class Bike extends Vehicle{
//
//    @Override
//    void go(){
//        System.out.println("You ride the bike");
//    }
//}
//public class Boat extends Vehicle{
//
//    @Override
//    void go(){
//        System.out.println("You sail the boat");
//    }
//}


/*
好的，我帮你把这个 Java 多态 (Polymorphism) 的内容整理成清晰易懂的讲解，方便你快速理解。

⸻

1️⃣ 什么是多态（Polymorphism）
	•	词源：
	•	poly = “多”
	•	morph = “形态”
	•	意思是 一个对象可以有多种形态。
	•	编程里的含义：
	•	一个对象不仅能作为它自己（本类的类型）来使用，还能作为父类或接口类型来使用。
	•	用父类或接口引用指向子类对象，可以让代码更灵活。

例子：

Car car = new Car(); // Car 类型
Vehicle v = new Car(); // Car 也能当作 Vehicle 使用


⸻

2️⃣ 多态的前提条件
	1.	继承（Inheritance） 或 实现接口（implements）
	2.	方法重写（Override） —— 子类必须实现（或重写）父类/接口的方法
	3.	父类引用指向子类对象

Vehicle v = new Car();

⸻

3️⃣ 演示代码（抽象类实现多态）

abstract class Vehicle {
    abstract void go(); // 抽象方法
}

class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("You drive the car");
    }
}

class Bike extends Vehicle {
    @Override
    void go() {
        System.out.println("You ride the bike");
    }
}

class Boat extends Vehicle {
    @Override
    void go() {
        System.out.println("You sail the boat");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike(), new Boat() };

        for (Vehicle v : vehicles) {
            v.go(); // 根据实际对象运行对应的方法
        }
    }
}

运行结果：

You drive the car
You ride the bike
You sail the boat

💡 关键点：
	•	Vehicle[] 数组里可以同时存放 Car、Bike、Boat，因为它们都有共同的父类 Vehicle。
	•	调用 v.go() 时，会根据实际对象的类型来决定调用哪个方法，这就是运行时多态（Runtime Polymorphism）。

⸻

4️⃣ 接口实现多态

抽象类不是必须的，你也可以用接口：

interface Vehicle {
    void go();
}

class Car implements Vehicle {
    public void go() { System.out.println("You drive the car"); }
}

class Bike implements Vehicle {
    public void go() { System.out.println("You ride the bike"); }
}

然后：

Vehicle[] vehicles = { new Car(), new Bike() };
for (Vehicle v : vehicles) {
    v.go();
}


⸻

5️⃣ 多态的好处
	1.	代码复用性高：写一份父类/接口的代码，可以适用于所有子类
	2.	扩展性强：新增一种 Truck 只需要实现 go()，其他代码不改
	3.	统一处理不同类型对象：通过父类/接口引用，调用方法时自动分发到正确实现

⸻

✅ 一句话总结：
Java 多态 = 父类/接口引用 指向 子类对象 + 方法重写，让一个接口能处理多种不同的对象，运行时根据对象类型调用对应的方法。

⸻

 */
