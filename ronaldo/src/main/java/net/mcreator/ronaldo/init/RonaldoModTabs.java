
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ronaldo.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RonaldoModTabs {
	public static CreativeModeTab TAB_FARTU_764;

	public static void load() {
		TAB_FARTU_764 = new CreativeModeTab("tabfartu_764") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RonaldoModBlocks.RONALDO.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
