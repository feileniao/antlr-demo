grammar Hello;
//lexer grammar Hello;

//parser
prog:stat
;
stat:expr|NEWLINE
;

expr:multExpr(('+'|'-')multExpr)*
;
multExpr:atom(('*'|'/')atom)*
;
atom:'('expr')'
    |INT
    |ID
;

//lexer
ID:('a'..'z'|'A'..'Z')+;
INT:'0'..'9'+;
NEWLINE:'\r'?'\n';
WS:(' '|'\t'|'\n'|'\r')+{skip();};

//grammar Hello;      // 定义一个名为Hello的语法，名字与文件名一致
//r : A | B;     // "|"是备选分支的分隔符
//ID : [a-z]+;        // 定义ID标识符，由小写字符组成
//WS : [ \t\r\n]+ -> skip;    // 忽略空格、Tab、换行以及\r （Windows）
//A: 'a';
//B: 'b';