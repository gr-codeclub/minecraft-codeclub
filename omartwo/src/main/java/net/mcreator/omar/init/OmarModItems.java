
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.omar.item.WandtoolItem;
import net.mcreator.omar.item.NeymarItem;
import net.mcreator.omar.item.CakeItem;
import net.mcreator.omar.OmarMod;

public class OmarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmarMod.MODID);
	public static final RegistryObject<Item> CAKE = REGISTRY.register("cake", () -> new CakeItem());
	public static final RegistryObject<Item> OMAR = block(OmarModBlocks.OMAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WANDTOOL = REGISTRY.register("wandtool", () -> new WandtoolItem());
	public static final RegistryObject<Item> NEYMAR = REGISTRY.register("neymar", () -> new NeymarItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
