
package gwlpr.protocol.loginserver.outbound;

import java.util.Arrays;
import java.util.UUID;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P007_CharacterInfo
    extends GWMessage
{

    private long loginCount;
    private UUID characterUID;
    private long unknown1;
    private String characterName;
    /**
     * 
     * Contains the last outpost, level and looks of this
     * char.
     * 
     */
    @IsArray(constant = false, size = 64, prefixLength = 2)
    private byte[] characterInfo;

    @Override
    public short getHeader() {
        return  7;
    }

    public void setLoginCount(long loginCount) {
        this.loginCount = loginCount;
    }

    public void setCharacterUID(UUID characterUID) {
        this.characterUID = characterUID;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setCharacterInfo(byte[] characterInfo) {
        this.characterInfo = characterInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P007_CharacterInfo[");
        sb.append("loginCount=").append(this.loginCount).append(",characterUID=").append(this.characterUID.toString()).append(",unknown1=").append(this.unknown1).append(",characterName=").append(this.characterName.toString()).append(",characterInfo=").append(Arrays.toString(this.characterInfo)).append("]");
        return sb.toString();
    }

}
