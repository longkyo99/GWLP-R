
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P146_DisplayDialogue
    extends GWAction
{

    public long agentID;
    public String name;
    public short type;
    public String text;

    @Override
    public short getHeader() {
        return  146;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(short type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

}