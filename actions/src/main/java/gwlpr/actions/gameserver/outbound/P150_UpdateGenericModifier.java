
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P150_UpdateGenericModifier
    extends GWAction
{

    public long valueID;
    public long agentID;
    public long value;

    @Override
    public short getHeader() {
        return  150;
    }

    public void setValueID(long valueID) {
        this.valueID = valueID;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setValue(long value) {
        this.value = value;
    }

}