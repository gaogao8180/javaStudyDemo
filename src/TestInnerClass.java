public class TestInnerClass {
    public static void main(String[] args) {
        Outer.inner inner = new Outer().new inner();

        inner.show();
    }
}

class Outer{
    private int age = 10;
    public void testOuter(){ }

    class inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("外部类的成员变量age"+ Outer.this.age);
            System.out.println("内部类的成员变量age"+ this.age);
            System.out.println("局部变量age"+ age);
        }
    }
}