
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lorikberisha.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lorikberisha.block.FortniteBlock;
import net.mcreator.lorikberisha.LorikberishaMod;

public class LorikberishaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LorikberishaMod.MODID);
	public static final RegistryObject<Block> FORTNITE = REGISTRY.register("fortnite", () -> new FortniteBlock());
}
