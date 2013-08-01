
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.GWAction;
import gwlpr.actions.utils.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * This is used to add guilds to the alliance tab of
 * the guild window. The guild must first be created
 * with P278 (or P279 for the player's guild).
 * 
 */
public final class P268_GuildAllyAdd
    extends GWAction
{

    public int localID;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    public byte[] guildHallData;
    public short type;
    public long joinDate;

    @Override
    public short getHeader() {
        return  268;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    public void setGuildHallData(byte[] guildHallData) {
        this.guildHallData = guildHallData;
    }

    public void setType(short type) {
        this.type = type;
    }

    public void setJoinDate(long joinDate) {
        this.joinDate = joinDate;
    }

}