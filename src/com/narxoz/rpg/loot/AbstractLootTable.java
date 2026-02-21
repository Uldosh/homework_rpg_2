package com.narxoz.rpg.loot;

import java.util.*;
public abstract class AbstractLootTable implements LootTable{
    public List<String> Items;
    public int GoldDrop;
    public int ExperienceDrop;
    public String LootInfo;
    public AbstractLootTable(List<String> Items, int GoldDrop, int ExperienceDrop, String LootInfo ){
        this.Items=new ArrayList<>();
        this.GoldDrop=GoldDrop;
        this.ExperienceDrop=ExperienceDrop;
    }
    @Override public List<String> getItems() {
        return Items;
    }
    @Override public int getGoldDrop() {
        return GoldDrop;
    }
    @Override public int getExperienceDrop() {
        return ExperienceDrop;
    }

    @Override public abstract LootTable clone();
}
