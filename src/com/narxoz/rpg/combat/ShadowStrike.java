package com.narxoz.rpg.combat;

public class ShadowStrike extends AbstractAbility{
    public ShadowStrike(ShadowStrike shadowStrike){
        super("ShadowStrike",50,"high single-target damage + blind 10sec");
    }
    @Override public Ability clone() {return new ShadowStrike(this);}
}
