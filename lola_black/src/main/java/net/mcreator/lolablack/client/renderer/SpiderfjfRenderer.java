
package net.mcreator.lolablack.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.lolablack.entity.SpiderfjfEntity;

public class SpiderfjfRenderer extends MobRenderer<SpiderfjfEntity, SpiderModel<SpiderfjfEntity>> {
	public SpiderfjfRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderfjfEntity entity) {
		return new ResourceLocation("lola_black:textures/entities/cave_spider.png");
	}
}
