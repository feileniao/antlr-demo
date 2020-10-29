package com.antlr4.antlr.com.antlr4.antlr.lexer.com.antlr4.antlr;

import org.antlr.v4.runtime.*;

/**
 * @author zpf
 * @date 2020/10/28
 * @description
 */
public abstract class PlSqlLexerBase extends Lexer
{
    public PlSqlLexerBase(CharStream input)
    {
        super(input);
    }

    protected boolean IsNewlineAtPos(int pos)
    {
        int la = _input.LA(pos);
        return la == -1 || la == '\n';
    }
}
