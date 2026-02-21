package com.narxoz.rpg.combat;

public class Teleport extends AbstractAbility{
    public Teleport(Teleport teleport){
        super("Teleport",5,"If you are near the teleporter, you can die. 2sec");
    }
    @Override public Ability clone() {return new Teleport(this);}
}
