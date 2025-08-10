public class printf {
    public static void main(String[] args) {

        // printf() is a method used to format output

        // % [flags] [width] [.precision] [specifier-character]

        // [specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

        // [.precision]

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.3f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.3f\n", price3);

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("%f\n", price1);
        System.out.printf("%f\n", price2);
        System.out.printf("%f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("id: %04d\n", id1);
        System.out.printf("id: %04d\n", id2);
        System.out.printf("id: %04d\n", id3);
        System.out.printf("id: %04d\n", id4);
    }
}

/*
⸻
类似 C 语言
📝 Java printf() 格式化输出速查表

1️⃣ 基本语法

System.out.printf("格式字符串", 变量1, 变量2, ...);

	•	占位符：% + [修饰符] + [宽度] + [.精度] + 类型
	•	变量按占位符顺序匹配
	•	手动加 \n 换行

⸻

2️⃣ 类型（Type）

类型符号	说明	示例
%s	字符串 (String)	"Name: %s", "Bob"
%c	字符 (char)	"First: %c", 'A'
%d	整数 (int, long)	"Age: %d", 25
%f	浮点数 (float, double)	"Price: %f", 12.5
%b	布尔值 (boolean)	"Employed: %b", true


⸻

3️⃣ 精度（Precision）
	•	控制小数位数（自动四舍五入）

%.1f   // 保留 1 位小数
%.2f   // 保留 2 位小数
%.3f   // 保留 3 位小数

例：

System.out.printf("Price: %.2f\n", 3.14159); // 输出 Price: 3.14


⸻

4️⃣ 修饰符（Flags）

标志	作用	示例	结果
+	正数加 +	%+d → +7	+7
,	千分位分隔	%,d → 1000	1,000
(	负数括号	%(d → -7	(7)
空格	正数前加空格	% d → 7	␣7


⸻

5️⃣ 宽度（Width）
	•	控制最小输出宽度（不足补空格/补零）

语法	说明	示例	结果
%4d	宽度 4，右对齐	%4d →   42
%-4d	宽度 4，左对齐	%-4d → 42
%04d	宽度 4，补零	%04d → 0042


⸻

6️⃣ 综合例子

String name = "Bob";
int age = 30;
double price = 12345.6789;

System.out.printf("Name: %-10s Age: %04d Price: %,.2f\n",
                   name, age, price);

输出：

Name: Bob        Age: 0030 Price: 12,345.68


⸻
 */


