
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolablack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lolablack.block.MyfaceBlock;
import net.mcreator.lolablack.LolaBlackMod;

public class LolaBlackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LolaBlackMod.MODID);
	public static final RegistryObject<Block> MYFACE = REGISTRY.register("myface", () -> new MyfaceBlock());
}
