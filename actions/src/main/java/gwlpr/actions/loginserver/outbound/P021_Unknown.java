
package gwlpr.actions.loginserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P021_Unknown
    extends GWAction
{

    public long unknown1;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    public byte[] unknown2;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    public byte[] unknown3;
    public long unknown4;
    public long unknown5;
    public long unknown6;

    @Override
    public short getHeader() {
        return  21;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(byte[] unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(long unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(long unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(long unknown6) {
        this.unknown6 = unknown6;
    }

}