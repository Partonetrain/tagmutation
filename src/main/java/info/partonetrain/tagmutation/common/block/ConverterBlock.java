package info.partonetrain.tagmutation.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class ConverterBlock extends Block {

    private static final ITextComponent GuiText = new TranslationTextComponent("gui.tagmutation.converter", new Object[0]);

    public ConverterBlock(Properties properties) {
        super(properties);
    }


    public ActionResultType func_225533_a_(BlockState state, World ServerWorld, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRT) {
        if (ServerWorld.isRemote) {
            return ActionResultType.SUCCESS;
        } else {
            player.openContainer(state.getContainer(ServerWorld, pos));
            return ActionResultType.SUCCESS;
        }
    }


    public INamedContainerProvider getContainer(BlockState state, World ServerWorld, BlockPos pos) {
        return new SimpleNamedContainerProvider((p_220270_2_, p_220270_3_, p_220270_4_) -> {
            return new WorkbenchContainer(p_220270_2_, p_220270_3_, IWorldPosCallable.of(ServerWorld, pos));
        }, GuiText);
    }
}
