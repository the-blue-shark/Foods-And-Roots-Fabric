package net.the_blue_shark.foods_and_roots.entities.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.the_blue_shark.foods_and_roots.FoodsAndRootsMod;

public class ModModelLayers {
    public static final EntityModelLayer BUTTERFLY =
            new EntityModelLayer(new Identifier(FoodsAndRootsMod.MOD_ID, "butterfly"), "main");
}