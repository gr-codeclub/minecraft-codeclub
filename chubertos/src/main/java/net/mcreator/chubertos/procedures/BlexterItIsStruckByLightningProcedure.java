package net.mcreator.chubertos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlexterItIsStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.LAVA.defaultBlockState(), 3);
	}
}
