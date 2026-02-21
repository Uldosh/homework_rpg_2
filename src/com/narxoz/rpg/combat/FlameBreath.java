package com.narxoz.rpg.combat;

public class FlameBreath extends AbstractAbility{
    public FlameBreath(FlameBreath flameBreath) {
        super("FlameBreath", 10, "Fire damage -100 + Burn effect 10sec");
    }
    @Override public Ability clone() {return new FlameBreath(this);}
}
