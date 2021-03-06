
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P432_Unknown
    extends GWMessage
{

    private int unknown1;
    private int unknown2;
    private String unknown3;
    private short unknown4;
    private short unknown5;

    @Override
    public short getHeader() {
        return  432;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(short unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(short unknown5) {
        this.unknown5 = unknown5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P432_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3 .toString()).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append("]");
        return sb.toString();
    }

}
