
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P395_InstanceLoadDistrictInfo
    extends GWAction
{

    public long charAgent;
    public int mapID;
    public short isExplorable;
    public long districtAndRegion;
    public short language;
    public short isObserver;

    @Override
    public short getHeader() {
        return  395;
    }

    public void setCharAgent(long charAgent) {
        this.charAgent = charAgent;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public void setIsExplorable(short isExplorable) {
        this.isExplorable = isExplorable;
    }

    public void setDistrictAndRegion(long districtAndRegion) {
        this.districtAndRegion = districtAndRegion;
    }

    public void setLanguage(short language) {
        this.language = language;
    }

    public void setIsObserver(short isObserver) {
        this.isObserver = isObserver;
    }

}