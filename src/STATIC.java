public class STATIC {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.showFriends();
    }
}



/*
1. static 的核心作用
	•	static 修饰变量或方法，表示它 属于类（class）本身，而不是某个具体对象（instance）。
	•	被 static 修饰的成员由 所有对象共享，而不是每个对象各自保存一份。
	•	不需要创建对象就可以通过 类名 来访问。

2. 修饰变量（静态变量 / 类变量）

没有 static 的情况
·
class Friend {
    String name;
    int numberOfFriends = 0; // 实例变量

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
}

·

	•	每个对象都有自己的 numberOfFriends。
	•	这样统计的只是每个对象的“朋友数”，不会有全局共享的效果。

加了 static

·
class Friend {
    String name;
    static int numberOfFriends = 0; // 静态变量（类变量）

    Friend(String name) {
        this.name = name;
        numberOfFriends++; // 所有对象共享
    }
}
·

	•	所有对象共享同一个 numberOfFriends，可以统计 总对象数。


	•	推荐访问方式：

	System.out.println(Friend.numberOfFriends); // 用类名访问更清晰

3. 修饰方法（静态方法）
	•	静态方法属于类本身，不依赖于对象。
	•	调用方式：

	·
    Friend.showFriends();
	·

	•	在静态方法中不能直接使用 this，因为 this 代表某个对象，而静态方法不依赖对象。

	class Friend {
    String name;
    static int numberOfFriends = 0;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numberOfFriends + " total friends");
    }
}

Friend f1 = new Friend("SpongeBob");
Friend f2 = new Friend("Patrick");
Friend.showFriends(); // 输出：You have 2 total friends

4. 常见用途
	•	统计类的对象数量（像视频里的朋友数量）。
	•	工具类方法（不需要对象就能用，比如 Math.round()）。
	•	全局共享的配置或常量（比如 public static final double PI = 3.14159）。

5. 总结记忆法
	•	static 变量 → 所有对象共享一份数据（类级别的属性）。
	•	static 方法 → 属于类本身，不依赖具体对象。
	•	访问时用 类名.成员 更清晰，比如：

	Friend.numberOfFriends;
Math.round(3.14);


 */