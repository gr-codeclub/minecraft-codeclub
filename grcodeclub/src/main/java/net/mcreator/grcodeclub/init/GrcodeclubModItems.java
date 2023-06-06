
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.grcodeclub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.grcodeclub.item.FoodthingItem;
import net.mcreator.grcodeclub.item.CheeseItem;
import net.mcreator.grcodeclub.GrcodeclubMod;

public class GrcodeclubModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GrcodeclubMod.MODID);
	public static final RegistryObject<Item> DEXTER_BLOCK = block(GrcodeclubModBlocks.DEXTER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FOODTHING = REGISTRY.register("foodthing", () -> new FoodthingItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
