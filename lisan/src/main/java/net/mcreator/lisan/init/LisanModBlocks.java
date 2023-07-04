
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lisan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lisan.block.LisanBlock;
import net.mcreator.lisan.block.FootballPortalBlock;
import net.mcreator.lisan.LisanMod;

public class LisanModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LisanMod.MODID);
	public static final RegistryObject<Block> LISAN = REGISTRY.register("lisan", () -> new LisanBlock());
	public static final RegistryObject<Block> FOOTBALL_PORTAL = REGISTRY.register("football_portal", () -> new FootballPortalBlock());
}
