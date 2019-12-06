package 继承;

public class Student extends People {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
        super(1);
        System.out.println("通过无参构造创建了Student对象。");
    }

    public Student(double score){
        super((int)score);
        System.out.println("通过有参构造创建了Student对象。");
    }

    public void show(){
        super.setName("张三");
        System.out.println(super.getName());
    }
}
