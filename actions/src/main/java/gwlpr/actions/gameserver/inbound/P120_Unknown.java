
package gwlpr.actions.gameserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P120_Unknown
    extends GWAction
{

    public short unknown1;
    public long unknown2;

    @Override
    public short getHeader() {
        return  120;
    }

    public short getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

}