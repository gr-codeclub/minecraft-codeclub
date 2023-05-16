
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wowo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.wowo.block.FadyBlock;
import net.mcreator.wowo.WowoMod;

public class WowoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WowoMod.MODID);
	public static final RegistryObject<Block> FADY = REGISTRY.register("fady", () -> new FadyBlock());
}
