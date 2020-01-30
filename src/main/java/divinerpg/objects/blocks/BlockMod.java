package divinerpg.objects.blocks;

import divinerpg.api.java.divinerpg.api.Reference;
import divinerpg.enums.EnumBlockType;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.registry.ModBlocks;
import divinerpg.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockMod extends Block  {
    boolean beaconBase;
    public BlockMod(String name, float hardness) {
        this(EnumBlockType.ROCK, name, hardness);
    }

    public BlockMod(EnumBlockType blockType, String name, float hardness) {
        this(blockType, name, hardness, DivineRPGTabs.BlocksTab);
    }

    public BlockMod(EnumBlockType blockType, String name, float hardness, int harvest) {
        this(blockType, name, hardness, DivineRPGTabs.BlocksTab);
        setHarvestLevel("pickaxe", harvest);
    }

    public BlockMod(EnumBlockType blockType, String name, float hardness, CreativeTabs tab) {
        super(blockType.getMaterial());
        this.setSoundType(blockType.getSound());
        this.setUnlocalizedName(name);
        this.setRegistryName(Reference.MODID, name);
        this.setHardness(hardness);
        this.setCreativeTab(tab);
    }
}