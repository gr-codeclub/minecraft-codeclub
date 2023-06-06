
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chubertos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chubertos.item.DexterItem;
import net.mcreator.chubertos.ChubertosMod;

public class ChubertosModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChubertosMod.MODID);
	public static final RegistryObject<Item> DEXTER_HELMET = REGISTRY.register("dexter_helmet", () -> new DexterItem.Helmet());
	public static final RegistryObject<Item> DEXTER_CHESTPLATE = REGISTRY.register("dexter_chestplate", () -> new DexterItem.Chestplate());
	public static final RegistryObject<Item> DEXTER_LEGGINGS = REGISTRY.register("dexter_leggings", () -> new DexterItem.Leggings());
	public static final RegistryObject<Item> DEXTER_BOOTS = REGISTRY.register("dexter_boots", () -> new DexterItem.Boots());
	public static final RegistryObject<Item> KHALEDBLOCK = block(ChubertosModBlocks.KHALEDBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEXTER_3 = REGISTRY.register("dexter_3", () -> new Dexter3Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
