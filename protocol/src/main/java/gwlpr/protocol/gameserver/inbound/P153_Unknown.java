
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P153_Unknown
    extends GWMessage
{

    private int unknown1;

    @Override
    public short getHeader() {
        return  153;
    }

    public int getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P153_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append("]");
        return sb.toString();
    }

}