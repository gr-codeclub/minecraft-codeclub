
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fortnitebattlebass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fortnitebattlebass.block.TeddyBlock;
import net.mcreator.fortnitebattlebass.FortniteBattleBassMod;

public class FortniteBattleBassModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FortniteBattleBassMod.MODID);
	public static final RegistryObject<Block> TEDDY = REGISTRY.register("teddy", () -> new TeddyBlock());
}
