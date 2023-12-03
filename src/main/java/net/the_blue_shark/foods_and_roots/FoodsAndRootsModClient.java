package net.the_blue_shark.foods_and_roots;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.the_blue_shark.foods_and_roots.entities.ModEntities;
import net.the_blue_shark.foods_and_roots.entities.client.ButterflyModel;
import net.the_blue_shark.foods_and_roots.entities.client.ButterflyRenderer;
import net.the_blue_shark.foods_and_roots.entities.layer.ModModelLayers;

public class FoodsAndRootsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BUTTERFLY, ButterflyModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.BUTTERFLY, ButterflyRenderer::new);
    }
}
