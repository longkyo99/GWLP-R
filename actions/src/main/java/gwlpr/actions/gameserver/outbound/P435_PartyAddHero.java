
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P435_PartyAddHero
    extends GWAction
{

    public int partyId;
    public int charLocalID;
    public int agentID;
    public short heroID;
    public short level;

    @Override
    public short getHeader() {
        return  435;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public void setCharLocalID(int charLocalID) {
        this.charLocalID = charLocalID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public void setHeroID(short heroID) {
        this.heroID = heroID;
    }

    public void setLevel(short level) {
        this.level = level;
    }

}