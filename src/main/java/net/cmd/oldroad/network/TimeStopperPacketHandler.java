//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
/*
package xyz.przemyk.timestopper.network;

import java.util.Optional;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class TimeStopperPacketHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static SimpleChannel INSTANCE;
    private static int ID = 0;

    public TimeStopperPacketHandler() {
    }

    public static void init() {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation("timestopper", "main"), () -> {
            return "1";
        }, "1"::equals, "1"::equals);
        INSTANCE.registerMessage(ID++, PacketChangeTimeState.class, PacketChangeTimeState::toBytes, PacketChangeTimeState::new, PacketChangeTimeState::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    }
}
*/