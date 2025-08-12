public class INTERFACES {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //                     that implementing classes MUST define.
        //                     Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}

/*

 Java 接口（interface） 概念和代码逻辑详细讲一下，并和抽象类做个对比。

⸻

1️⃣ 接口（Interface）是什么？
	•	定义：接口是类的蓝图，规定了类必须实现的一组方法（这些方法都是抽象方法，没有方法体）。
	•	作用：
	1.	让不同类之间有统一的行为规范（像合同一样，签了就必须履行）。
	2.	支持 多继承 行为（Java 类只能继承一个父类，但可以实现多个接口）。
	•	关键点：
	•	方法默认是 public abstract（即使你不写）。
	•	接口里不能有实例变量（只能有 public static final 常量）。
	•	接口中的方法不能有具体实现（Java 8 以后可以有 default 方法和 static 方法，）。

⸻

2️⃣ 例子结构

接口：

interface Prey {
    void flee(); // 逃跑
}

interface Predator {
    void hunt(); // 捕猎
}

类与接口的关系：

Prey (接口)         Predator (接口)
   ↑                      ↑
 Rabbit                   Hawk
   ↑                      ↑
      Fish（同时实现两个接口）


⸻

3️⃣ 例子分解

🐇 Rabbit（只实现 Prey 接口）

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is running away");
    }
}

	•	Rabbit 必须实现 flee() 方法（因为 Prey 接口规定了）。
	•	不能不写，否则编译器报错。

⸻

🦅 Hawk（只实现 Predator 接口）

class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}

	•	Hawk 必须实现 hunt() 方法。

⸻

🐟 Fish（同时实现 Prey 和 Predator）

class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("The fish is swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }
}

	•	Fish 必须实现 两个接口的所有方法。
	•	这就是多继承行为的体现。

⸻

4️⃣ 测试代码

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

输出：

The rabbit is running away
The hawk is hunting
The fish is swimming away
The fish is hunting


⸻

5️⃣ 接口 vs 抽象类（视频的对比点）

特性                  	接口 (interface)	                     抽象类 (abstract class)
是否可多继承	            ✅ 可以实现多个接口	                ❌ 只能继承一个类
是否有实例变量     	    ❌ 不能	                            ✅ 可以
方法是否有实现	            ❌ 默认都没有（可用 default/static）	✅ 可以有抽象方法+具体方法
构造函数	                ❌ 没有	                            ✅ 有


⸻

💡 总结：
	•	接口：更像是“合同”，规定了行为规范，一个类可以签多份合同。
	•	抽象类：更像是“模板类”，既能规定行为（抽象方法），也能提供默认实现（具体方法），只能有一个父类。
	•	如果你的设计需要多继承行为，就用接口。

⸻

是的 👍，Java 的 interface 跟 Swift 里的 protocol 非常像，本质都是“行为规范”，但也有一点小差别。

⸻

1️⃣ 相同点

Java interface	       Swift protocol	      说明
都不能直接创建实例	     都不能直接实例化	    只能被类 / 结构体 / 枚举实现
只定义方法签名 	      只定义方法/属性的要求   	不关心具体实现细节
实现者必须实现全部方法  	遵循者必须实现全部要求	   否则编译错误
支持多实现	          支持多协议遵循      	类/结构体可以同时实现多个


⸻

2️⃣ 不同点（Java vs Swift）

对比点	Java interface	Swift protocol
默认修饰符	方法默认 public abstract	默认 internal
属性要求	只能定义 public static final 常量（不能有实例属性）	可以要求实例属性（var/let），实现者决定存储/计算
默认实现	Java 8 以后可以用 default 方法	Swift 可以用 protocol extension 提供默认实现
适用对象	只能由类/接口实现	类、结构体、枚举都可以遵循协议


⸻

3️⃣ 类比例子

Java interface

interface Prey {
    void flee();
}

class Rabbit implements Prey {
    public void flee() {
        System.out.println("The rabbit is running away");
    }
}

Swift protocol

protocol Prey {
    func flee()
}

class Rabbit: Prey {
    func flee() {
        print("The rabbit is running away")
    }
}

效果几乎一模一样。

⸻

✅ 结论：
Java 的 interface ≈ Swift 的 protocol，都是“定义一组必须实现的功能”，区别主要在语法和一些语言特性上，
比如 Swift 还可以让结构体、枚举遵循协议，而 Java 接口只能由类/接口来实现。

⸻



 */





