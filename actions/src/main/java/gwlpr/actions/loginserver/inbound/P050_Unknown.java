
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P050_Unknown
    extends GWAction
{

    public long unknown1;
    public String unknown2;

    @Override
    public short getHeader() {
        return  50;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public String getUnknown2() {
        return unknown2;
    }

}