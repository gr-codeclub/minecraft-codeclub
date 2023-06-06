
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fortnitebattlebass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fortnitebattlebass.item.LolItem;
import net.mcreator.fortnitebattlebass.FortniteBattleBassMod;

public class FortniteBattleBassModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FortniteBattleBassMod.MODID);
	public static final RegistryObject<Item> LOL_HELMET = REGISTRY.register("lol_helmet", () -> new LolItem.Helmet());
	public static final RegistryObject<Item> LOL_CHESTPLATE = REGISTRY.register("lol_chestplate", () -> new LolItem.Chestplate());
	public static final RegistryObject<Item> LOL_LEGGINGS = REGISTRY.register("lol_leggings", () -> new LolItem.Leggings());
	public static final RegistryObject<Item> LOL_BOOTS = REGISTRY.register("lol_boots", () -> new LolItem.Boots());
	public static final RegistryObject<Item> TEDDY = block(FortniteBattleBassModBlocks.TEDDY, CreativeModeTab.TAB_MISC);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
