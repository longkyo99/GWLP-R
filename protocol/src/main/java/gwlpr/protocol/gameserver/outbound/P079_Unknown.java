
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P079_Unknown
    extends GWMessage
{

    private long unknown1;

    @Override
    public short getHeader() {
        return  79;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P079_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}
