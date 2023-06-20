
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ciraehannah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ciraehannah.item.WandItem;
import net.mcreator.ciraehannah.item.NoodlesItem;
import net.mcreator.ciraehannah.CiraehannahMod;

public class CiraehannahModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CiraehannahMod.MODID);
	public static final RegistryObject<Item> NOODLES = REGISTRY.register("noodles", () -> new NoodlesItem());
	public static final RegistryObject<Item> CIRAE = block(CiraehannahModBlocks.CIRAE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
