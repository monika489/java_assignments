package incremental.java3.assignment34;

public class main {
    public static void rideCycle(cycleFactory factory)
    {
        cycle obj= factory.getCycle();
        obj.ride();
    }
    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new TricycleFactory());
        rideCycle(new BicycleFactory());
    }
}
