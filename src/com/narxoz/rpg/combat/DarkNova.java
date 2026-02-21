package com.narxoz.rpg.combat;

public class DarkNova extends AbstractAbility{
    public DarkNova(DarkNova darkNova){
        super("DarkNova",100,"ultimate + AoE damage");
    }
    @Override public Ability clone() {return new DarkNova(this);}
}
