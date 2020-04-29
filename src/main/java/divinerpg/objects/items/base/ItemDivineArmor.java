package divinerpg.objects.items.base;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import divinerpg.api.Reference;
import divinerpg.api.armor.IFullSetInfo;
import divinerpg.enums.ArmorInfo;
import divinerpg.enums.EnumArmor;
import divinerpg.registry.DivineRPGTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemDivineArmor extends ItemArmor implements IFullSetInfo {
    protected ArmorInfo armorInfo;

    public ItemDivineArmor(String name, ArmorMaterial armorMaterial, EntityEquipmentSlot slot, ArmorInfo info) {
        super(armorMaterial, 0, slot);
        this.armorInfo = info;

        setUnlocalizedName(name);
        setRegistryName(name);

        System.out.println(armorMaterial.getDamageReductionAmount(EntityEquipmentSlot.CHEST));
        this.setCreativeTab(DivineRPGTabs.armor);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn) {
        super.addInformation(item, worldIn, list, flagIn);
        list.addAll(armorInfo.toString(item, worldIn, 99, 99));
    }

    @Override
    public ITextComponent getFullSetPerks() {
        if (armorInfo == null)
            return null;

        return armorInfo.FullSetPerks;
    }
}