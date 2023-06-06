
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kristan.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kristan.item.WandItem;
import net.mcreator.kristan.item.TestArmorItem;
import net.mcreator.kristan.item.EmeraldArmourItem;
import net.mcreator.kristan.item.EmeraldArmouArmorItem;
import net.mcreator.kristan.KristanMod;

public class KristanModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KristanMod.MODID);
	public static final RegistryObject<Item> EMERALD_ARMOUR_HELMET = REGISTRY.register("emerald_armour_helmet", () -> new EmeraldArmourItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOUR_CHESTPLATE = REGISTRY.register("emerald_armour_chestplate", () -> new EmeraldArmourItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOUR_LEGGINGS = REGISTRY.register("emerald_armour_leggings", () -> new EmeraldArmourItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOUR_BOOTS = REGISTRY.register("emerald_armour_boots", () -> new EmeraldArmourItem.Boots());
	public static final RegistryObject<Item> RITABLOCK = block(KristanModBlocks.RITABLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TEST_ARMOR_HELMET = REGISTRY.register("test_armor_helmet", () -> new TestArmorItem.Helmet());
	public static final RegistryObject<Item> TEST_ARMOR_CHESTPLATE = REGISTRY.register("test_armor_chestplate", () -> new TestArmorItem.Chestplate());
	public static final RegistryObject<Item> TEST_ARMOR_LEGGINGS = REGISTRY.register("test_armor_leggings", () -> new TestArmorItem.Leggings());
	public static final RegistryObject<Item> TEST_ARMOR_BOOTS = REGISTRY.register("test_armor_boots", () -> new TestArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_ARMOU_ARMOR_HELMET = REGISTRY.register("emerald_armou_armor_helmet", () -> new EmeraldArmouArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOU_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armou_armor_chestplate", () -> new EmeraldArmouArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOU_ARMOR_LEGGINGS = REGISTRY.register("emerald_armou_armor_leggings", () -> new EmeraldArmouArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOU_ARMOR_BOOTS = REGISTRY.register("emerald_armou_armor_boots", () -> new EmeraldArmouArmorItem.Boots());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
