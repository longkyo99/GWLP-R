
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P449_PartyMemberRemove
    extends GWAction
{

    public int partyId;
    public int charLocalID;

    @Override
    public short getHeader() {
        return  449;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public void setCharLocalID(int charLocalID) {
        this.charLocalID = charLocalID;
    }

}