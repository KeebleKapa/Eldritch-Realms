package net.keeblekapa.eldritchrealms.item;

import net.keeblekapa.eldritchrealms.EldritchRealms;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum EldritchRealmsToolMaterials implements ToolMaterial {

    SHADOWSTEEL("shadowsteel", 5, 2560, 9.5f, 4.5f, 18, () -> Ingredient.ofItems(EldritchRealmsItems.SHADOWSTEEL_INGOT));



    private final String name;
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private EldritchRealmsToolMaterials(String name, int miningLevel, int itemDurability, float miningSpeed,
                                       float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    public String getName() {
        return EldritchRealms.MOD_ID + ":" + this.name;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
