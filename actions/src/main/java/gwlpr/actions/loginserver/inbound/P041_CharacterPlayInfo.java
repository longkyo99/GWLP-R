
package gwlpr.actions.loginserver.inbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P041_CharacterPlayInfo
    extends GWAction
{

    public long loginCount;
    public long unknown1;
    public long gameMapId;
    public long unknown2;
    public long unknown3;
    public long unknown4;

    @Override
    public short getHeader() {
        return  41;
    }

    public long getLoginCount() {
        return loginCount;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public long getGameMapId() {
        return gameMapId;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

    public long getUnknown4() {
        return unknown4;
    }

}