package com.narxoz.rpg.loot;
import java.util.Arrays;

public class BerserkLootTable extends AbstractLootTable{
    public BerserkLootTable(BerserkLootTable berserkLootTable){
        super(Arrays.asList("Heart of Fury","Rage Amulet","Berserk Fang"),1200,600);
    }
    @Override public LootTable clone() {return new BerserkLootTable(this);}
}
