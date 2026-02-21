package com.narxoz.rpg.enemy;

import  com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbstractAbility;
import  com.narxoz.rpg.loot.LootTable;
import java.util.*;

public abstract class AbstractEnemy implements Enemy {
    public String Name;
    public int Health;
    public int Damage;
    public int Speed;
    public List<Ability> Abilities;
    public LootTable LootTable;
    public AbstractEnemy(String Name, int Health, int Damage, int Speed, List<Ability> Abilities, LootTable LootTable){
        this.Name=Name;
        this.Health=Health;
        this.Damage=Damage;
        this.Speed=Speed;
        this.Abilities=Abilities;
        this.LootTable=LootTable;
    }
    @Override public void setName(String Name) { this.Name = Name; }
    @Override public void setHealth(int Health) { this.Health = Health; }
    @Override public void setDamage(int Damage){ this.Health = Health; }
    @Override public void setSpeed(int Speed){ this.Speed = Speed; }

    @Override
    public void displayInfo() {
        System.out.println("=== ENEMY ===");
        System.out.println("Name: " + Name);
        System.out.println("HP: " + Health);
        System.out.println("DMG: " + Damage);
        System.out.println("SPD: " + Speed);

        System.out.println("\nAbilities:");
        for (Ability ability : Abilities) {
            System.out.println("- " + ability.getName() + " (" + ability.getDamage() + ")");
        }
        System.out.println("\nLoot:");
        System.out.println("Gold: " + LootTable.getGoldDrop());
        System.out.println("XP: " + LootTable.getExperienceDrop());
        System.out.println("Items: " + LootTable.getItems());
    }
    @Override
    public Enemy clone() {
        List<Ability> ClonedAbilities = new ArrayList<>();
        for (Ability ability : Abilities) {
            ClonedAbilities.add(ability.clone());
        }
        LootTable ClonedLoot = LootTable.clone();
        return createClone(Name, Health, Damage, Speed, ClonedAbilities, ClonedLoot);
    }
    protected abstract Enemy createClone(
            String name,
            int health,
            int damage,
            int speed,
            List<Ability> abilities,
            LootTable lootTable
    );
}