
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolablack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lolablack.LolaBlackMod;

public class LolaBlackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LolaBlackMod.MODID);
	public static final RegistryObject<Item> MYFACE = block(LolaBlackModBlocks.MYFACE, LolaBlackModTabs.TAB_HELLO);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
