
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P018_Unknown
    extends GWAction
{

    public long agentID1;
    public Vector2 unknown2;
    public long unknown3;

    @Override
    public short getHeader() {
        return  18;
    }

    public long getAgentID1() {
        return agentID1;
    }

    public Vector2 getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

}