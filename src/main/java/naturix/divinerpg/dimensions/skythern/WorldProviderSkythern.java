package naturix.divinerpg.dimensions.skythern;

import naturix.divinerpg.registry.ModBiomes;
import naturix.divinerpg.registry.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class WorldProviderSkythern extends WorldProvider {
	
	@Override
	public void init() {
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.Skythern);
		this.nether = false;
		this.hasSkyLight = true;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorSkythern(this.world, this.world.getSeed() + this.getDimension()); 
	}
	
	@Override
    public BiomeProvider getBiomeProvider() {
		return this.biomeProvider = new BiomeProviderSkythern();
	}
	
    @Override
	public int getMoonPhase(long s) {
        return (int)(s / 24000L % 8L + 8L) % 8;
    }
    
	@Override
    public boolean canRespawnHere() {
        return false;
    }

	@Override
    public boolean isSurfaceWorld() {
        return false;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public float getCloudHeight() {
        return 8.0F;
    }

	@Override
    public int getAverageGroundLevel() {
        return 70;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int x, int z) {
        return false;
    }

	@Override
	public DimensionType getDimensionType() {
		return ModDimensions.skythernDimension;
	}
	@Nullable
    @Override
	public String getSaveFolder()
    {
        return "Skythern";
    }
}