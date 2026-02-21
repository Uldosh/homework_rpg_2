package com.narxoz.rpg.combat;

public class Blizzard extends AbstractAbility{
    public Blizzard(Blizzard blizzard){
        super("Blizzard",100,"ultimate, AoE damage");
    }
    @Override public Ability clone() {return new Blizzard(this);}
}
