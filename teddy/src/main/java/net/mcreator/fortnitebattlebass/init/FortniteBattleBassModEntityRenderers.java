
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fortnitebattlebass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fortnitebattlebass.client.renderer.DexterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FortniteBattleBassModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FortniteBattleBassModEntities.DEXTER.get(), DexterRenderer::new);
	}
}
