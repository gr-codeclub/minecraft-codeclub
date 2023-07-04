
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lorikberisha.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lorikberisha.item.NoodelsItem;
import net.mcreator.lorikberisha.item.BattlepassItem;
import net.mcreator.lorikberisha.LorikberishaMod;

public class LorikberishaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LorikberishaMod.MODID);
	public static final RegistryObject<Item> NOODELS = REGISTRY.register("noodels", () -> new NoodelsItem());
	public static final RegistryObject<Item> FORTNITE = block(LorikberishaModBlocks.FORTNITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BATTLEPASS = REGISTRY.register("battlepass", () -> new BattlepassItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
