
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P162_AgentChangeModel
    extends GWAction
{

    public long agentID;
    public long nPCLocalID;

    @Override
    public short getHeader() {
        return  162;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setNPCLocalID(long nPCLocalID) {
        this.nPCLocalID = nPCLocalID;
    }

}