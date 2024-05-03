package divinerpg.objects.blocks.arcana;

import divinerpg.DivineRPG;
import divinerpg.config.GeneralConfig;
import divinerpg.events.DimensionHelper;
import divinerpg.registry.BlockRegistry;
import divinerpg.registry.DimensionRegistry;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.utils.portals.description.ArcanaTeleporter;
import divinerpg.utils.portals.description.IPortalDescription;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockArcanaPortal extends Block {
    private int firetick;
    private int firemax = 200;
    private int dimId;
    protected static final AxisAlignedBB ARCANA_PORTAL_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);

    public BlockArcanaPortal(String name, int dimId) {
        super(Material.PORTAL);
        this.setSoundType(SoundType.STONE);
        this.setUnlocalizedName(name);
        this.setRegistryName(DivineRPG.MODID, name);
        this.setCreativeTab(DivineRPGTabs.BLOCKS);
        setLightLevel(1.0F);
        setBlockUnbreakable();
        setResistance(6000000F);
        this.dimId = dimId;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return ARCANA_PORTAL_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
        return false;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
                                      List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entity) {
        if (worldIn.isRemote)
            return;

        boolean canTransfer = entity.timeUntilPortal <= 0;

        if (!canTransfer)
            return;

        DimensionType destination = DimensionRegistry.arcanaDimension;
        if (destination == worldIn.provider.getDimensionType()) {
            destination = DimensionType.OVERWORLD;
        }

        entity.timeUntilPortal = 200;
        transferEntity(entity, destination);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if(blockIn == BlockRegistry.arcanaPortalFrame) {
            BlockPattern.PatternHelper frame = DimensionHelper.arcanaPortalHelper.matchFrame(worldIn, pos);
            if (frame == null) {
                worldIn.setBlockToAir(pos);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double distanceX = pos.getX() + rand.nextFloat();
        double distanceY = pos.getY() + 0.8F;
        double distanceZ = pos.getZ() + rand.nextFloat();
        worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, distanceX, distanceY, distanceZ, 0, 0, 0);
    }

    public static void transferEntity(Entity e, DimensionType modDimension) {
        if (e == null || modDimension == null)
            return;

        ITeleporter teleporter;
        if(e.dimension == GeneralConfig.dimensionIDs.arcanaDimensionID) {
            teleporter = new ArcanaTeleporter(e.getServer().getWorld(0));
        }
        else {
            teleporter = new ArcanaTeleporter(e.getServer().getWorld(GeneralConfig.dimensionIDs.arcanaDimensionID));
        }
        e.changeDimension(modDimension.getId(), teleporter);
    }
}