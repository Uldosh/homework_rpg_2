package com.narxoz.rpg.combat;

public class Berserk extends AbstractAbility{
    public Berserk(Berserk berserk){
        super("Berserk",90,"defensive buff + Increased damage at low HP");
    }
    @Override public Ability clone() {return new Berserk(this);}
}
