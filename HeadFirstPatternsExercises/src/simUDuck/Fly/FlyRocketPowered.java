/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simUDuck.Fly;

import simUDuck.FlyBehavior;

/**
 *
 * @author nicholas.fredricks
 */
public class FlyRocketPowered implements FlyBehavior
{
    @Override
    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }
}
