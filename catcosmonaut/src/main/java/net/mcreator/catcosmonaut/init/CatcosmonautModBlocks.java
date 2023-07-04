
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catcosmonaut.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.catcosmonaut.block.SafaanaumrahmanBlock;
import net.mcreator.catcosmonaut.block.CatBlock;
import net.mcreator.catcosmonaut.CatcosmonautMod;

public class CatcosmonautModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CatcosmonautMod.MODID);
	public static final RegistryObject<Block> SAFAANAUMRAHMAN = REGISTRY.register("safaanaumrahman", () -> new SafaanaumrahmanBlock());
	public static final RegistryObject<Block> CAT = REGISTRY.register("cat", () -> new CatBlock());
}
