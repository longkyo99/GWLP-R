
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P240_VanquishProgress
    extends GWAction
{

    public long foesVanquished;
    public long foesRemaining;

    @Override
    public short getHeader() {
        return  240;
    }

    public void setFoesVanquished(long foesVanquished) {
        this.foesVanquished = foesVanquished;
    }

    public void setFoesRemaining(long foesRemaining) {
        this.foesRemaining = foesRemaining;
    }

}