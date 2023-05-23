
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ronaldo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ronaldo.block.RonaldoBlock;
import net.mcreator.ronaldo.RonaldoMod;

public class RonaldoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RonaldoMod.MODID);
	public static final RegistryObject<Block> RONALDO = REGISTRY.register("ronaldo", () -> new RonaldoBlock());
}
