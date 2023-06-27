
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ronaldo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ronaldo.item.HARRYBOTTLEOFWATERItem;
import net.mcreator.ronaldo.item.CakeItem;
import net.mcreator.ronaldo.RonaldoMod;

public class RonaldoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RonaldoMod.MODID);
	public static final RegistryObject<Item> CAKE = REGISTRY.register("cake", () -> new CakeItem());
	public static final RegistryObject<Item> RONALDO = block(RonaldoModBlocks.RONALDO, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HARRYBOTTLEOFWATER = REGISTRY.register("harrybottleofwater", () -> new HARRYBOTTLEOFWATERItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
