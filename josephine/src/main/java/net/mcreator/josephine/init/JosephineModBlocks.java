
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.josephine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.josephine.block.JosephineBlock;
import net.mcreator.josephine.JosephineMod;

public class JosephineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JosephineMod.MODID);
	public static final RegistryObject<Block> JOSEPHINE = REGISTRY.register("josephine", () -> new JosephineBlock());
}
