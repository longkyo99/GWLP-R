
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P132_Unknown
    extends GWAction
{

    public String unknown1;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    public byte[] unknown2;

    @Override
    public short getHeader() {
        return  132;
    }

    public String getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

}