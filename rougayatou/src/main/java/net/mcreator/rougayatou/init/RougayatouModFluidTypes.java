
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rougayatou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.rougayatou.fluid.types.MyFluidType;
import net.mcreator.rougayatou.RougayatouMod;

public class RougayatouModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, RougayatouMod.MODID);
	public static final RegistryObject<FluidType> MY_TYPE = REGISTRY.register("my", () -> new MyFluidType());
}
