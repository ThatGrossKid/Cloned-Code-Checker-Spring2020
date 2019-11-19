/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import java.util.*;
import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class AConcat extends PConcat
{
    private final LinkedList<PUnExp> _unExps_ = new LinkedList<PUnExp>();

    public AConcat()
    {
        // Constructor
    }

    public AConcat(
        @SuppressWarnings("hiding") List<?> _unExps_)
    {
        // Constructor
        setUnExps(_unExps_);

    }

    @Override
    public Object clone()
    {
        return new AConcat(
            cloneList(this._unExps_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcat(this);
    }

    public LinkedList<PUnExp> getUnExps()
    {
        return this._unExps_;
    }

    public void setUnExps(List<?> list)
    {
        for(PUnExp e : this._unExps_)
        {
            e.parent(null);
        }
        this._unExps_.clear();

        for(Object obj_e : list)
        {
            PUnExp e = (PUnExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._unExps_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unExps_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unExps_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PUnExp> i = this._unExps_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PUnExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}