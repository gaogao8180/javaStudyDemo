package array;

//用户管理系统
//        - 查询用户：将系统中保存的全部用户信息在控制台打印输出。
//        - 添加用户：向系统中添加新的用户信息，如果添加的用户已经存在，给出提示信息。
//        - 删除用户：输入用户名，进行删除操作，若输入的用户名不存在，给出提示信息。
//        - 账号冻结：输入用户名，进行冻结操作，若输入的用户名不存在或者该用户已经被冻结，给出相应提示。
//        - 账号解冻：输入用户名，进行解封操作，若输入的用户名不存在或者该用户状态正常，给出相应提示。
//        - 退出系统：跳出循环，给出提示信息

import java.util.Arrays;
import java.util.Scanner;

public class 用户管理系统 {
    //初始化用户数据（用户名，年龄，状态）
    static String[] names = {"张三","李四","王五","小明"};
    static int[] ages = {22,23,20,22};
    static String[] states = {"正常","正常","正常","正常"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        do{
            System.out.println("------欢迎使用用户管理系统------");
            System.out.println("1、用户查询");
            System.out.println("2、添加用户");
            System.out.println("3、删除用户");
            System.out.println("4、账户冻结");
            System.out.println("5、账户解封");
            System.out.println("6、退出系统");
            System.out.println("请选择操作：");
            num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("------查询用户------");
                    System.out.println("编号\t\t姓名\t\t年龄\t\t状态");
                    for(int i=0;i<names.length;i++){
                        if(names[i] != null){
                            System.out.println((i+1)+"\t\t\t"+names[i]+"\t\t"+ages[i]+"\t\t\t"+states[i]);
                        }
            }
                    do{
                        System.out.println("输入0返回上级菜单。");
                        num = scanner.nextInt();
                        if(num != 0){
                            System.out.println("请输入0返回上一级菜单。");
                        }
                    }while (num !=0);
                    break;
                case 2:
                    System.out.println("------添加用户------");
                    System.out.println("请输入新的用户名");
                    String name = scanner.next();
                    if(nameIsExist(name)){
                        System.out.println("用户名已存在，请勿重复添加。");
                    }else {
                        if(names[names.length-1] != null){
                            //创建新的数组，并将老数组的数据存入新数组
                            names = Arrays.copyOf(names,names.length+1);
                            names[names.length - 1] = name;
                            System.out.println("请输入" + name + "的年龄：");
                            int age = scanner.nextInt();
                            ages = Arrays.copyOf(ages, ages.length + 1);
                            ages[ages.length - 1] = age;
                            states = Arrays.copyOf(states, states.length + 1);
                            states[states.length - 1] = "正常";
                            System.out.println(name + "添加成功.");
                        }else {
                            int index = getFirstNull();
                            names[index] = name;
                            System.out.println("请输入" + name + "的年龄：");
                            int age = scanner.nextInt();
                            ages[index] = age;
                            states[index] = "正常";
                        }

                    }
                    do{
                        System.out.println("输入0返回上级菜单。");
                        num = scanner.nextInt();
                        if(num != 0){
                            System.out.println("请输入0返回上一级菜单。");
                        }
                    }while (num !=0);
                    break;
                case 3:
                    System.out.println("------删除用户------");
                    if(names[0] == null){
                        System.out.println("用户已经全部删除。");
                    }else {
                        System.out.print("请输入用户名");
                        name = scanner.next();
                        if(nameIsExist(name)){
                            int index = getIndex(name);
                            if(index>=0){
                                for(int i=index;i<names.length-1;i++){
                                    names[i] = names[i+1];
                                    ages[i] = ages[i+1];
                                    states[i] = states[i+1];
                                }
                                names[names.length-1] = null;
                                ages[ages.length-1] = 0;
                                states[states.length-1] = null;
                            }
                        }else {
                            System.out.println("您输入的用户不存在！");
                        }
                        System.out.println(name + "已删除成功.");
                    }
                    do{
                        System.out.println("输入0返回上级菜单。");
                        num = scanner.nextInt();
                        if(num != 0){
                            System.out.println("请输入0返回上一级菜单。");
                        }
                    }while (num !=0);
                    break;
                case 4:
                    System.out.println("------用户冻结------");
                    System.out.print("请输入用户名：");
                    name = scanner.next();
                    if (nameIsExist(name)){
                        int index = getIndex(name);
                        String state = states[index];
                        if(state.equals("冻结")){
                            System.out.println(name+"已冻结，请勿重复操作！");
                        }else {
                            states[index] = "冻结";
                            System.out.println(name+"冻结成功！");
                        }
                    }else {
                        System.out.println("您输入的用户不存在！");
                    }
                    do{
                        System.out.println("输入0返回上级菜单。");
                        num = scanner.nextInt();
                        if(num != 0){
                            System.out.println("请输入0返回上一级菜单。");
                        }
                    }while (num !=0);
                    break;
                case 5:
                    System.out.println("------用户解封------");
                    System.out.print("请输入用户名：");
                    name = scanner.next();
                    if (nameIsExist(name)){
                        int index = getIndex(name);
                        String state = states[index];
                        if(state.equals("正常")){
                            System.out.println(name+"已解封，请勿重复操作！");
                        }else {
                            states[index] = "正常";
                            System.out.println(name+"解封成功！");
                        }
                    }else {
                        System.out.println("您输入的用户不存在！");
                    }
                    do{
                        System.out.println("输入0返回上级菜单。");
                        num = scanner.nextInt();
                        if(num != 0){
                            System.out.println("请输入0返回上一级菜单。");
                        }
                    }while (num !=0);
                case 6:
                    System.out.println("感谢使用本系统，再见！");
                    break;
            }
        }while (num == 0);
    }




    public static boolean nameIsExist(String name){
        for(int i=0;i<names.length;i++){
            if(name.equals(names[i])){
                return true;
            }
        }
        return false;
    }
    /*
    * 找到名字在数组中的下标*/
    public static int getIndex(String name){
        for(int i=0;i<names.length;i++){
            if(name.equals(names[i])){
                return i;
            }
        }
        return -1;
    }

    /*
    * 找到数组中第一个为空的下标，
    * */
    public static int getFirstNull(){
        for(int i=0;i<names.length;i++){
            if(names[i] == null){
                return i;
            }
        }
        return -1;
    }
}
