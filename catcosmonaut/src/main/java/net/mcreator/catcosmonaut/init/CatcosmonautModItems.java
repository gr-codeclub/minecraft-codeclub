
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catcosmonaut.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.catcosmonaut.CatcosmonautMod;

public class CatcosmonautModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CatcosmonautMod.MODID);
	public static final RegistryObject<Item> SAFAANAUMRAHMAN = block(CatcosmonautModBlocks.SAFAANAUMRAHMAN, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
