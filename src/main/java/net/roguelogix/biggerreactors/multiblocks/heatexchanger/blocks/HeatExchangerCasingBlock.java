package net.roguelogix.biggerreactors.multiblocks.heatexchanger.blocks;


import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.roguelogix.biggerreactors.multiblocks.heatexchanger.tiles.HeatExchangerCasingTile;
import net.roguelogix.phosphophyllite.multiblock.modular.IAssemblyStateBlock;
import net.roguelogix.phosphophyllite.multiblock.modular.rectangular.IAxisPositionBlock;
import net.roguelogix.phosphophyllite.registry.RegisterBlock;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
@RegisterBlock(name = "heat_exchanger_casing", tileEntityClass = HeatExchangerCasingTile.class)
public class HeatExchangerCasingBlock extends HeatExchangerBaseBlock implements IAssemblyStateBlock, IAxisPositionBlock {
    
    @RegisterBlock.Instance
    public static HeatExchangerCasingBlock INSTANCE;
    
    @Override
    public boolean isGoodForFrame() {
        return true;
    }
    
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new HeatExchangerCasingTile(pos, state);
    }
}
