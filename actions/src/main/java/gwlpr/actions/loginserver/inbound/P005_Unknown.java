
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P005_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    public byte[] unknown3;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    public byte[] unknown4;
    public String unknown5;

    @Override
    public short getHeader() {
        return  5;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public byte[] getUnknown3() {
        return unknown3;
    }

    public byte[] getUnknown4() {
        return unknown4;
    }

    public String getUnknown5() {
        return unknown5;
    }

}