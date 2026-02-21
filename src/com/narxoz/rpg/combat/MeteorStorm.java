package com.narxoz.rpg.combat;

public class MeteorStorm extends AbstractAbility{
    public MeteorStorm(MeteorStorm meteorStorm){
        super("MeteorStorm",100,"ultimate + high AoE damage + instant death");
    }
    @Override public Ability clone() {return new MeteorStorm(this);}
}
