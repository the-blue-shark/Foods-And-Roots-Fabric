package net.the_blue_shark.foods_and_roots.entities.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.the_blue_shark.foods_and_roots.entities.custom.ButterflyEntity;

public class ButterflyModel<T extends ButterflyEntity> extends SinglePartEntityModel<T> {
    private final ModelPart butterfly;
    public ButterflyModel(ModelPart root) {
        this.butterfly = root.getChild("butterfly");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData butterfly = modelPartData.addChild("butterfly", ModelPartBuilder.create(), ModelTransform.of(-1.0F, -6.0F, 0.5F, 0.0F, 0.0F, -0.0873F));

        ModelPartData butterfly_body = butterfly.addChild("butterfly_body", ModelPartBuilder.create().uv(0, 0).cuboid(5.0F, -0.25F, -3.0F, 1.0F, 0.25F, 1.0F, new Dilation(0.0F))
                .uv(0, 1).cuboid(5.0F, -0.25F, 1.0F, 1.0F, 0.25F, 1.0F, new Dilation(0.0F))
                .uv(0, 2).cuboid(4.0F, -0.25F, -2.0F, 1.0F, 0.25F, 1.0F, new Dilation(0.0F))
                .uv(2, 1).cuboid(4.0F, -0.25F, 0.0F, 1.0F, 0.25F, 1.0F, new Dilation(0.0F))
                .uv(0, 12).cuboid(-3.0F, -0.25F, -2.0F, 7.0F, 0.25F, 3.0F, new Dilation(0.0F))
                .uv(2, 0).cuboid(-4.0F, -0.25F, -1.0F, 1.0F, 0.25F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_wing = butterfly.addChild("right_wing", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -0.375F, 1.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.25F, -0.25F));

        ModelPartData left_wing = butterfly.addChild("left_wing", ModelPartBuilder.create().uv(0, 6).cuboid(-2.0F, 0.125F, -8.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.25F, 0.25F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        butterfly.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return butterfly;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}