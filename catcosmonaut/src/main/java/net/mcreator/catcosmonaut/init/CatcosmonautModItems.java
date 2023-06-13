
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

import net.mcreator.catcosmonaut.item.CattshirtItem;
import net.mcreator.catcosmonaut.item.CatWandItem;
import net.mcreator.catcosmonaut.CatcosmonautMod;

public class CatcosmonautModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CatcosmonautMod.MODID);
	public static final RegistryObject<Item> CATTSHIRT_HELMET = REGISTRY.register("cattshirt_helmet", () -> new CattshirtItem.Helmet());
	public static final RegistryObject<Item> CATTSHIRT_CHESTPLATE = REGISTRY.register("cattshirt_chestplate", () -> new CattshirtItem.Chestplate());
	public static final RegistryObject<Item> CATTSHIRT_LEGGINGS = REGISTRY.register("cattshirt_leggings", () -> new CattshirtItem.Leggings());
	public static final RegistryObject<Item> CATTSHIRT_BOOTS = REGISTRY.register("cattshirt_boots", () -> new CattshirtItem.Boots());
	public static final RegistryObject<Item> SAFAANAUMRAHMAN = block(CatcosmonautModBlocks.SAFAANAUMRAHMAN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CAT_WAND = REGISTRY.register("cat_wand", () -> new CatWandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
