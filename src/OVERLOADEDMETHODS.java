public class OVERLOADEDMETHODS {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name,
        //                                          but different parameters
        //                                          signature = name + parameters

        String pizza = bakePizza("flat-bread", "mozzarella", "pepperoni");

        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }


    // 加两个数
    static double add(double a, double b) {
        return a + b;
    }

    // 加三个数（参数数量不同）
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // 加四个数（参数数量不同）
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }


}


/*
1️⃣ 什么是 Overloaded Method（方法重载）？
	•	定义：在同一个类中，方法名相同，但参数列表不同的方法，叫做方法重载（Overloading）。
	•	方法的签名（Method Signature） = 方法名 + 参数列表（参数类型 & 顺序 & 个数）
	•	规则：
	1.	方法名必须相同
	2.	参数列表必须不同（数量、类型或顺序不一样）
	3.	返回值类型可以相同或不同，但不能仅靠返回值类型来区分方法
	4.	重载方法可以有不同的功能，但通常是相似操作的不同版本

	2️⃣ 为什么要用方法重载？
	•	让代码更简洁、可读性更高
	•	让同一类的功能用统一方法名来处理不同输入
	•	避免记一堆不同名字的方法

·add(2, 3)       // 加两个数
add(2, 3, 4)    // 加三个数
add(2.5, 3.8)   // 加两个小数·

5️⃣ 方法重载的参数匹配规则

Java 编译器在调用重载方法时会：
	1.	先匹配个数 → 个数不一样，就直接选对的方法
	2.	再匹配类型 → 如果个数一样，看类型是否完全匹配
	3.	如果找不到完全匹配，会尝试类型转换（widening conversion）
	•	int → double
	•	float → double
	•	但不会自动从大类型转小类型（会丢失精度）


 */