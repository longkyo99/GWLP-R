
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P038_Unknown
    extends GWAction
{

    public short unknown1;

    @Override
    public short getHeader() {
        return  38;
    }

    public short getUnknown1() {
        return unknown1;
    }

}