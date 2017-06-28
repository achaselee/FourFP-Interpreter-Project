package com.example.lee.FourFP;

/**
 *
 *  AST reference from Bastian Molkenthin at sunshine2k.de:
 *  http://www.sunshine2k.de/coding/java/SimpleParser/SimpleParser.html#ch1
 *
 * */

public class ASTNode {

    public ASTNode leftT;
    public ASTNode rightT;
    public Object value;

        public ASTNode(Object val){
        leftT = rightT = null;
        value = val;
    }

}
