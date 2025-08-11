public class VARARGS {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        System.out.println(average(1, 2, 3, 4));

    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}

/*
5️⃣ 底层机制
	•	Java 编译器会把 Varargs 调用转化为数组传参

add(1, 2, 3);
// 等价于
add(new int[]{1, 2, 3});


6️⃣ 使用规则 & 注意事项
	1.	Varargs 必须是方法参数列表中的最后一个参数

	void test(String name, int... scores) { }  // ✅
    void test(int... scores, String name) { }  // ❌



    2.	一个方法只能有一个 Varargs 参数
    void test(int... a, double... b) { } // ❌

    3.	Varargs 可以不传值（数组长度为 0）

    4.	调用时也可以直接传数组
    int[] arr = {1, 2, 3};
    add(arr); // ✅

    7️⃣ 使用场景
	•	数学计算（求和、平均值等）
	•	日志工具（log(String... messages)）
	•	格式化字符串（String.format(String format, Object... args)）
	•	灵活的 API 设计（接收不定数量的同类参数）
	、

	📌 一句话总结

Varargs 让方法可以接收任意数量的参数，本质是数组语法糖，减少方法重载，调用更灵活。

 */
