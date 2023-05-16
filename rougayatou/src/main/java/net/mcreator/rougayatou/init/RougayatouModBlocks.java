
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rougayatou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rougayatou.block.RougayatoublockBlock;
import net.mcreator.rougayatou.RougayatouMod;

public class RougayatouModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RougayatouMod.MODID);
	public static final RegistryObject<Block> ROUGAYATOUBLOCK = REGISTRY.register("rougayatoublock", () -> new RougayatoublockBlock());
}
