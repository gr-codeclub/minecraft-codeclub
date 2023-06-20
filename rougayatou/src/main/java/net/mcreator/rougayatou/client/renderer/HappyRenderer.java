
package net.mcreator.rougayatou.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.rougayatou.entity.HappyEntity;

public class HappyRenderer extends MobRenderer<HappyEntity, CowModel<HappyEntity>> {
	public HappyRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HappyEntity entity) {
		return new ResourceLocation("rougayatou:textures/entities/img.png");
	}
}
