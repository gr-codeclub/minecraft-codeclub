
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lalsianhonsukte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lalsianhonsukte.item.WandItem;
import net.mcreator.lalsianhonsukte.item.JawbreakerItem;
import net.mcreator.lalsianhonsukte.item.DimonddimentionItem;
import net.mcreator.lalsianhonsukte.LalsianhonsukteMod;

public class LalsianhonsukteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LalsianhonsukteMod.MODID);
	public static final RegistryObject<Item> JAWBREAKER = REGISTRY.register("jawbreaker", () -> new JawbreakerItem());
	public static final RegistryObject<Item> LALSIAN = block(LalsianhonsukteModBlocks.LALSIAN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> DIMONDDIMENTION = REGISTRY.register("dimonddimention", () -> new DimonddimentionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
