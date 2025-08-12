public class METHODOVERRIDING {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                                      implementation of a method that is already defined.
        //                                      Allows for code reusability and gives specific implementations.

//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();
//
//        dog.move();
//        cat.move();
//        fish.move();

    }
}


//public class Animal {
//
//    void move(){
//        System.out.println("This animal is running");
//    }
//}
//public class Dog extends Animal{
//
//}
//public class Cat extends Animal{
//
//}
//public class Fish extends Animal{
//
//    @Override
//    void move(){
//        System.out.println("This animal is swimming");
//    }
//}

/*
 Java 中的方法重写（Method Overriding）

⸻

1️⃣ 什么是方法重写（Method Overriding）
	•	定义：子类提供自己版本的某个方法，实现替换父类继承下来的方法逻辑。
	•	作用：
	1.	代码复用：继承父类公共逻辑
	2.	定制行为：对不同子类给出更适合它的实现

形象类比：
父类的方法像是“模板”，子类可以保留，也可以自己“改造”成更合适的版本。

⸻

2️⃣ 基本示例

class Animal {
    void move() {
        System.out.println("This animal is running");
    }
}

class Dog extends Animal {}
class Cat extends Animal {}
class Fish extends Animal {
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}

执行：

Dog dog = new Dog();
Cat cat = new Cat();
Fish fish = new Fish();

dog.move(); // 输出: This animal is running
cat.move(); // 输出: This animal is running
fish.move(); // 输出: This animal is swimming


⸻

3️⃣ @Override 注解的好处
	•	作用：告诉编译器“这是一个重写方法”
	•	优点：
	•	避免拼写错误或参数不匹配导致没覆盖成功
	•	让其他开发者一眼看出这是重写父类方法

例子：

@Override
void move() { ... }

如果你把 move 拼成 moves，编译器会直接报错。

⸻

4️⃣ 方法重写的规则
	1.	方法名必须相同
	2.	参数列表必须相同（否则是方法重载 Overloading，不是重写）
	3.	返回类型必须兼容
	4.	子类方法的访问权限不能比父类更严格（比如父类是 public，子类不能写 private）
	5.	子类方法不能抛出比父类更广泛的受检异常

⸻

5️⃣ 常见使用场景
	•	不同子类需要对同一操作有不同的实现
（比如：不同动物的 move() 行为不同）
	•	多态（Polymorphism）中，父类引用指向子类对象时调用子类的实现

⸻



 */
