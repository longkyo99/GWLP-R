
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P058_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;
    public long agentID3;

    @Override
    public short getHeader() {
        return  58;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setAgentID3(long agentID3) {
        this.agentID3 = agentID3;
    }

}