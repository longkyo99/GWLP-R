/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *
 * @author _rusty
 */
@Embeddable 
public class SkillsequippedPK implements Serializable 
{
    @Basic(optional = false)
    @Column(name = "CharacterID")
    private int characterID;
    @Basic(optional = false)
    @Column(name = "SkillID")
    private int skillID;
    @Basic(optional = false)
    @Column(name = "Slot")
    private int slot;

    public SkillsequippedPK() {
    }

    public SkillsequippedPK(int characterID, int skillID, int slot) {
        this.characterID = characterID;
        this.skillID = skillID;
        this.slot = slot;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) characterID;
        hash += (int) skillID;
        hash += (int) slot;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkillsequippedPK)) {
            return false;
        }
        SkillsequippedPK other = (SkillsequippedPK) object;
        if (this.characterID != other.characterID) {
            return false;
        }
        if (this.skillID != other.skillID) {
            return false;
        }
        if (this.slot != other.slot) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gamerevision.gwlpr.database.SkillsequippedPK[ characterID=" + characterID + ", skillID=" + skillID + ", slot=" + slot + " ]";
    }

}