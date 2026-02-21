package com.narxoz.rpg.combat;

public class FireShield extends AbstractAbility{
    public FireShield(FireShield fireShield){
        super("FireShield",50,"Defensive buff 20sec");
    }
    @Override public Ability clone() {
        return new FireShield(this);
    }
}
