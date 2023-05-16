
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kristan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kristan.block.RitablockBlock;
import net.mcreator.kristan.KristanMod;

public class KristanModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KristanMod.MODID);
	public static final RegistryObject<Block> RITABLOCK = REGISTRY.register("ritablock", () -> new RitablockBlock());
}
