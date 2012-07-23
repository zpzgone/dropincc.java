package com.github.pfmiles.dropincc.impl.runtime.impl;

import java.util.Enumeration;
import java.util.Map;
import java.util.regex.Pattern;

import com.github.pfmiles.dropincc.impl.TokenType;
import com.github.pfmiles.dropincc.impl.runtime.Token;

/**
 * Lexer prototype using pre-written code skeleton. For string code lexing(not
 * stream lexing).
 * 
 * @author pf-miles
 * 
 */
public class PreWrittenStringLexerPrototype implements LexerPrototype {

    private Map<Integer, TokenType> groupNumToType;
    private Pattern tokenPatterns;
    private boolean whitespaceSensitive;

    public PreWrittenStringLexerPrototype(Map<Integer, TokenType> groupNumToType, Pattern tokenPatterns, boolean whitespaceSensitive) {
        this.groupNumToType = groupNumToType;
        this.tokenPatterns = tokenPatterns;
        this.whitespaceSensitive = whitespaceSensitive;
    }

    public Enumeration<Token> create(Object... code) {
        return new CodeLexer(this.tokenPatterns, this.groupNumToType, (String) code[0], this.whitespaceSensitive);
    }

}
