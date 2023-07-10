
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catcosmonaut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.catcosmonaut.client.renderer.ChowchowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CatcosmonautModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CatcosmonautModEntities.CHOWCHOW.get(), ChowchowRenderer::new);
	}
}
