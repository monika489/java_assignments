package incremental.java3.assignment34;

import incremental.java3.assignment34.cycle;

class BicycleFactory implements incremental.java3.assignment34.cycleFactory
{
    @Override
    public cycle getCycle() {
        return new BiCycle();
    }
}
