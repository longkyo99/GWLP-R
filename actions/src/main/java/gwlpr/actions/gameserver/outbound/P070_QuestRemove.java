
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P070_QuestRemove
    extends GWAction
{

    public long iD;

    @Override
    public short getHeader() {
        return  70;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

}