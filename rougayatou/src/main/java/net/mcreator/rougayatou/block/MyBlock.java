
package net.mcreator.rougayatou.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.rougayatou.init.RougayatouModFluids;

public class MyBlock extends LiquidBlock {
	public MyBlock() {
		super(() -> RougayatouModFluids.MY.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
