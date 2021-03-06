
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P094_RequestFile
    extends GWMessage
{

    private long file;

    @Override
    public short getHeader() {
        return  94;
    }

    public void setFile(long file) {
        this.file = file;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P094_RequestFile[");
        sb.append("file=").append(this.file).append("]");
        return sb.toString();
    }

}
