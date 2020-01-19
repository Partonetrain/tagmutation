package info.partonetrain.tagmutation.client.gui;

import info.partonetrain.tagmutation.container.ConverterContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public class ConverterScreen extends ContainerScreen<ConverterContainer> {



    public ConverterScreen(final ConverterContainer container, final PlayerInventory inventory, final ITextComponent title) {
        super(container,inventory,title);
    }

    /**
     * Draws the background layer of this container (behind the items).
     *
     * @param partialTicks
     * @param mouseX
     * @param mouseY
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }
}
