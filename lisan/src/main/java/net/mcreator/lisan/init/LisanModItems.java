
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lisan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lisan.item.WandItem;
import net.mcreator.lisan.item.RemanItem;
import net.mcreator.lisan.item.FootballItem;
import net.mcreator.lisan.LisanMod;

public class LisanModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LisanMod.MODID);
	public static final RegistryObject<Item> REMAN = REGISTRY.register("reman", () -> new RemanItem());
	public static final RegistryObject<Item> LISAN = block(LisanModBlocks.LISAN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> FOOTBALL = REGISTRY.register("football", () -> new FootballItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
