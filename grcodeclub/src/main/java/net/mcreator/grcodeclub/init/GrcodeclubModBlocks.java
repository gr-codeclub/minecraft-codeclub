
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.grcodeclub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.grcodeclub.block.DexterBlockBlock;
import net.mcreator.grcodeclub.GrcodeclubMod;

public class GrcodeclubModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GrcodeclubMod.MODID);
	public static final RegistryObject<Block> DEXTER_BLOCK = REGISTRY.register("dexter_block", () -> new DexterBlockBlock());
}
