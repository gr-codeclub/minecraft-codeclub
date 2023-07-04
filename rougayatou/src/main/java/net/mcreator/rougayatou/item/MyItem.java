
package net.mcreator.rougayatou.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.rougayatou.init.RougayatouModFluids;

public class MyItem extends BucketItem {
	public MyItem() {
		super(RougayatouModFluids.MY, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
