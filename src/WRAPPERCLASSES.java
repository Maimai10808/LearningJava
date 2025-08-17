public class WRAPPERCLASSES {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                                   to be used as objects. "Wrap them in an object"
        //                                   Generally, don't wrap primitives unless you need an object.
        //                                   Allows use of Collections Framework and static utility methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;
    }
}

/*
好的 👍 我来帮你梳理一下 Java 中的包装类（Wrapper Classes），结合你给的讲解内容，用中文总结清楚。

⸻

🎁 什么是包装类（Wrapper Classes）
	•	在 Java 中，基本数据类型（primitive types）：int、double、char、boolean …
	•	包装类（Wrapper Classes）：把这些基本类型封装成对象，比如：
	•	int → Integer
	•	double → Double
	•	char → Character
	•	boolean → Boolean

👉 为什么要包装？
	1.	有些框架/集合（如 ArrayList）只能存储对象，不能直接存储基本类型。
	2.	包装类提供了许多静态工具方法，便于数据转换、验证等。

可以理解为：把基本类型“包装”成对象，就像把礼物包在盒子里。

⸻

⚡ 1. 包装类的创建方式

过时写法（Java 9 之前）：

int a = 123;
Integer A = new Integer(a);   // 已弃用

现代写法（推荐）：自动装箱（Autoboxing）

Integer A = 123;       // int 自动转换成 Integer
Double B = 3.14;       // double → Double
Character C = '$';     // char → Character
Boolean D = true;      // boolean → Boolean


⸻

⚡ 2. 自动装箱（Autoboxing）与拆箱（Unboxing）
	•	Autoboxing（自动装箱）：基本类型 → 包装类对象

Integer num = 5;   // int → Integer

	•	Unboxing（拆箱）：包装类对象 → 基本类型

int x = num;       // Integer → int

👉 可以类比成“包礼物”和“拆礼物”。

⸻

⚡ 3. 包装类的常用方法

（1）基本类型 ↔ String 转换
	•	基本类型 → String

String s1 = Integer.toString(123);
String s2 = Double.toString(3.14);
String s3 = Character.toString('A');
String s4 = Boolean.toString(true);

	•	String → 基本类型

int a = Integer.parseInt("123");
double b = Double.parseDouble("3.14");
boolean c = Boolean.parseBoolean("true");
// char 没有 parse 方法，可以用 string.charAt(index)
char d = "Hello".charAt(0); // 'H'


⸻

（2）字符判断（Character 类）

char letter = 'b';

System.out.println(Character.isLetter(letter));     // true
System.out.println(Character.isUpperCase(letter));  // false
System.out.println(Character.isUpperCase('B'));     // true

👉 常用于输入验证（例如检查用户名、密码）。

⸻

⚡ 4. 典型应用场景
	1.	集合框架：ArrayList<int> 不允许，必须写成 ArrayList<Integer>。
	2.	数据转换：数字和字符串之间互转（parseInt, toString）。
	3.	输入验证：Character.isDigit()、isLetter() 检查用户输入是否合法。

⸻

✅ 总结
	•	包装类 = 把基本类型包装成对象。
	•	自动装箱：primitive → wrapper（自动转换）。
	•	拆箱：wrapper → primitive。
	•	常用功能：数据转换（toString, parse）、输入验证（isLetter, isUpperCase 等）。
	•	使用场景：集合框架（如 ArrayList）、工具方法、面向对象操作。

⸻

要不要我帮你整理一份 “基本类型 vs 包装类对照表 + 常用方法速查表”，方便你以后写 Java 时快速查阅？


 */

