package net.the_blue_shark.foods_and_roots.entities.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.the_blue_shark.foods_and_roots.FoodsAndRootsMod;
import net.the_blue_shark.foods_and_roots.entities.custom.ButterflyEntity;
import net.the_blue_shark.foods_and_roots.entities.layer.ModModelLayers;

public class ButterflyRenderer extends MobEntityRenderer<ButterflyEntity, ButterflyModel<ButterflyEntity>> {
    private static final Identifier TEXTURE = new Identifier(FoodsAndRootsMod.MOD_ID, "textures/entity/butterfly.png");

    public ButterflyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ButterflyModel<>(ctx.getPart(ModModelLayers.BUTTERFLY)), 0.6f);
    }

    @Override
    public Identifier getTexture(ButterflyEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ButterflyEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
