
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P282_Unknown
    extends GWAction
{

    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] unknown1;
    public short unknown2;

    @Override
    public short getHeader() {
        return  282;
    }

    public void setUnknown1(byte[] unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(short unknown2) {
        this.unknown2 = unknown2;
    }

}