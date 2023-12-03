package net.the_blue_shark.foods_and_roots.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.the_blue_shark.foods_and_roots.entities.ModEntities;
import net.the_blue_shark.foods_and_roots.entities.custom.ButterflyEntity;
import net.the_blue_shark.foods_and_roots.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerPotionRecipes();
        registerCustomTrades();
        registerStrippables();
        registerFlammables();
        registerAttributes();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // bv. registry.add(ModItems.PEAT_BRICK, 200);
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.BUTTERFLY, ButterflyEntity.createButterflyAttributes());
    }

    private static void registerModCompostables() {
        // bv. ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.5f);
    }

    private static void registerCommands() {}

    private static void registerFlammables() {}

    private static void registerStrippables() {}

    private static void registerEvents() {}

    private static void registerPotionRecipes() {}

    private static void registerCustomTrades() {}
}
