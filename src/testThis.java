public class testThis {
    int a,b,c;
    testThis(int a,int b){
        this.a = a;
        this.b = b;
    }
    testThis(int a,int b,int c){
        this(a,b);
        this.c = c;
    }

    void sing(){
        System.out.println("调用本类的方法。");
    }
    void eating(){
        this.sing();
    }

    public static void main(String[] args) {
        testThis hi = new testThis(2,3,4);
        hi.eating();
    }
}
