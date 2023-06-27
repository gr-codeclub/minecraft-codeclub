package net.mcreator.chubertos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.chubertos.init.ChubertosModBlocks;

public class KhaledblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z + 1), ChubertosModBlocks.KHALEDBLOCK.get().defaultBlockState(), 3);
	}
}
