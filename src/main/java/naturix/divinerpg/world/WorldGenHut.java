package naturix.divinerpg.world;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.entities.entity.vanilla.LivestockMerchant;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenHut extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		
		int i = position.getX();
		int j = position.getY();
		int k = position.getZ();
		if (world.getBlockState(new BlockPos(i + 5, j, k + 5)) == Blocks.GRASS.getDefaultState() && world.getBlockState(new BlockPos(i + 5, j + 1, k + 5)) == Blocks.AIR.getDefaultState() && world.getBlockState(new BlockPos(i+3, j, k+3)) == Blocks.GRASS.getDefaultState() && world.getBlockState(new BlockPos(i+3, j + 1, k+3)) == Blocks.AIR.getDefaultState() && world.getBlockState(new BlockPos(i + 7, j, k + 7)) == Blocks.GRASS.getDefaultState() && world.getBlockState(new BlockPos(i + 7, j + 1, k + 7)) == Blocks.AIR.getDefaultState()) {
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 1), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 2), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 3), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 4), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 5), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 6), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 7), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 8), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 9), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 2, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 3), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 7), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 2, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 3), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 7), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 2, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 2, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 1), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 4, k + 9), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 5, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 6, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 2), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 3), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 7), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 8), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 1), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 5), Blocks.GLOWSTONE.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 9), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 5, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 6, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 7, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 3), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 7), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 1), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 9), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 3), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 7), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 4), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 5), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 6), Blocks.BRICK_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 2, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 2, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 2), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 8), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 4), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 6), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 3), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 4), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 5), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 6), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 7), Blocks.HAY_BLOCK.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 0), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 1), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 2), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 3), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 4), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 6), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 7), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 8), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 9), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 1, k + 10), Blocks.OAK_FENCE.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 5), Blocks.WOODEN_BUTTON.getDefaultState(), 2);
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 5), Blocks.WOODEN_BUTTON.getDefaultState(), 8);
			DivineRPG.logger.info(new BlockPos(i+7, j+2, k+5) + " hut");
			LivestockMerchant e = new LivestockMerchant(world);
			e.setLocationAndAngles(i+5, j+1, k+5, 0, 0);
			world.spawnEntity(e);
		return true;
		}
//		DivineRPG.logger.info("hut was called but failed to load at "+ new BlockPos(i, j, k));
		return false;
		}
	}