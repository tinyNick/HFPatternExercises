package simUDuck;

import simUDuck.Ducks.MallardDuck;
import simUDuck.Ducks.ModelDuck;
import simUDuck.Ducks.Duck;
import simUDuck.Fly.FlyRocketPowered;

/**
 *
 * @author nicholas.fredricks
 */
public class MiniDuckSimTest
{
    public static void main (String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
