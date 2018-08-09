package incremental.java3.assignment34;

import incremental.java3.assignment34.cycle;
import incremental.java3.assignment34.cycleFactory;

class UnicycleFactory implements cycleFactory
{
    @Override
    public cycle getCycle() {
        return new UniCycle();
    }
}
