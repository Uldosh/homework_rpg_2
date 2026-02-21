package com.narxoz.rpg.combat;

public class Vanish extends AbstractAbility{
    public Vanish(Vanish vanish){
        super("Vanish",10,"stealth/evasion");
    }
    @Override public Ability clone() {return new Vanish(this);}
}
