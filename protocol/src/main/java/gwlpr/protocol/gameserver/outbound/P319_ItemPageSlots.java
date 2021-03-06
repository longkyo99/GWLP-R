
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P319_ItemPageSlots
    extends GWMessage
{

    private int itemStreamID;
    private int pageID;
    private short slots;

    @Override
    public short getHeader() {
        return  319;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    public void setSlots(short slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P319_ItemPageSlots[");
        sb.append("itemStreamID=").append(this.itemStreamID).append(",pageID=").append(this.pageID).append(",slots=").append(this.slots).append("]");
        return sb.toString();
    }

}
