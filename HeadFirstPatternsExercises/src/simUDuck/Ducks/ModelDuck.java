/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simUDuck.Ducks;

import simUDuck.Fly.FlyNoWay;
import simUDuck.Quack.Quack;

/**
 *
 * @author nicholas.fredricks
 */
public class ModelDuck extends Duck
{
    public ModelDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyNoWay();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a model duck!");
    }
}
