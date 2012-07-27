/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.actions.intershardcom;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.GenericEventAction;
import com.realityshard.shardlet.Session;

/**
 * Answer of the AcceptSessionRequest from a MapShard to the LoginShard.
 *
 * @author miracle444
 */
public final class ISC_AcceptClientReplyAction extends GenericEventAction
{

    private boolean accepted;   // whether the MapShard accepted the session or not
    
    
    /**
     * Constructor.
     * 
     * @param   session     the session we are talking about.
     * @param   accepted    whether it was accepted by the MapShard or not.
     */
    public ISC_AcceptClientReplyAction(Session session, boolean accepted)
    {
        init(session);
        this.accepted = accepted;
    }

    
    /**
     * Getter.
     * 
     * @return  whether the MapShard accepted the session or not.
     */
    public boolean getAccepted()
    {
        return this.accepted;
    }
    
    
    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}