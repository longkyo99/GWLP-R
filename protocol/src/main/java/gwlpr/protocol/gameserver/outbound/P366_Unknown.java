
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P366_Unknown
    extends GWMessage
{

    private int unknown1;
    private String unknown2;
    private String unknown3;
    private int unknown4;
    private short unknown5;
    private short unknown6;
    private short unknown7;
    private short unknown8;
    private int unknown9;
    private int unknown10;
    private short unknown11;
    private short unknown12;
    private short unknown13;
    private short unknown14;
    private int unknown15;
    private int unknown16;
    private long unknown17;
    private long unknown18;
    private long unknown19;
    private short unknown20;

    @Override
    public short getHeader() {
        return  366;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(String unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(int unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(short unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(short unknown6) {
        this.unknown6 = unknown6;
    }

    public void setUnknown7(short unknown7) {
        this.unknown7 = unknown7;
    }

    public void setUnknown8(short unknown8) {
        this.unknown8 = unknown8;
    }

    public void setUnknown9(int unknown9) {
        this.unknown9 = unknown9;
    }

    public void setUnknown10(int unknown10) {
        this.unknown10 = unknown10;
    }

    public void setUnknown11(short unknown11) {
        this.unknown11 = unknown11;
    }

    public void setUnknown12(short unknown12) {
        this.unknown12 = unknown12;
    }

    public void setUnknown13(short unknown13) {
        this.unknown13 = unknown13;
    }

    public void setUnknown14(short unknown14) {
        this.unknown14 = unknown14;
    }

    public void setUnknown15(int unknown15) {
        this.unknown15 = unknown15;
    }

    public void setUnknown16(int unknown16) {
        this.unknown16 = unknown16;
    }

    public void setUnknown17(long unknown17) {
        this.unknown17 = unknown17;
    }

    public void setUnknown18(long unknown18) {
        this.unknown18 = unknown18;
    }

    public void setUnknown19(long unknown19) {
        this.unknown19 = unknown19;
    }

    public void setUnknown20(short unknown20) {
        this.unknown20 = unknown20;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P366_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append(",unknown3=").append(this.unknown3 .toString()).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(this.unknown6).append(",unknown7=").append(this.unknown7).append(",unknown8=").append(this.unknown8).append(",unknown9=").append(this.unknown9).append(",unknown10=").append(this.unknown10).append(",unknown11=").append(this.unknown11).append(",unknown12=").append(this.unknown12).append(",unknown13=").append(this.unknown13).append(",unknown14=").append(this.unknown14).append(",unknown15=").append(this.unknown15).append(",unknown16=").append(this.unknown16).append(",unknown17=").append(this.unknown17).append(",unknown18=").append(this.unknown18).append(",unknown19=").append(this.unknown19).append(",unknown20=").append(this.unknown20).append("]");
        return sb.toString();
    }

}