
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P076_CharacterName
    extends GWAction
{

    public long localID;
    public String name;

    @Override
    public short getHeader() {
        return  76;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setName(String name) {
        this.name = name;
    }

}