
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P184_Unknown
    extends GWAction
{

    public long unknown1;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] unknown2;
    public short unknown3;

    @Override
    public short getHeader() {
        return  184;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

    public short getUnknown3() {
        return unknown3;
    }

}