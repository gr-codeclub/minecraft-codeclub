
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolablack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lolablack.client.renderer.SpiderfjfRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LolaBlackModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LolaBlackModEntities.SPIDERFJF.get(), SpiderfjfRenderer::new);
	}
}
