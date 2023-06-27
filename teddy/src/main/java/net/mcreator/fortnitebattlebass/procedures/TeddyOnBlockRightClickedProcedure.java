package net.mcreator.fortnitebattlebass.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fortnitebattlebass.init.FortniteBattleBassModBlocks;

public class TeddyOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x + 1, y, z), FortniteBattleBassModBlocks.TEDDY.get().defaultBlockState(), 3);
	}
}
