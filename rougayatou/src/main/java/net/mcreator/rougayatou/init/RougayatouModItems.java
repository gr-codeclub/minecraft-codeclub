
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rougayatou.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rougayatou.item.PINKItem;
import net.mcreator.rougayatou.RougayatouMod;

public class RougayatouModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RougayatouMod.MODID);
	public static final RegistryObject<Item> PINK_HELMET = REGISTRY.register("pink_helmet", () -> new PINKItem.Helmet());
	public static final RegistryObject<Item> PINK_CHESTPLATE = REGISTRY.register("pink_chestplate", () -> new PINKItem.Chestplate());
	public static final RegistryObject<Item> PINK_LEGGINGS = REGISTRY.register("pink_leggings", () -> new PINKItem.Leggings());
	public static final RegistryObject<Item> PINK_BOOTS = REGISTRY.register("pink_boots", () -> new PINKItem.Boots());
	public static final RegistryObject<Item> ROUGAYATOUBLOCK = block(RougayatouModBlocks.ROUGAYATOUBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
