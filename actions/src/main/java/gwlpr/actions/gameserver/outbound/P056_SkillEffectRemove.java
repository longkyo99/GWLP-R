
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P056_SkillEffectRemove
    extends GWAction
{

    public long caster;
    public long buffID;

    @Override
    public short getHeader() {
        return  56;
    }

    public void setCaster(long caster) {
        this.caster = caster;
    }

    public void setBuffID(long buffID) {
        this.buffID = buffID;
    }

}