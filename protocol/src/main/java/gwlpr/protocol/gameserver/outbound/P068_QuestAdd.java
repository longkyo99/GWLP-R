
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P068_QuestAdd
    extends GWMessage
{

    private long iD;
    private long status;
    private String category;
    private String name;
    private String givenBy;
    private int mapID;

    @Override
    public short getHeader() {
        return  68;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P068_QuestAdd[");
        sb.append("iD=").append(this.iD).append(",status=").append(this.status).append(",category=").append(this.category.toString()).append(",name=").append(this.name.toString()).append(",givenBy=").append(this.givenBy.toString()).append(",mapID=").append(this.mapID).append("]");
        return sb.toString();
    }

}