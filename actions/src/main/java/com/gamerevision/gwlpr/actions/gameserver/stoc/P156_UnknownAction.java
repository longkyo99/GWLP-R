/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P156_UnknownAction extends GenericAction
{

    private float[] unknown1;
    private short unknown2;
    private int unknown3;


    public short getHeader()
    {
        return 156;
    }


    public void setUnknown1(float[] newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(short newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    private int getSize()
    {
        int size = 16;

        if (unknown1 == null)
        {
            return 0;
        }
        
        if (unknown1.length != 2)
        {
            return 0;
        }

        return size;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            buffer.putFloat(unknown1[0]);
            buffer.putFloat(unknown1[1]);
            buffer.putShort(unknown2);
            buffer.putInt(unknown3);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}