package com.narxoz.rpg.loot;

import java.util.Arrays;

public class FireLootTable extends AbstractLootTable{
    public FireLootTable(FireLootTable fireLootTable){
        super(Arrays.asList("Heart of the Fire Dragon","Lava Ring (boosts fire damage)","Dragon Scale"),1000,500);
    }
    @Override public LootTable clone() {return new FireLootTable(this);}
}
