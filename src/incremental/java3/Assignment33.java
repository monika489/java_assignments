package java3;

/*
 Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
 Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods,
 each of which takes one of the four interfaces as an argument.
 In main( ), create an object of your class and pass it to each of the methods.
 */
interface First
{
    void A();
    void B();
}
interface Second
{
    void C();
    void D();
}
interface Third
{
    void E();
    void F();
}
interface Fourth extends First,Second,Third
{
    void G();
}
class Example
{

}
class Demostration extends Example implements Fourth{
    @Override
    public void A() {
        System.out.println("method A");
    }

    @Override
    public void B() {
        System.out.println("method B");
    }

    @Override
    public void C() {
        System.out.println("method C");

    }

    @Override
    public void D() {
        System.out.println("method D");

    }

    @Override
    public void E() {
        System.out.println("method E");

    }

    @Override
    public void F() {
        System.out.println("method F");

    }

    @Override
    public void G() {
        System.out.println("method G");

    }
}
public class Assignment33 {
    public static void method1(First first)
    {
        first.A();
        first.B();
    }
    public static void method2(Second second)
    {
        second.C();
        second.D();
    }
    public static void method3(Third third)
    {
        third.E();
        third.F();
    }
    public static void method4(Fourth fourth)
    {
        fourth.G();
    }
    public static void main(String[] args) {
        Demostration obj=new Demostration();
         method1(obj);
         method2(obj);
         method3(obj);
         method4(obj);
    }
}

