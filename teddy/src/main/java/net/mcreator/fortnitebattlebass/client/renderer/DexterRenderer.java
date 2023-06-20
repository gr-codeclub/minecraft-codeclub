
package net.mcreator.fortnitebattlebass.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.fortnitebattlebass.entity.DexterEntity;

public class DexterRenderer extends MobRenderer<DexterEntity, CowModel<DexterEntity>> {
	public DexterRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DexterEntity entity) {
		return new ResourceLocation("fortnite_battle_bass:textures/entities/brown_mooshroom.png");
	}
}
