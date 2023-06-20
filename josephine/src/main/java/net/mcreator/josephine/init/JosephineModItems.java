
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.josephine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.josephine.item.WondItem;
import net.mcreator.josephine.item.CakeItem;
import net.mcreator.josephine.JosephineMod;

public class JosephineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JosephineMod.MODID);
	public static final RegistryObject<Item> JOSEPHINE = block(JosephineModBlocks.JOSEPHINE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CAKE = REGISTRY.register("cake", () -> new CakeItem());
	public static final RegistryObject<Item> WOND = REGISTRY.register("wond", () -> new WondItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
