package com.pilzarmy.edwinsmod.setup;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;

public class ModEntities {
    public static EntityType<?> PEANUT_ENTITY;

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ModItems.PEANUT_ENTITY_EGG = registerEntitySpawnEgg(PEANUT_ENTITY, 0xfcb103, 0x946000, "peanut_entity_egg")
        );
    }

    //public static void registerEntityWorldSpawns() { registerEntityWorldSpawn(); }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().tab(ItemGroup.TAB_DECORATIONS));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, EntityClassification classification, Biome... biomes) {
        for (Biome biome : biomes) {
            if (biome != null) {
                //biome.getGenerationSettings(new Spawn)
            }
        }
    }
}
