public class VARIABLESCOPE {

    static int x = 3; //CLASS

    public static void main(String[] args){

        int x = 1; //LOCAL

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){

        int x = 2; //LOCAL

        System.out.println(x);
    }
}

/*
1️⃣ 什么是变量作用域（Variable Scope）？

作用域就是一个变量在程序中能被访问的范围。
在 Java 里，常见的作用域有：
	1.	局部作用域（Local Scope）
	2.	类作用域（Class Scope / Global Scope）

2️⃣ 局部变量（Local Variables）
	•	定义：在方法（method）内部声明的变量，只能在该方法内部使用。
	•	特点：
	•	生命周期：方法运行时存在，方法结束后销毁
	•	不同方法里可以有相同名字的局部变量，互不影响
	•	如果方法之间需要共享值，必须通过参数传递


3️⃣ 类变量（Class Variables / 静态变量）
	•	定义：在类中声明，但不在任何方法里的变量
	•	特点：
	•	声明时通常加 static（静态变量）
	•	所有方法都能直接访问
	•	生命周期是类加载到内存开始，直到程序结束

	·
	public class Main {
    static int x = 3;  // 类变量（Class Scope）

    public static void main(String[] args) {
        System.out.println(x); // 输出 3
        doSomething();
    }

    static void doSomething() {
        System.out.println(x); // 输出 3
    }
}

	·

	💡 类变量就像“放在大街上”的变量，类里的所有方法都能看到它。

	4️⃣ 同名变量的优先级
	•	如果局部变量和类变量同名，Java 会优先使用局部变量。

	5️⃣ 什么时候用类变量？
	•	当你需要一个在整个类中共享的值时（比如常量、配置参数）
	•	当变量值在整个类生命周期中都不会频繁变化时
	•	例子：public static final double PI = 3.14159;





 */
