import java.util.Scanner;

/**
 * @author gaogao
 */
public class test {
    public static void main(String[] args) {
        System.out.println("你好");
        int num = 122;
        if (num == 122){
            System.out.println(1);
        }
        switch (num){
            case 10:
                System.out.println(1);
                break;
            case 20:
                System.out.println(2);
                break;
            case 122:
                System.out.println(3);
                break;
            default:
                System.out.println(0);
        }


        while (true){
            System.out.print("请输入学生编号：");
            Scanner scanner = new Scanner(System.in);
            int data = scanner.nextInt();
//            System.out.println("学生的编号是"+data);
            switch (data){
                case 1:
                    System.out.println("张三的成绩是95");
                    break;
                case 2:
                    System.out.println("李四的成绩是90");
                    break;
                case 3:
                    System.out.println("王五的成绩是80");
                    break;
                default:
                    System.out.println("输入不正确!");

            }
        }
    }
}
