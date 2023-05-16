
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lalsianhonsukte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lalsianhonsukte.block.LalsianBlock;
import net.mcreator.lalsianhonsukte.LalsianhonsukteMod;

public class LalsianhonsukteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LalsianhonsukteMod.MODID);
	public static final RegistryObject<Block> LALSIAN = REGISTRY.register("lalsian", () -> new LalsianBlock());
}
