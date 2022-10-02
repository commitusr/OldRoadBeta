//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.network;

import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.NetworkEvent.Context;
import xyz.przemyk.timestopper.capabilities.control.TimeState;
import xyz.przemyk.timestopper.capabilities.control.TimeStateHandlerProvider;

public class PacketChangeTimeState {
    private final TimeState timeState;
    private final UUID playerUUID;

    public PacketChangeTimeState(TimeState state, UUID playerUUID) {
        this.timeState = state;
        this.playerUUID = playerUUID;
    }

    public PacketChangeTimeState(FriendlyByteBuf buffer) {
        this.timeState = TimeState.values()[buffer.m_130242_()];
        this.playerUUID = buffer.m_130259_();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.m_130130_(this.timeState.ordinal());
        buffer.m_130077_(this.playerUUID);
    }

    public void handle(Supplier<Context> ctx) {
        Context context = (Context)ctx.get();
        context.enqueueWork(() -> {
            Player playerEntity = Minecraft.m_91087_().f_91073_.m_46003_(this.playerUUID);
            if (playerEntity != null) {
                playerEntity.getCapability(TimeStateHandlerProvider.TIME_STATE_CAP).ifPresent((handler) -> {
                    handler.timeState = this.timeState;
                });
            }

        });
        context.setPacketHandled(true);
    }
}
*/