
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P086_SwapSkillsOnBar
    extends GWAction
{

    public long agentID;
    public long skillID1;
    public long unknown1;
    public long skillID2;
    public long unknown2;

    @Override
    public short getHeader() {
        return  86;
    }

    public long getAgentID() {
        return agentID;
    }

    public long getSkillID1() {
        return skillID1;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getSkillID2() {
        return skillID2;
    }

    public long getUnknown2() {
        return unknown2;
    }

}