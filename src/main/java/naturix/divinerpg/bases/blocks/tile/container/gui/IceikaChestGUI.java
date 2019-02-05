package naturix.divinerpg.bases.blocks.tile.container.gui;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.bases.blocks.tile.block.TileEntityIceikaChest;
import naturix.divinerpg.bases.blocks.tile.container.ContainerIceikaChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * Created by LiteWolf101 on Feb
 * /01/2019
 */
public class IceikaChestGUI extends GuiContainer {
    private static final ResourceLocation GUI_ICEIKA_CHEST = new ResourceLocation(DivineRPG.modId + ":textures/gui/iceika_chest_gui.png");
    private final InventoryPlayer playerInventory;
    private final TileEntityIceikaChest te;

    public IceikaChestGUI(InventoryPlayer playerInventory, TileEntityIceikaChest chestInventory, EntityPlayer player) {
        super(new ContainerIceikaChest(playerInventory, chestInventory, player));
        this.playerInventory = playerInventory;
        this.te = chestInventory;

        this.ySize = 168;
        this.xSize = 176;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 3449263);
        this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 3449263);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1,1,1,1);
        this.mc.getTextureManager().bindTexture(GUI_ICEIKA_CHEST);
        drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
