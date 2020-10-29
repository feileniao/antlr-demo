//package com.antlr4.antlr;
//
//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.tree.*;
//
//
///**
// * @author zpf
// * @date 2020/10/27
// * @description
// */
//public class HelloMain {
//
//    public static void run(String expr) throws Exception {
//        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
//        ANTLRInputStream input = new ANTLRInputStream(expr);
//        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
//        com.antlr4.antlr.HelloLexer lexer = new com.antlr4.antlr.HelloLexer(input);
//        // 用词法分析器 lexer 构造一个记号流 tokens
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
//        com.antlr4.antlr.HelloParser parser = new com.antlr4.antlr.HelloParser(tokens);
//        // 最终调用语法分析器的规则 r（这个是我们在Hello.g4里面定义的那个规则），完成对表达式的验证
//        parser.prog();
//
//
//    }
//
//    public static void select() throws Exception {
//        // first, form input charstream from string
//        ANTLRInputStream input = new ANTLRInputStream("SELECT * FROM T1,T2 WHERE T1.A=T2.A(+) AND T1.A > 100");
//
////        CharStream input = CharStreams.fromString("select name from student;");
//
//        // 1. Lexer-Lexical analysis
//        // Create a lexer that feeds off of input CharStream.
//        com.antlr4.antlr.PlSqlLexer lexer = new com.antlr4.antlr.PlSqlLexer(input);
//
//        // 2. Create a buffer of tokens pulled from the lexer.
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        // 3. Parser-Syntax analysis
//        // Create a parser that feeds off the tokens buffer.
//        com.antlr4.antlr.SelectExampleParser parser = new com.antlr4.antlr.SelectExampleParser(tokens);
//
//        // 4. Begin parsing at "select" rule.
//        ParseTree tree = parser.sql();
//        System.out.println(tree.toStringTree(parser));
//    }
//
//    public static void main(String[] args) throws Exception{
//
//            select();
//    }
//}
