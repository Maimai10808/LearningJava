public class toString {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //                       Used to return a string representation of an object.
        //                       By default, it returns a hash code as a unique identifier.
        //                       It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        System.out.println(car2);
    }
}

//public class Car {
//
//    String make;
//    String model;
//    int year;
//    String color;
//
//    Car(String make, String model, int year, String color){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.color = color;
//    }
//
//    @Override
//    public String toString(){
//        return this.color + " " + this.year + " " + this.make + " " + this.model;
//    }
//}


/*
这个视频讲的是 Java 中的 toString() 方法，我帮你整理成重点笔记：

⸻

1️⃣ toString() 是什么？
	•	来源：Java 中所有类都继承自 Object 类（不管你有没有显式写 extends）。
	•	默认行为：Object 类的 toString() 会返回对象的类名 + “@” + 哈希码（基于内存地址生成的标识）。

Car car = new Car();
System.out.println(car); // 输出类似 Car@5acf9800


	•	问题：默认信息对人类来说没什么可读性。

⸻

2️⃣ 为什么要重写（Override）toString()？
	•	目的：让对象的输出更有意义，显示对象的实际数据，而不是哈希码。
	•	好处：
	1.	调试时更直观
	2.	日志输出更清晰
	3.	不需要每次都手动拼接属性字符串

⸻

3️⃣ 示例

Car 类定义：

class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}


⸻

4️⃣ 使用效果

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1);
        // 输出: Red 2025 Ford Mustang

        System.out.println(car2);
        // 输出: Blue 2026 Chevrolet Corvette
    }
}

	•	注意：这里 System.out.println(car1) 会自动调用 car1.toString() 方法。

⸻

5️⃣ 小结
	•	toString() 在 Java 中非常常用，尤其是调试和日志打印。
	•	任何类都可以重写它，让对象在被输出时显示更友好的内容。
	•	写法要记得加 @Override，避免拼写或参数错误导致没有覆盖成功。

⸻

你这里的 this 其实不是必须加的，但加上有几个好处。

⸻

1️⃣ this 的含义
	•	this 代表当前对象的引用，也就是“正在调用这个方法的那个对象”。
	•	在 toString() 方法里：

return this.color + " " + this.year + " " + this.make + " " + this.model;

就是说：
“取当前对象的 color、year、make、model 属性，然后拼成字符串。”

⸻

2️⃣ 为什么加 this？

情况	this 的作用
区分同名变量	如果方法的参数名和成员变量名一样（比如构造函数里），this 用来区分它们。例子：this.color = color;
代码可读性更高	有些开发者习惯加 this，一眼能看出这是成员变量，而不是局部变量或方法参数。
链式调用	在一些模式（比如 builder）里，this 还能返回当前对象方便链式写法。


⸻

3️⃣ 在 toString() 这里 this 可省略

因为 toString() 方法里没有局部变量或参数和 color、year 重名，所以写：

return color + " " + year + " " + make + " " + model;

完全等效，Java 编译器能识别这是成员变量。

⸻

✅ 总结
	•	加不加 this 在这里都可以，不影响功能。
	•	加了 this 更明确地告诉阅读代码的人“这是当前对象的属性”。
	•	在构造函数、set 方法里参数名和成员变量名相同时必须加 this，否则会发生“变量遮蔽”（shadowing）。

⸻


 */
