
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P178_Unknown
    extends GWAction
{

    public long agentID1;

    @Override
    public short getHeader() {
        return  178;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

}