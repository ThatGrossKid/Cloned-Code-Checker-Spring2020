/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class TColon extends Token
{
    public TColon()
    {
        super.setText(":");
    }

    public TColon(int line, int pos)
    {
        super.setText(":");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TColon(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTColon(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TColon text.");
    }
}