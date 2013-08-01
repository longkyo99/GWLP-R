
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P462_PartySearchGeneral
    extends GWAction
{

    public int localID;
    public int district;
    public short districtMatch;
    public short partySize;
    public short heroes;
    public short type;
    public short hardMode;
    public String message;
    public String characterName;
    public short primaryProf;
    public short secondaryProf;
    public short level;
    public long unknown1;

    @Override
    public short getHeader() {
        return  462;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public void setDistrictMatch(short districtMatch) {
        this.districtMatch = districtMatch;
    }

    public void setPartySize(short partySize) {
        this.partySize = partySize;
    }

    public void setHeroes(short heroes) {
        this.heroes = heroes;
    }

    public void setType(short type) {
        this.type = type;
    }

    public void setHardMode(short hardMode) {
        this.hardMode = hardMode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setPrimaryProf(short primaryProf) {
        this.primaryProf = primaryProf;
    }

    public void setSecondaryProf(short secondaryProf) {
        this.secondaryProf = secondaryProf;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

}