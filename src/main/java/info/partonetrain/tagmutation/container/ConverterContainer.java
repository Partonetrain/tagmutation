package info.partonetrain.tagmutation.container;

import info.partonetrain.tagmutation.TagmutationCore;
import info.partonetrain.tagmutation.init.RegisterContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ConverterContainer extends Container {

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(TagmutationCore.MODID, "textures/gui/container/converter.png");

    /*temp crafting table dupe
    public ConverterContainer(@Nullable ContainerType<?> p_i50105_1_, int p_i50105_2_) {
        super(p_i50105_1_, p_i50105_2_);
    }
     */

    public ConverterContainer(final int windowId, final PlayerInventory playerInventory, PacketBuffer packetBuffer) {
        this(windowId, playerInventory, IWorldPosCallable.DUMMY);
    }

    public ConverterContainer(final int windowId, final PlayerInventory playerInventory, final IWorldPosCallable pos){
        super(RegisterContainer.CONVERTER_CONTAINER.get(), windowId);


    }


    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
