package net.mcreator.rougayatou.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rougayatou.init.RougayatouModBlocks;

public class RougayatoublockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x + 1, y, z), RougayatouModBlocks.ROUGAYATOUBLOCK.get().defaultBlockState(), 3);
	}
}
