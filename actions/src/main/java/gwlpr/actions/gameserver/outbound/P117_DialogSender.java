
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P117_DialogSender
    extends GWAction
{

    public long agentID;

    @Override
    public short getHeader() {
        return  117;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

}