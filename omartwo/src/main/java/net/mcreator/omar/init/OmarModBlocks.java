
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.omar.block.OmarBlock;
import net.mcreator.omar.OmarMod;

public class OmarModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmarMod.MODID);
	public static final RegistryObject<Block> OMAR = REGISTRY.register("omar", () -> new OmarBlock());
}
