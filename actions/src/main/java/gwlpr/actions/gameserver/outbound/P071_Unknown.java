
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P071_Unknown
    extends GWAction
{

    public long unknown1;
    public Vector2 unknown2;
    public int unknown3;
    public int unknown4;

    @Override
    public short getHeader() {
        return  71;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(Vector2 unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(int unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(int unknown4) {
        this.unknown4 = unknown4;
    }

}