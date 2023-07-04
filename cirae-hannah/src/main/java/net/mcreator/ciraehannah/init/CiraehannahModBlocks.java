
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ciraehannah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ciraehannah.block.EndofyouPortalBlock;
import net.mcreator.ciraehannah.block.CiraeBlock;
import net.mcreator.ciraehannah.CiraehannahMod;

public class CiraehannahModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CiraehannahMod.MODID);
	public static final RegistryObject<Block> CIRAE = REGISTRY.register("cirae", () -> new CiraeBlock());
	public static final RegistryObject<Block> ENDOFYOU_PORTAL = REGISTRY.register("endofyou_portal", () -> new EndofyouPortalBlock());
}
