
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P118_Unknown
    extends GWAction
{

    public long unknown1;
    public int unknown2;
    public short unknown3;

    @Override
    public short getHeader() {
        return  118;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public int getUnknown2() {
        return unknown2;
    }

    public short getUnknown3() {
        return unknown3;
    }

}