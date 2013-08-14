
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P033_UpdateAgentPosition
    extends GWMessage
{

    private long agentID;
    private Vector2 position;
    private int plane;

    @Override
    public short getHeader() {
        return  33;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P033_UpdateAgentPosition[");
        sb.append("agentID=").append(this.agentID).append(",position=").append(this.position.toString()).append(",plane=").append(this.plane).append("]");
        return sb.toString();
    }

}