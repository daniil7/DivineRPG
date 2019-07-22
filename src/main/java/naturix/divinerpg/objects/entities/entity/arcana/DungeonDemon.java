package naturix.divinerpg.objects.entities.entity.arcana;

import naturix.divinerpg.objects.entities.entity.EntityDivineRPGMob;
import naturix.divinerpg.registry.ModSounds;
import naturix.divinerpg.utils.Reference;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class DungeonDemon extends EntityDivineRPGMob {
    public static final ResourceLocation LOOT = new ResourceLocation(Reference.MODID, "entities/arcana/dungeon_demon");

    public DungeonDemon(World world) {
        super(world);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        addAttackingAI();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(85.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(17.0D);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.DUNGEON_PRISONER;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource s) {
        return ModSounds.DUNGEON_PRISONER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.DUNGEON_PRISONER_HURT;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return this.LOOT;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 40.0D && super.getCanSpawnHere();
    }
}
