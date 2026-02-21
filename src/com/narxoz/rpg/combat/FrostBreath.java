package com.narxoz.rpg.combat;

public class FrostBreath extends AbstractAbility {
    public FrostBreath(FrostBreath frostBreath){
        super("FrostBreath",10,"Froze damage + Slow 10sec");
    }
    @Override public Ability clone() {return new FrostBreath(this);}
}