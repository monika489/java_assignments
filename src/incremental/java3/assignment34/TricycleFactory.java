package incremental.java3.assignment34;


import incremental.java3.assignment34.cycleFactory;

class TricycleFactory implements cycleFactory
{
    @Override
    public cycle getCycle() {
        return new TriCycle();
    }
}
