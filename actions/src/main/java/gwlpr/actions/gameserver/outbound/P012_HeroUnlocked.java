
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P012_HeroUnlocked
    extends GWAction
{

    public short heroID;
    public short profession;
    public long nPCFile;
    public long modelFile;
    public short unknown1;

    @Override
    public short getHeader() {
        return  12;
    }

    public void setHeroID(short heroID) {
        this.heroID = heroID;
    }

    public void setProfession(short profession) {
        this.profession = profession;
    }

    public void setNPCFile(long nPCFile) {
        this.nPCFile = nPCFile;
    }

    public void setModelFile(long modelFile) {
        this.modelFile = modelFile;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

}