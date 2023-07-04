
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wowo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wowo.item.THELIONGODSARMOURItem;
import net.mcreator.wowo.item.AnvilwandItem;
import net.mcreator.wowo.WowoMod;

public class WowoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WowoMod.MODID);
	public static final RegistryObject<Item> THELIONGODSARMOUR_HELMET = REGISTRY.register("theliongodsarmour_helmet", () -> new THELIONGODSARMOURItem.Helmet());
	public static final RegistryObject<Item> THELIONGODSARMOUR_CHESTPLATE = REGISTRY.register("theliongodsarmour_chestplate", () -> new THELIONGODSARMOURItem.Chestplate());
	public static final RegistryObject<Item> THELIONGODSARMOUR_LEGGINGS = REGISTRY.register("theliongodsarmour_leggings", () -> new THELIONGODSARMOURItem.Leggings());
	public static final RegistryObject<Item> THELIONGODSARMOUR_BOOTS = REGISTRY.register("theliongodsarmour_boots", () -> new THELIONGODSARMOURItem.Boots());
	public static final RegistryObject<Item> FADY = block(WowoModBlocks.FADY, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANVILWAND = REGISTRY.register("anvilwand", () -> new AnvilwandItem());
	public static final RegistryObject<Item> DARK_GOLEM_SPAWN_EGG = REGISTRY.register("dark_golem_spawn_egg", () -> new ForgeSpawnEggItem(WowoModEntities.DARK_GOLEM, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
