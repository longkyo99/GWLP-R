
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P015_Unknown
    extends GWAction
{

    @IsArray(constant = false, size = 92, prefixLength = 2)
    public byte[] unknown1;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] unknown2;

    @Override
    public short getHeader() {
        return  15;
    }

    public byte[] getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

}