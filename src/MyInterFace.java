public class MyInterFace {
    public static void main(String[] args) {
        Angel a = new Angel();
        a.fly();
        a.helpOther();

        Volant v = new Angel();
        v.fly();
        //v.helpOther();调用不了helpOther()方法，Volant限定了类型。Volant里面只有fly方法，没有helpOther方法。



    }
}

/*
飞行接口
 */
interface Volant{
    int FLY_HEIGHT=1000;
    void fly();
}
/*
善良接口
 */
interface Honest{
    void helpOther();
}

//实现类可以实现多个父接口
class Angel implements Volant,Honest{
    @Override
    public void fly() {
        System.out.println("Angel.fly()");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther()");
    }
}

class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}

class BirdMan implements Volant{
    @Override
    public void fly() {
        System.out.println("BirdMan.Volant()");
    }
}