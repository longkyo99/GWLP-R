
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P105_HeroDestroy
    extends GWAction
{

    public long agentID;

    @Override
    public short getHeader() {
        return  105;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

}