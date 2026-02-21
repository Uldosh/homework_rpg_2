package com.narxoz.rpg.combat;

public class IceShield extends AbstractAbility{
    public IceShield(IceShield iceShield){
        super("IceShield",50,"defensive buff 20sec");
    }
    @Override public Ability clone() {return new IceShield(this);}
}
