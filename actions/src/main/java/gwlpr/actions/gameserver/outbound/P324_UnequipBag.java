
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P324_UnequipBag
    extends GWAction
{

    public int itemStreamID;
    public int pageID;

    @Override
    public short getHeader() {
        return  324;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

}