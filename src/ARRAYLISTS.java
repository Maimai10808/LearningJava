import java.util.ArrayList;
import java.util.Collections;

public class ARRAYLISTS {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing)
        //                     Arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}


/*
好的 👍 我来帮你梳理一下 Java 中的 ArrayList，结合你提供的讲解内容，总结出清晰的知识点。

⸻

📦 什么是 ArrayList
	•	ArrayList 是 Java 中的“可变数组”（resizable array）。
	•	普通数组（array[]）一旦创建大小固定，而 ArrayList 大小可以动态改变。
	•	只能存储对象，不能直接存储基本数据类型（int、double 等），但可以通过 包装类 + 自动装箱（autoboxing） 来存放。
	•	例如：ArrayList<Integer> 代替 int[]

⸻

⚡ 1. 创建 ArrayList

import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<String> fruits = new ArrayList<>();

	•	使用 泛型（Generics） 指定存储的数据类型。
	•	例如：Integer（代替 int）、Double、Character、Boolean、String。

⸻

⚡ 2. 常用方法

方法	功能	示例
add(E e)	添加元素	fruits.add("Apple");
remove(int index)	删除指定下标的元素	fruits.remove(0); // 删除第1个
set(int index, E e)	修改元素	fruits.set(1, "Mango");
get(int index)	获取元素	String f = fruits.get(2);
size()	返回元素个数	int n = fruits.size();


⸻

⚡ 3. 排序 ArrayList

import java.util.Collections;

Collections.sort(fruits);

👉 按字母顺序（或数字大小）排序。

⸻

⚡ 4. 遍历 ArrayList

传统 for 循环

for(int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}

增强 for 循环（推荐）

for(String fruit : fruits) {
    System.out.println(fruit);
}


⸻

⚡ 5. 用户输入示例

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of foods: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // 清除输入缓冲区

        for(int i = 1; i <= num; i++) {
            System.out.print("Enter food " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println("Your foods: " + foods);
        scanner.close();
    }
}

👉 输入示例：

Enter the number of foods: 3
Enter food 1: Pizza
Enter food 2: Hotdog
Enter food 3: Taco
Your foods: [Pizza, Hotdog, Taco]


⸻

✅ 总结
	1.	ArrayList = 可变数组，比普通数组更灵活。
	2.	只能存对象，基本类型要用包装类（Integer, Double, …）。
	3.	常用方法：add、remove、set、get、size。
	4.	支持排序（Collections.sort()）、支持迭代（增强 for 循环）。
	5.	适合存储数量不确定的元素集合，比如用户输入的内容。

⸻

要不要我帮你整理一份 ArrayList 和 普通数组 的对比表格，这样你能一眼看出它们在用法和特点上的不同？


 */
