/* --------------------------Codigo de Usuario----------------------- */
package gramatica;

import java_cup.runtime.*;
import java.io.Reader;
      
%% 
%class AnalizadorLexico

%line
%column

%cup
%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

Newline = \r|\n|\r\n
Espacio     = {Newline}|[ \t\f]
Num = 0 | [1-9][0-9]*
Id = [a-zA-Z|_]([a-zA-Z|0-9]{0,31})


%%
   
<YYINITIAL> {
   
    "+"                {  System.out.print(" + ");
                          return symbol(sym.OP_SUMA);  }
    "-"                {  System.out.print(" - ");
                          return symbol(sym.OP_RESTA); }
    "*"                {  System.out.print(" * ");
                          return symbol(sym.OP_MULT);  }
    "/"                {  System.out.print(" * ");
                          return symbol(sym.OP_DIV);   }                          
    "("                {  System.out.print(" ( ");
                          return symbol(sym.PARENIZQ); }
    ")"                {  System.out.print(" ) ");
                          return symbol(sym.PARENDER); }
    "{"                {  System.out.print(" { ");
                          return symbol(sym.LLAVIZQ);  }
    "}"                {  System.out.print(" } ");
                          return symbol(sym.LLAVDER);  }

    "="                {  System.out.print(" = ");
                          return symbol(sym.ASIGN, new String(yytext()));    }
    "<"                {  System.out.print(" < ");
                          return symbol(sym.MENQUE, new String(yytext()));   }
    ">"                {  System.out.print(" > ");
                          return symbol(sym.MAYQUE, new String(yytext()));   }
    "<="               {  System.out.print(" <= ");
                          return symbol(sym.MENIGUAL, new String(yytext())); }
    ">="               {  System.out.print(" >= ");
                          return symbol(sym.MAYIGUAL, new String(yytext())); }
    "=="               {  System.out.print(" == ");
                          return symbol(sym.IGUAL, new String(yytext()));    }
    "!="               {  System.out.print(" != ");
                          return symbol(sym.DISTINTO, new String(yytext())); }

    "true"             {  System.out.print("true");
                          return symbol(sym.TRUE);     }
    "false"            {  System.out.print("false");
                          return symbol(sym.FALSE);    }
    "si"               {  System.out.print(" si ");
                          return symbol(sym.SI, new String(yytext()));       }
    "sino"             {  System.out.print(" sino ");
                          return symbol(sym.SINO, new String(yytext()));     }
    "haga"             {  System.out.print(" haga ");
                          return symbol(sym.HAGA, new String(yytext()));     }
    "entonces"         {  System.out.print(" entonces ");
                          return symbol(sym.ENTONCES, new String(yytext())); }
    "mientras"         {  System.out.print(" mientras ");
                          return symbol(sym.MIENTRAS, new String(yytext())); }
    "declarar"         {  System.out.print("declarar ");
                          return symbol(sym.DECLARAR, new String(yytext())); }

    "mover"            {  System.out.print(" mover ");
                          return symbol(sym.MOVER, new String(yytext()));    }
    "recto"            {  System.out.print(" recto ");
                          return symbol(sym.RECTO, new String(yytext()));    }
    "circular"         {  System.out.print(" circular ");
                          return symbol(sym.CIRCULAR, new String(yytext())); }

    "meñique"          {  System.out.print(" meñique ");
                          return symbol(sym.MENIQUE, new String(yytext()));}
    "anular"           {  System.out.print(" anular ");
                          return symbol(sym.ANULAR, new String(yytext())); }
    "medio"            {  System.out.print(" medio ");
                          return symbol(sym.MEDIO, new String(yytext()));  }
    "índice"           {  System.out.print(" índice ");
                          return symbol(sym.INDICE, new String(yytext())); }
    "pulgar"           {  System.out.print(" pulgar ");
                          return symbol(sym.PULGAR, new String(yytext())); }

    {Id}               {  System.out.print(yytext());
                          return symbol(sym.ID, new String(yytext()));     }     
    {Num}              {  System.out.print(yytext()); 
                          return symbol(sym.NUM, new Integer(yytext()));   }

    {Newline}          {  System.out.print(yytext());  }

    {Espacio}          {  /* ignora el espacio */      } 

}

[^]                    { throw new Error("Caracter ilegal <"+yytext()+">"); }
