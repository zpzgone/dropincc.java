package com.github.pfmiles.dropincc.impl.runtime;

/**
 * The common interface of all language parsers generated by dropincc.java
 * 
 * @author pf-miles
 * 
 */
public interface Parser {

    <T> T parse(String code);

}
