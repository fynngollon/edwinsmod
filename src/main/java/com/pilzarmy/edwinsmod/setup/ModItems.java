package com.pilzarmy.edwinsmod.setup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> PEANUT = Registration.ITEMS.register("peanut", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).food(new Food.Builder().nutrition(1).saturationMod(0.9F).build())));
    public static final RegistryObject<Item> OLIVE = Registration.ITEMS.register("olive", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).food(new Food.Builder().nutrition(1).saturationMod(0.0F).build())));
    public static final RegistryObject<Item> STRAWNUT_BUTTER = Registration.ITEMS.register("strawnut_butter", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).food(new Food.Builder().nutrition(6).saturationMod(0.6F).build())));

    public static Item PEANUT_ENTITY_EGG;


    static void register() {}
}
