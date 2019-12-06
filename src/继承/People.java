package 继承;

public class People {
    private int id;
    private String name;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People() {
        System.out.println("通过无参构造创建了People对象。");
    }

    public People(int id){
        super();
        this.id = id;
        System.out.println("通过有参构造创建了People对象。");
    }
}
