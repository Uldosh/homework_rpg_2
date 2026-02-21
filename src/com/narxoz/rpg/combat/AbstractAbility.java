package com.narxoz.rpg.combat;

public abstract class AbstractAbility implements Ability{
    public String Name;
    public int Damage;
    public String Description;
    public AbstractAbility(String Name, int Damage, String Description){
        this.Name=Name;
        this.Damage=Damage;
        this.Description=Description;
    }
    @Override public String getName() { return Name; }
    @Override public int getDamage() { return Damage; }
    @Override public String getDescription() { return Description; }

    @Override public abstract Ability clone();
}
