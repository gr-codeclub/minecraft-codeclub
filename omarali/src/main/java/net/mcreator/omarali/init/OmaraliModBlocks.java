
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omarali.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.omarali.block.OmarsblockBlock;
import net.mcreator.omarali.OmaraliMod;

public class OmaraliModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmaraliMod.MODID);
	public static final RegistryObject<Block> OMARSBLOCK = REGISTRY.register("omarsblock", () -> new OmarsblockBlock());
}
