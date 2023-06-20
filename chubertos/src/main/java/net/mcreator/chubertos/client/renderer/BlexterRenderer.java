
package net.mcreator.chubertos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.chubertos.entity.BlexterEntity;

public class BlexterRenderer extends MobRenderer<BlexterEntity, OcelotModel<BlexterEntity>> {
	public BlexterRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlexterEntity entity) {
		return new ResourceLocation("chubertos:textures/entities/wolf.png");
	}
}
