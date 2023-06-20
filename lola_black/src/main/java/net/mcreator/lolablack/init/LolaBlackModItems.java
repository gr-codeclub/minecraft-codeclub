
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolablack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lolablack.item.WandItem;
import net.mcreator.lolablack.item.GreyamourItem;
import net.mcreator.lolablack.LolaBlackMod;

public class LolaBlackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LolaBlackMod.MODID);
	public static final RegistryObject<Item> GREYAMOUR_HELMET = REGISTRY.register("greyamour_helmet", () -> new GreyamourItem.Helmet());
	public static final RegistryObject<Item> GREYAMOUR_CHESTPLATE = REGISTRY.register("greyamour_chestplate", () -> new GreyamourItem.Chestplate());
	public static final RegistryObject<Item> GREYAMOUR_LEGGINGS = REGISTRY.register("greyamour_leggings", () -> new GreyamourItem.Leggings());
	public static final RegistryObject<Item> GREYAMOUR_BOOTS = REGISTRY.register("greyamour_boots", () -> new GreyamourItem.Boots());
	public static final RegistryObject<Item> MYFACE = block(LolaBlackModBlocks.MYFACE, LolaBlackModTabs.TAB_HELLO);
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> SPIDERFJF_SPAWN_EGG = REGISTRY.register("spiderfjf_spawn_egg", () -> new ForgeSpawnEggItem(LolaBlackModEntities.SPIDERFJF, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
