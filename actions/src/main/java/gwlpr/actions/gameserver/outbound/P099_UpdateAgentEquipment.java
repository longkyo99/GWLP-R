
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P099_UpdateAgentEquipment
    extends GWAction
{

    public long agentID;
    public long slot;
    public long item;

    @Override
    public short getHeader() {
        return  99;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSlot(long slot) {
        this.slot = slot;
    }

    public void setItem(long item) {
        this.item = item;
    }

}