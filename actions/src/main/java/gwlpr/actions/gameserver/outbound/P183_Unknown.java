
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P183_Unknown
    extends GWAction
{

    public short unknown1;
    public long unknown2;

    @Override
    public short getHeader() {
        return  183;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

}