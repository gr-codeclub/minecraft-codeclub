
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chubertos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chubertos.block.KhaledblockBlock;
import net.mcreator.chubertos.ChubertosMod;

public class ChubertosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChubertosMod.MODID);
	public static final RegistryObject<Block> KHALEDBLOCK = REGISTRY.register("khaledblock", () -> new KhaledblockBlock());
}
