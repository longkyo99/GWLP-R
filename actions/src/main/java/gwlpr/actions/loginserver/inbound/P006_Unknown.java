
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P006_Unknown
    extends GWAction
{

    public long unknown1;
    public long unknown2;

    @Override
    public short getHeader() {
        return  6;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

}