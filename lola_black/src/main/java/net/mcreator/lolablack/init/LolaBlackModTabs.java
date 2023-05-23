
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolablack.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LolaBlackModTabs {
	public static CreativeModeTab TAB_HELLO;

	public static void load() {
		TAB_HELLO = new CreativeModeTab("tabhello") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LolaBlackModBlocks.MYFACE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
