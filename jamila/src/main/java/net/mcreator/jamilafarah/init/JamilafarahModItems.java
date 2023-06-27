
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jamilafarah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jamilafarah.item.PizzaTwoItem;
import net.mcreator.jamilafarah.item.PizzaItem;
import net.mcreator.jamilafarah.JamilafarahMod;

public class JamilafarahModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JamilafarahMod.MODID);
	public static final RegistryObject<Item> PIZZA = REGISTRY.register("pizza", () -> new PizzaItem());
	public static final RegistryObject<Item> JAMILA = block(JamilafarahModBlocks.JAMILA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIZZA_TWO = REGISTRY.register("pizza_two", () -> new PizzaTwoItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
