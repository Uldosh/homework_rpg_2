package com.narxoz.rpg.loot;

import java.util.Arrays;

public class IceLootTable extends AbstractLootTable{
    public IceLootTable(IceLootTable iceLootTable){
        super(Arrays.asList("Ice Crystal","Heart of the Ice Dragon","Dragon Egg","Snow Powder"),800,300);
    }
    @Override public LootTable clone() {return new IceLootTable(this);}
}
