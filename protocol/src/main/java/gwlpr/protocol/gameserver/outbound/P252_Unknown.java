
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P252_Unknown
    extends GWMessage
{

    private long unknown1;

    @Override
    public short getHeader() {
        return  252;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P252_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}