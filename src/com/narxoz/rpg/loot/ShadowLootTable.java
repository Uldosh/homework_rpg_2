package com.narxoz.rpg.loot;

import java.util.Arrays;

public class ShadowLootTable extends AbstractLootTable{
    public ShadowLootTable(ShadowLootTable shadowLootTable){
        super(Arrays.asList("Heart of the Shadow Dragon","Dark Staff","Shadow Fang"),900,400);
    }
    @Override public LootTable clone() {return new ShadowLootTable(this);}
}
