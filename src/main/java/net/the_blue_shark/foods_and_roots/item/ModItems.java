package net.the_blue_shark.foods_and_roots.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the_blue_shark.foods_and_roots.FoodsAndRootsMod;
import net.the_blue_shark.foods_and_roots.entities.ModEntities;

public class ModItems {

    public static  final Item BUTTERFLY_JAR = registerItem("butterfly_jar",
            new Item(new FabricItemSettings()));

    public static  final Item BUTTERFLY_SPAWN_EGG = registerItem("butterfly_spawn_egg",
            new SpawnEggItem(ModEntities.BUTTERFLY, 0xa86518, 0x3b260f, new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FoodsAndRootsMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(BUTTERFLY_JAR);
        entries.add(BUTTERFLY_SPAWN_EGG);
    }



    public static void registerModItems() {
        FoodsAndRootsMod.LOGGER.info("Registering Mod Items for " + FoodsAndRootsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }



}
