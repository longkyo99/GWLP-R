
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P329_MoveBagIntoStorage
    extends GWAction
{

    public int itemStreamID;
    public long bagLocalID;
    public int pageID;
    public short slot;

    @Override
    public short getHeader() {
        return  329;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setBagLocalID(long bagLocalID) {
        this.bagLocalID = bagLocalID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

}