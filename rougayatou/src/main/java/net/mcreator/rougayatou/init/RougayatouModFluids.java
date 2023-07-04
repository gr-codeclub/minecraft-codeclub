
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rougayatou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.rougayatou.fluid.MyFluid;
import net.mcreator.rougayatou.RougayatouMod;

public class RougayatouModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, RougayatouMod.MODID);
	public static final RegistryObject<FlowingFluid> MY = REGISTRY.register("my", () -> new MyFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MY = REGISTRY.register("flowing_my", () -> new MyFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MY.get(), RenderType.translucent());
		}
	}
}
