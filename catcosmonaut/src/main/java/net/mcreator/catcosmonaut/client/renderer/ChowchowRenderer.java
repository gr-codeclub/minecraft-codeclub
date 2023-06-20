
package net.mcreator.catcosmonaut.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.catcosmonaut.entity.ChowchowEntity;

public class ChowchowRenderer extends MobRenderer<ChowchowEntity, OcelotModel<ChowchowEntity>> {
	public ChowchowRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChowchowEntity entity) {
		return new ResourceLocation("catcosmonaut:textures/entities/wolf_tame.png");
	}
}
