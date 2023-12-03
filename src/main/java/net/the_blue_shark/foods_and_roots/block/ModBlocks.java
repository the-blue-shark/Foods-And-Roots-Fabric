package net.the_blue_shark.foods_and_roots.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.the_blue_shark.foods_and_roots.FoodsAndRootsMod;

public class ModBlocks {

    public static final Block BUDDLEJA = registerBlock("buddleja",
            new FlowerBlock(StatusEffects.BAD_OMEN, 4, FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_BUDDLEJA = registerBlockWithoutBlockItem("potted_buddleja",
            new FlowerPotBlock(BUDDLEJA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(FoodsAndRootsMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FoodsAndRootsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FoodsAndRootsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FoodsAndRootsMod.LOGGER.info("Registering ModBlocks for " + FoodsAndRootsMod.MOD_ID);
    }
}
