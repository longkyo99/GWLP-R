
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P231_TitleRankData
    extends GWAction
{

    public long rankId;
    public long unknown1;
    public long rank;
    public String name;

    @Override
    public short getHeader() {
        return  231;
    }

    public void setRankId(long rankId) {
        this.rankId = rankId;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

}