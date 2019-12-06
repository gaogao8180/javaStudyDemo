public class test2 {
    int id;
    String sname;
    Computer comp;

    void study(){
        System.out.println(sname+"我在认真学习。使用电脑："+comp.brand);
    }
    void play(){
        System.out.println(sname+"学号："+id+"我在认真玩游戏。");
    }

    public static void main(String[] args) {
        test2 stu = new test2();
        Computer c1 = new Computer();
        stu.id = 1001;
        stu.sname = "张十三";
        c1.brand = "联想";
        stu.comp = c1;
        stu.study();
        stu.play();
    }
}

class Computer{
    String brand;
}