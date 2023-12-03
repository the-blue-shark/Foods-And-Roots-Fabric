package net.the_blue_shark.foods_and_roots.entities;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.the_blue_shark.foods_and_roots.FoodsAndRootsMod;
import net.the_blue_shark.foods_and_roots.entities.custom.ButterflyEntity;

public class ModEntities {

    public static final EntityType<ButterflyEntity> BUTTERFLY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FoodsAndRootsMod.MOD_ID, "butterfly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ButterflyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void registerModEntities() {
        FoodsAndRootsMod.LOGGER.info("Registering Mod Entities for " + FoodsAndRootsMod.MOD_ID);
    }
}
