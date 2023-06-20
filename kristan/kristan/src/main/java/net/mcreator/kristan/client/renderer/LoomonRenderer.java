
package net.mcreator.kristan.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.kristan.entity.LoomonEntity;

public class LoomonRenderer extends MobRenderer<LoomonEntity, CowModel<LoomonEntity>> {
	public LoomonRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LoomonEntity entity) {
		return new ResourceLocation("kristan:textures/entities/brown_mooshroom.png");
	}
}
