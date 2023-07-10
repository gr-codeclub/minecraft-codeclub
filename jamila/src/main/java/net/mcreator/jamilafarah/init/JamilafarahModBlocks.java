
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamilafarah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jamilafarah.block.JamilaBlock;
import net.mcreator.jamilafarah.JamilafarahMod;

public class JamilafarahModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JamilafarahMod.MODID);
	public static final RegistryObject<Block> JAMILA = REGISTRY.register("jamila", () -> new JamilaBlock());
	public static final RegistryObject<Block> NODDLE_PORTAL = REGISTRY.register("noddle_portal", () -> new NoddlePortalBlock());
}
