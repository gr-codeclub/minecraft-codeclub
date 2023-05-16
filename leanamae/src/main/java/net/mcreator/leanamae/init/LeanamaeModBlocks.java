
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leanamae.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.leanamae.block.LeanamaeBlock;
import net.mcreator.leanamae.LeanamaeMod;

public class LeanamaeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LeanamaeMod.MODID);
	public static final RegistryObject<Block> LEANAMAE = REGISTRY.register("leanamae", () -> new LeanamaeBlock());
}
