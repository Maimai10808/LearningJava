public class METHODS {
    public static void main(String[] args){

        // method =  a block of reusable code that is executed when called ()

        happyBirthday("Spongebob", 30);
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}

/*
1️⃣ 什么是 Method？
	•	定义：方法就是 一块可重复使用的代码块，只有在被调用时才会执行。
	•	作用：
	•	避免重复代码（符合 DRY原则：Don’t Repeat Yourself）
	•	让程序结构更清晰
	•	可以接收数据（参数）并返回结果


2️⃣ 方法的基本结构

[修饰符] [返回类型] 方法名(参数列表) {
    // 方法体
    return 返回值; // 如果返回类型不是 void
}

static void sayHello() {
    System.out.println("Hello!");
}

3️⃣ 方法的调用
	•	调用格式：方法名(参数);
	•	方法名前要加括号（视频里比喻成“两个电话机在对话”）。
	•	如果方法是 static，可以直接用 类名.方法名() 调用（在同一个类里类名可省略）。

 */