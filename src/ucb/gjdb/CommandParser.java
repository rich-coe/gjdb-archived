/* A Bison parser, made by GNU Bison 2.7.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2012 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* "%code imports" blocks.  */
/* Line 32 of lalr1.java  */
/* Line 28 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */

   package ucb.gjdb;

   import com.sun.jdi.*;
   import com.sun.jdi.request.*;

   import java.io.BufferedReader;
   import java.io.IOException;

   import java.util.Stack;
   import java.util.Collections;
   import java.util.Stack;
   import java.util.List;
   import java.util.ArrayList;
   import java.util.HashMap;
   import java.util.regex.Pattern;
   import java.util.regex.Matcher;
   import java.util.Formatter;

   import static ucb.gjdb.CommandException.ERROR;



/* Line 32 of lalr1.java  */
/* Line 63 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java"  */

/**
 * A Bison parser, automatically generated from <tt>/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class CommandParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.7";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int WORD = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int TEXT = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int INTLIT = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARLIT = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int STRINGLIT = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int IDENT = 263;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>CommandParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  private class YYLexer implements Lexer {
/* "%code lexer" blocks.  */
/* Line 146 of lalr1.java  */
/* Line 818 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */


private CommandLexer lexer;   

private Object yylval;

public YYLexer (CommandLexer cmdlexer)
{
    lexer = cmdlexer;
}

public int yylex () throws IOException
{
    try {
       int v = lexer.scan ();
       yylval = lexer.lexeme;
       return v;
    } catch (CommandException e) {
       throw e;
    } catch (Exception e) {
       throw ERROR ("problem reading expression: %s", e);
    }
}

public void yyerror(String s)
{
    if (lexer.lastCommand == null)
        throw ERROR ("Unknown command.");
    List<String> usage = GJDB.commandUsageMsgs (lexer.lastCommand);
    if (usage.size () == 0)
        throw ERROR ("Syntax error in command.");
    Formatter result = new Formatter ();
    String format;
    format = "Usage: %s";
    for (String S : usage) {
        result.format (format, S);
        format = "%n       %s";
    }
    throw ERROR ("%s", result);
}

public Object getLVal()
{
    return yylval;
}



/* Line 146 of lalr1.java  */
/* Line 186 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java"  */

  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  


  /**
   * Instantiates the Bison-generated parser.
   */
  public CommandParser (CommandLexer cmdlexer) {
    this.yylexer = new YYLexer(cmdlexer);
    
  }


  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  protected CommandParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 3:
  if (yyn == 3)
    /* Line 350 of lalr1.java  */
/* Line 60 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandRun ();
                  startHandler (); };
  break;
    

  case 4:
  if (yyn == 4)
    /* Line 350 of lalr1.java  */
/* Line 62 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = new CommandLineSpec (); };
  break;
    

  case 5:
  if (yyn == 5)
    /* Line 350 of lalr1.java  */
/* Line 63 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    {  evaluator.commandRun (((CommandLineSpec)(yystack.valueAt (4-(3))))); 
                   startHandler (); };
  break;
    

  case 6:
  if (yyn == 6)
    /* Line 350 of lalr1.java  */
/* Line 66 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandAttach (((Integer)(yystack.valueAt (2-(2))))); 
                  startHandler (); };
  break;
    

  case 7:
  if (yyn == 7)
    /* Line 350 of lalr1.java  */
/* Line 69 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandConnect (((String)(yystack.valueAt (4-(2)))) + ":" + ((String)(yystack.valueAt (4-(4))))); 
                  startHandler (); };
  break;
    

  case 8:
  if (yyn == 8)
    /* Line 350 of lalr1.java  */
/* Line 72 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandListen (((Integer)(yystack.valueAt (2-(2)))));
                  startHandler (); };
  break;
    

  case 9:
  if (yyn == 9)
    /* Line 350 of lalr1.java  */
/* Line 75 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandDetach (); };
  break;
    

  case 10:
  if (yyn == 10)
    /* Line 350 of lalr1.java  */
/* Line 77 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.PRINT, ' ', false); 
                  showPrompt = false; };
  break;
    

  case 11:
  if (yyn == 11)
    /* Line 350 of lalr1.java  */
/* Line 80 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), printDepth (((String)(yystack.valueAt (5-(4))))), printFormat (((String)(yystack.valueAt (5-(4))))),
                                          false);
                  showPrompt = false; };
  break;
    

  case 12:
  if (yyn == 12)
    /* Line 350 of lalr1.java  */
/* Line 84 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), ((Integer)(yystack.valueAt (5-(4)))), ' ', false);
                  showPrompt = false; };
  break;
    

  case 13:
  if (yyn == 13)
    /* Line 350 of lalr1.java  */
/* Line 87 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (2-(2)))), evaluator.NO_PRINT, ' ', false);
                  showPrompt = false; };
  break;
    

  case 14:
  if (yyn == 14)
    /* Line 350 of lalr1.java  */
/* Line 90 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSetClass (""); };
  break;
    

  case 15:
  if (yyn == 15)
    /* Line 350 of lalr1.java  */
/* Line 92 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSetClass (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 16:
  if (yyn == 16)
    /* Line 350 of lalr1.java  */
/* Line 94 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSetArgs (new CommandLineSpec ()); };
  break;
    

  case 17:
  if (yyn == 17)
    /* Line 350 of lalr1.java  */
/* Line 95 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = new CommandLineSpec (); };
  break;
    

  case 18:
  if (yyn == 18)
    /* Line 350 of lalr1.java  */
/* Line 96 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSetArgs (((CommandLineSpec)(yystack.valueAt (4-(3))))); };
  break;
    

  case 19:
  if (yyn == 19)
    /* Line 350 of lalr1.java  */
/* Line 98 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (((String)(yystack.valueAt (3-(2)))), false); };
  break;
    

  case 20:
  if (yyn == 20)
    /* Line 350 of lalr1.java  */
/* Line 100 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (null, false); };
  break;
    

  case 21:
  if (yyn == 21)
    /* Line 350 of lalr1.java  */
/* Line 102 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhereAll (false); };
  break;
    

  case 22:
  if (yyn == 22)
    /* Line 350 of lalr1.java  */
/* Line 104 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (((String)(yystack.valueAt (3-(2)))), true); };
  break;
    

  case 23:
  if (yyn == 23)
    /* Line 350 of lalr1.java  */
/* Line 106 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (null, true); };
  break;
    

  case 24:
  if (yyn == 24)
    /* Line 350 of lalr1.java  */
/* Line 108 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhereAll (true); };
  break;
    

  case 25:
  if (yyn == 25)
    /* Line 350 of lalr1.java  */
/* Line 110 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUp (((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 26:
  if (yyn == 26)
    /* Line 350 of lalr1.java  */
/* Line 112 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUp (-((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 27:
  if (yyn == 27)
    /* Line 350 of lalr1.java  */
/* Line 114 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandFrame (((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 28:
  if (yyn == 28)
    /* Line 350 of lalr1.java  */
/* Line 116 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSave (); 
                  showPrompt = false; };
  break;
    

  case 29:
  if (yyn == 29)
    /* Line 350 of lalr1.java  */
/* Line 119 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    {  evaluator.commandSave (((String)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4)))));
                   showPrompt = false; };
  break;
    

  case 30:
  if (yyn == 30)
    /* Line 350 of lalr1.java  */
/* Line 122 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPtype (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 31:
  if (yyn == 31)
    /* Line 350 of lalr1.java  */
/* Line 124 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.EXAMINE, ' ', true);
                  showPrompt = false; };
  break;
    

  case 32:
  if (yyn == 32)
    /* Line 350 of lalr1.java  */
/* Line 127 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), printDepth (((String)(yystack.valueAt (5-(4))))), 
                                          printFormat (((String)(yystack.valueAt (5-(4))))), true);
                  showPrompt = false; };
  break;
    

  case 33:
  if (yyn == 33)
    /* Line 350 of lalr1.java  */
/* Line 131 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), ((Integer)(yystack.valueAt (5-(4)))), ' ', true);
                  showPrompt = false; };
  break;
    

  case 34:
  if (yyn == 34)
    /* Line 350 of lalr1.java  */
/* Line 134 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "compressed", 0); };
  break;
    

  case 35:
  if (yyn == 35)
    /* Line 350 of lalr1.java  */
/* Line 136 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "pretty", 0); };
  break;
    

  case 36:
  if (yyn == 36)
    /* Line 350 of lalr1.java  */
/* Line 138 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "elements", ((Integer)(yystack.valueAt (4-(4))))); };
  break;
    

  case 37:
  if (yyn == 37)
    /* Line 350 of lalr1.java  */
/* Line 140 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "max-frames", ((Integer)(yystack.valueAt (4-(4))))); };
  break;
    

  case 38:
  if (yyn == 38)
    /* Line 350 of lalr1.java  */
/* Line 142 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "return", 1); };
  break;
    

  case 39:
  if (yyn == 39)
    /* Line 350 of lalr1.java  */
/* Line 144 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "return", 0); };
  break;
    

  case 40:
  if (yyn == 40)
    /* Line 350 of lalr1.java  */
/* Line 146 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "prefix", 0); };
  break;
    

  case 41:
  if (yyn == 41)
    /* Line 350 of lalr1.java  */
/* Line 148 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "prefix", 1); };
  break;
    

  case 42:
  if (yyn == 42)
    /* Line 350 of lalr1.java  */
/* Line 150 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("print", "prefix", 2); };
  break;
    

  case 43:
  if (yyn == 43)
    /* Line 350 of lalr1.java  */
/* Line 152 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("stdin", "on", 0); };
  break;
    

  case 44:
  if (yyn == 44)
    /* Line 350 of lalr1.java  */
/* Line 154 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("stdin", "off", 0); };
  break;
    

  case 45:
  if (yyn == 45)
    /* Line 350 of lalr1.java  */
/* Line 156 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.PRINT, ' ', false); };
  break;
    

  case 46:
  if (yyn == 46)
    /* Line 350 of lalr1.java  */
/* Line 158 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSet ("history", "save", ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 47:
  if (yyn == 47)
    /* Line 350 of lalr1.java  */
/* Line 160 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPrint (((String)(yystack.valueAt (4-(2)))) + " " + ((String)(yystack.valueAt (4-(4)))),
                                          evaluator.PRINT, ' ', false); };
  break;
    

  case 48:
  if (yyn == 48)
    /* Line 350 of lalr1.java  */
/* Line 163 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThread (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 49:
  if (yyn == 49)
    /* Line 350 of lalr1.java  */
/* Line 165 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreadGroup (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 50:
  if (yyn == 50)
    /* Line 350 of lalr1.java  */
/* Line 167 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSuspend (); };
  break;
    

  case 51:
  if (yyn == 51)
    /* Line 350 of lalr1.java  */
/* Line 169 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSuspend (); };
  break;
    

  case 52:
  if (yyn == 52)
    /* Line 350 of lalr1.java  */
/* Line 171 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSuspend (); };
  break;
    

  case 53:
  if (yyn == 53)
    /* Line 350 of lalr1.java  */
/* Line 173 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandSuspend (((List)(yystack.valueAt (3-(2))))); };
  break;
    

  case 54:
  if (yyn == 54)
    /* Line 350 of lalr1.java  */
/* Line 175 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandResume (); };
  break;
    

  case 55:
  if (yyn == 55)
    /* Line 350 of lalr1.java  */
/* Line 177 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandResume (((List)(yystack.valueAt (3-(2))))); };
  break;
    

  case 56:
  if (yyn == 56)
    /* Line 350 of lalr1.java  */
/* Line 179 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandKill (((String)(yystack.valueAt (3-(2)))), ((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 57:
  if (yyn == 57)
    /* Line 350 of lalr1.java  */
/* Line 181 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandInterrupt (); };
  break;
    

  case 58:
  if (yyn == 58)
    /* Line 350 of lalr1.java  */
/* Line 183 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandInterrupt (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 59:
  if (yyn == 59)
    /* Line 350 of lalr1.java  */
/* Line 185 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandBreak (); };
  break;
    

  case 60:
  if (yyn == 60)
    /* Line 350 of lalr1.java  */
/* Line 187 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandBreak (((BreakpointSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 61:
  if (yyn == 61)
    /* Line 350 of lalr1.java  */
/* Line 189 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClear (((List)(yystack.valueAt (3-(3))))); };
  break;
    

  case 62:
  if (yyn == 62)
    /* Line 350 of lalr1.java  */
/* Line 191 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCommand (reader, false); };
  break;
    

  case 63:
  if (yyn == 63)
    /* Line 350 of lalr1.java  */
/* Line 193 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCommand (((Integer)(yystack.valueAt (2-(2)))), reader, false); };
  break;
    

  case 64:
  if (yyn == 64)
    /* Line 350 of lalr1.java  */
/* Line 195 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCond (((String)(yystack.valueAt (5-(4))))); };
  break;
    

  case 65:
  if (yyn == 65)
    /* Line 350 of lalr1.java  */
/* Line 197 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCond (((Integer)(yystack.valueAt (4-(2)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 66:
  if (yyn == 66)
    /* Line 350 of lalr1.java  */
/* Line 199 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCatch (); };
  break;
    

  case 67:
  if (yyn == 67)
    /* Line 350 of lalr1.java  */
/* Line 201 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCatch (((EventRequestSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 68:
  if (yyn == 68)
    /* Line 350 of lalr1.java  */
/* Line 203 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPass (); };
  break;
    

  case 69:
  if (yyn == 69)
    /* Line 350 of lalr1.java  */
/* Line 205 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandPass (((EventRequestSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 70:
  if (yyn == 70)
    /* Line 350 of lalr1.java  */
/* Line 207 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWatch (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 71:
  if (yyn == 71)
    /* Line 350 of lalr1.java  */
/* Line 209 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUnwatch (); };
  break;
    

  case 72:
  if (yyn == 72)
    /* Line 350 of lalr1.java  */
/* Line 211 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUnwatch (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 73:
  if (yyn == 73)
    /* Line 350 of lalr1.java  */
/* Line 213 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandDelete (); };
  break;
    

  case 74:
  if (yyn == 74)
    /* Line 350 of lalr1.java  */
/* Line 215 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandDelete (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 75:
  if (yyn == 75)
    /* Line 350 of lalr1.java  */
/* Line 217 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandEnable (((Integer)(yystack.valueAt (2-(2)))), false); };
  break;
    

  case 76:
  if (yyn == 76)
    /* Line 350 of lalr1.java  */
/* Line 219 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandEnable (((Integer)(yystack.valueAt (2-(2)))), true); };
  break;
    

  case 77:
  if (yyn == 77)
    /* Line 350 of lalr1.java  */
/* Line 221 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandIgnore (((Integer)(yystack.valueAt (3-(2)))), ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 78:
  if (yyn == 78)
    /* Line 350 of lalr1.java  */
/* Line 223 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandTrace (((Integer)(yystack.valueAt (4-(3)))), null); };
  break;
    

  case 79:
  if (yyn == 79)
    /* Line 350 of lalr1.java  */
/* Line 225 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandTrace (((Integer)(yystack.valueAt (5-(3)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 80:
  if (yyn == 80)
    /* Line 350 of lalr1.java  */
/* Line 227 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUntrace (); };
  break;
    

  case 81:
  if (yyn == 81)
    /* Line 350 of lalr1.java  */
/* Line 229 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); };
  break;
    

  case 82:
  if (yyn == 82)
    /* Line 350 of lalr1.java  */
/* Line 232 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_INTO, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 83:
  if (yyn == 83)
    /* Line 350 of lalr1.java  */
/* Line 235 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); };
  break;
    

  case 84:
  if (yyn == 84)
    /* Line 350 of lalr1.java  */
/* Line 238 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OVER, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 85:
  if (yyn == 85)
    /* Line 350 of lalr1.java  */
/* Line 241 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandStep (StepRequest.STEP_MIN, 
                                         StepRequest.STEP_INTO, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 86:
  if (yyn == 86)
    /* Line 350 of lalr1.java  */
/* Line 244 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandCont (); };
  break;
    

  case 87:
  if (yyn == 87)
    /* Line 350 of lalr1.java  */
/* Line 246 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandExclude (); };
  break;
    

  case 88:
  if (yyn == 88)
    /* Line 350 of lalr1.java  */
/* Line 248 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandExcludeClear (); };
  break;
    

  case 89:
  if (yyn == 89)
    /* Line 350 of lalr1.java  */
/* Line 250 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandExcludeReset (); };
  break;
    

  case 90:
  if (yyn == 90)
    /* Line 350 of lalr1.java  */
/* Line 252 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandExcludeAdd (((List)(yystack.valueAt (4-(4))))); };
  break;
    

  case 91:
  if (yyn == 91)
    /* Line 350 of lalr1.java  */
/* Line 254 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandExcludeSet (((List)(yystack.valueAt (3-(3))))); };
  break;
    

  case 92:
  if (yyn == 92)
    /* Line 350 of lalr1.java  */
/* Line 256 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandLock (((String)(yystack.valueAt (3-(3))))); 
                  showPrompt = false; };
  break;
    

  case 93:
  if (yyn == 93)
    /* Line 350 of lalr1.java  */
/* Line 259 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandEnableGC (((String)(yystack.valueAt (3-(3)))), false); 
                  showPrompt = false; };
  break;
    

  case 94:
  if (yyn == 94)
    /* Line 350 of lalr1.java  */
/* Line 262 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandEnableGC (((String)(yystack.valueAt (3-(3)))), true); 
                  showPrompt = false; };
  break;
    

  case 95:
  if (yyn == 95)
    /* Line 350 of lalr1.java  */
/* Line 265 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandLocals (); };
  break;
    

  case 96:
  if (yyn == 96)
    /* Line 350 of lalr1.java  */
/* Line 267 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClasses (); };
  break;
    

  case 97:
  if (yyn == 97)
    /* Line 350 of lalr1.java  */
/* Line 269 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClass (((String)(yystack.valueAt (6-(5)))), false); };
  break;
    

  case 98:
  if (yyn == 98)
    /* Line 350 of lalr1.java  */
/* Line 271 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClass (((String)(yystack.valueAt (7-(5)))), true); };
  break;
    

  case 99:
  if (yyn == 99)
    /* Line 350 of lalr1.java  */
/* Line 273 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandMethods (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 100:
  if (yyn == 100)
    /* Line 350 of lalr1.java  */
/* Line 275 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandFields (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 101:
  if (yyn == 101)
    /* Line 350 of lalr1.java  */
/* Line 277 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreads (); };
  break;
    

  case 102:
  if (yyn == 102)
    /* Line 350 of lalr1.java  */
/* Line 279 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreads (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 103:
  if (yyn == 103)
    /* Line 350 of lalr1.java  */
/* Line 281 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreadGroups (); };
  break;
    

  case 104:
  if (yyn == 104)
    /* Line 350 of lalr1.java  */
/* Line 283 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClasspathInfo (); };
  break;
    

  case 105:
  if (yyn == 105)
    /* Line 350 of lalr1.java  */
/* Line 285 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreadlocks (); };
  break;
    

  case 106:
  if (yyn == 106)
    /* Line 350 of lalr1.java  */
/* Line 287 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreadlocksAll (); };
  break;
    

  case 107:
  if (yyn == 107)
    /* Line 350 of lalr1.java  */
/* Line 289 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandThreadlocks (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 108:
  if (yyn == 108)
    /* Line 350 of lalr1.java  */
/* Line 291 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandInfoRun (); };
  break;
    

  case 109:
  if (yyn == 109)
    /* Line 350 of lalr1.java  */
/* Line 293 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); };
  break;
    

  case 110:
  if (yyn == 110)
    /* Line 350 of lalr1.java  */
/* Line 295 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); };
  break;
    

  case 111:
  if (yyn == 111)
    /* Line 350 of lalr1.java  */
/* Line 297 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); };
  break;
    

  case 112:
  if (yyn == 112)
    /* Line 350 of lalr1.java  */
/* Line 299 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (((String)(yystack.valueAt (4-(3)))), false); };
  break;
    

  case 113:
  if (yyn == 113)
    /* Line 350 of lalr1.java  */
/* Line 301 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhere (null, false); };
  break;
    

  case 114:
  if (yyn == 114)
    /* Line 350 of lalr1.java  */
/* Line 303 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandWhereAll (false); };
  break;
    

  case 115:
  if (yyn == 115)
    /* Line 350 of lalr1.java  */
/* Line 305 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandLoadclass (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 116:
  if (yyn == 116)
    /* Line 350 of lalr1.java  */
/* Line 307 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClasspath (); };
  break;
    

  case 117:
  if (yyn == 117)
    /* Line 350 of lalr1.java  */
/* Line 309 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandClasspath (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 118:
  if (yyn == 118)
    /* Line 350 of lalr1.java  */
/* Line 311 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUse (); };
  break;
    

  case 119:
  if (yyn == 119)
    /* Line 350 of lalr1.java  */
/* Line 313 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUse (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 120:
  if (yyn == 120)
    /* Line 350 of lalr1.java  */
/* Line 315 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandMonitor (); };
  break;
    

  case 121:
  if (yyn == 121)
    /* Line 350 of lalr1.java  */
/* Line 317 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandMonitor (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 122:
  if (yyn == 122)
    /* Line 350 of lalr1.java  */
/* Line 319 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandUnmonitor (((Integer)(yystack.valueAt (2-(2))))); };
  break;
    

  case 123:
  if (yyn == 123)
    /* Line 350 of lalr1.java  */
/* Line 321 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandRead (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 124:
  if (yyn == 124)
    /* Line 350 of lalr1.java  */
/* Line 323 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandList (-1, null); };
  break;
    

  case 125:
  if (yyn == 125)
    /* Line 350 of lalr1.java  */
/* Line 325 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandList (((Integer)(yystack.valueAt (2-(2)))), null); };
  break;
    

  case 126:
  if (yyn == 126)
    /* Line 350 of lalr1.java  */
/* Line 327 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandList (-1, ((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 127:
  if (yyn == 127)
    /* Line 350 of lalr1.java  */
/* Line 329 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandLines (((String)(yystack.valueAt (3-(3)))), null); };
  break;
    

  case 128:
  if (yyn == 128)
    /* Line 350 of lalr1.java  */
/* Line 331 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandLines (((String)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 129:
  if (yyn == 129)
    /* Line 350 of lalr1.java  */
/* Line 333 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandBytecodes (((String)(yystack.valueAt (5-(4)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 130:
  if (yyn == 130)
    /* Line 350 of lalr1.java  */
/* Line 335 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandBytecodes (((String)(yystack.valueAt (6-(4)))), ((String)(yystack.valueAt (6-(6))))); };
  break;
    

  case 131:
  if (yyn == 131)
    /* Line 350 of lalr1.java  */
/* Line 337 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandVersion (GJDB.progname, Version.value); };
  break;
    

  case 132:
  if (yyn == 132)
    /* Line 350 of lalr1.java  */
/* Line 339 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandQuit (); };
  break;
    

  case 133:
  if (yyn == 133)
    /* Line 350 of lalr1.java  */
/* Line 341 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { GJDB.help (); };
  break;
    

  case 134:
  if (yyn == 134)
    /* Line 350 of lalr1.java  */
/* Line 343 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { GJDB.help (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 135:
  if (yyn == 135)
    /* Line 350 of lalr1.java  */
/* Line 345 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.commandRepeat (((Integer)(yystack.valueAt (3-(1)))), ((String)(yystack.valueAt (3-(3)))), reader); };
  break;
    

  case 136:
  if (yyn == 136)
    /* Line 350 of lalr1.java  */
/* Line 349 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 137:
  if (yyn == 137)
    /* Line 350 of lalr1.java  */
/* Line 352 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = 1; };
  break;
    

  case 138:
  if (yyn == 138)
    /* Line 350 of lalr1.java  */
/* Line 353 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 139:
  if (yyn == 139)
    /* Line 350 of lalr1.java  */
/* Line 357 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = -1; };
  break;
    

  case 140:
  if (yyn == 140)
    /* Line 350 of lalr1.java  */
/* Line 358 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 141:
  if (yyn == 141)
    /* Line 350 of lalr1.java  */
/* Line 362 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { ArrayList<Integer> L = new ArrayList<Integer> (); 
                          yyval = L; L.add (((Integer)(yystack.valueAt (1-(1))))); };
  break;
    

  case 142:
  if (yyn == 142)
    /* Line 350 of lalr1.java  */
/* Line 365 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((Integer)(yystack.valueAt (2-(2))))); };
  break;
    

  case 145:
  if (yyn == 145)
    /* Line 350 of lalr1.java  */
/* Line 374 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { ArrayList<String> v = new ArrayList<String> ();
                          v.add (((String)(yystack.valueAt (1-(1))))); 
                          yyval = v; };
  break;
    

  case 146:
  if (yyn == 146)
    /* Line 350 of lalr1.java  */
/* Line 378 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 150:
  if (yyn == 150)
    /* Line 350 of lalr1.java  */
/* Line 392 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (1-(0))));
                          spec.cmdArgs += " " + shellConvert (((String)(yystack.valueAt (1-(1))))); 
                          yyval = spec; };
  break;
    

  case 151:
  if (yyn == 151)
    /* Line 350 of lalr1.java  */
/* Line 396 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (3-(2))));
                          spec.cmdArgs = " " + shellConvert (((String)(yystack.valueAt (3-(1))))) 
                                         + spec.cmdArgs; 
                          yyval = spec; };
  break;
    

  case 152:
  if (yyn == 152)
    /* Line 350 of lalr1.java  */
/* Line 404 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((CommandLineSpec)(yystack.valueAt (1-(0)))); };
  break;
    

  case 153:
  if (yyn == 153)
    /* Line 350 of lalr1.java  */
/* Line 405 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((Object)(yystack.valueAt (2-(1)))); };
  break;
    

  case 154:
  if (yyn == 154)
    /* Line 350 of lalr1.java  */
/* Line 411 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (2-(0))));
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert (((String)(yystack.valueAt (2-(2)))));
                        };
  break;
    

  case 155:
  if (yyn == 155)
    /* Line 350 of lalr1.java  */
/* Line 417 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (2-(0))));
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert (((String)(yystack.valueAt (2-(2)))));
                        };
  break;
    

  case 156:
  if (yyn == 156)
    /* Line 350 of lalr1.java  */
/* Line 423 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (3-(0))));
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert (((String)(yystack.valueAt (3-(3)))));
                        };
  break;
    

  case 157:
  if (yyn == 157)
    /* Line 350 of lalr1.java  */
/* Line 431 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ""; };
  break;
    

  case 159:
  if (yyn == 159)
    /* Line 350 of lalr1.java  */
/* Line 436 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = null; };
  break;
    

  case 160:
  if (yyn == 160)
    /* Line 350 of lalr1.java  */
/* Line 438 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (3-(2)))); };
  break;
    

  case 161:
  if (yyn == 161)
    /* Line 350 of lalr1.java  */
/* Line 439 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = Collections.EMPTY_LIST; };
  break;
    

  case 162:
  if (yyn == 162)
    /* Line 350 of lalr1.java  */
/* Line 443 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { ArrayList<String> L = new ArrayList<String> (); 
                          yyval = L;
                          L.add (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 163:
  if (yyn == 163)
    /* Line 350 of lalr1.java  */
/* Line 447 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (3-(1)))); ((List)(yystack.valueAt (3-(1)))).add (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 165:
  if (yyn == 165)
    /* Line 350 of lalr1.java  */
/* Line 452 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (2-(1)))) + "[]"; };
  break;
    

  case 167:
  if (yyn == 167)
    /* Line 350 of lalr1.java  */
/* Line 457 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 168:
  if (yyn == 168)
    /* Line 350 of lalr1.java  */
/* Line 462 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (5-(1)))), ((String)(yystack.valueAt (5-(3)))), ((List)(yystack.valueAt (5-(4)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 169:
  if (yyn == 169)
    /* Line 350 of lalr1.java  */
/* Line 464 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (4-(1)))), ((Integer)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 170:
  if (yyn == 170)
    /* Line 350 of lalr1.java  */
/* Line 469 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { ArrayList<Object> L = new ArrayList<Object> ();
               yyval = L; 
               L.add (((BreakpointSpec)(yystack.valueAt (1-(1))))); };
  break;
    

  case 171:
  if (yyn == 171)
    /* Line 350 of lalr1.java  */
/* Line 473 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((BreakpointSpec)(yystack.valueAt (2-(2))))); };
  break;
    

  case 172:
  if (yyn == 172)
    /* Line 350 of lalr1.java  */
/* Line 477 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createBreakpointSpec (((Integer)(yystack.valueAt (1-(1))))); };
  break;
    

  case 173:
  if (yyn == 173)
    /* Line 350 of lalr1.java  */
/* Line 479 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (4-(1)))), ((String)(yystack.valueAt (4-(3)))), ((List)(yystack.valueAt (4-(4)))), null); };
  break;
    

  case 174:
  if (yyn == 174)
    /* Line 350 of lalr1.java  */
/* Line 481 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (3-(1)))), ((Integer)(yystack.valueAt (3-(3)))), null); };
  break;
    

  case 175:
  if (yyn == 175)
    /* Line 350 of lalr1.java  */
/* Line 485 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = "*." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 177:
  if (yyn == 177)
    /* Line 350 of lalr1.java  */
/* Line 488 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { if (((String)(yystack.valueAt (3-(1)))).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 178:
  if (yyn == 178)
    /* Line 350 of lalr1.java  */
/* Line 492 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { if (((String)(yystack.valueAt (2-(1)))).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)(yystack.valueAt (2-(1)))) + ".0"; };
  break;
    

  case 179:
  if (yyn == 179)
    /* Line 350 of lalr1.java  */
/* Line 499 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { ArrayList<String> L = new ArrayList<String> ();
                          L.add (((String)(yystack.valueAt (1-(1))))); 
                          yyval = L;
                        };
  break;
    

  case 180:
  if (yyn == 180)
    /* Line 350 of lalr1.java  */
/* Line 504 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((List)(yystack.valueAt (3-(1)))); ((List)(yystack.valueAt (3-(1)))).add (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 185:
  if (yyn == 185)
    /* Line 350 of lalr1.java  */
/* Line 515 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = "*"; };
  break;
    

  case 186:
  if (yyn == 186)
    /* Line 350 of lalr1.java  */
/* Line 516 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 187:
  if (yyn == 187)
    /* Line 350 of lalr1.java  */
/* Line 517 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + ".*"; };
  break;
    

  case 188:
  if (yyn == 188)
    /* Line 350 of lalr1.java  */
/* Line 521 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createExceptionSpec ("*." + ((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 189:
  if (yyn == 189)
    /* Line 350 of lalr1.java  */
/* Line 522 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createExceptionSpec (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 190:
  if (yyn == 190)
    /* Line 350 of lalr1.java  */
/* Line 526 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = null; };
  break;
    

  case 191:
  if (yyn == 191)
    /* Line 350 of lalr1.java  */
/* Line 528 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 192:
  if (yyn == 192)
    /* Line 350 of lalr1.java  */
/* Line 533 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createWatchSpec (((Integer)(yystack.valueAt (6-(2)))), ((String)(yystack.valueAt (6-(3)))), ((String)(yystack.valueAt (6-(4)))), null, ((String)(yystack.valueAt (6-(6))))); };
  break;
    

  case 193:
  if (yyn == 193)
    /* Line 350 of lalr1.java  */
/* Line 536 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = createWatchSpec (((Integer)(yystack.valueAt (9-(2)))), ((String)(yystack.valueAt (9-(3)))), null, ((String)(yystack.valueAt (9-(5)))), ((String)(yystack.valueAt (9-(9))))); };
  break;
    

  case 194:
  if (yyn == 194)
    /* Line 350 of lalr1.java  */
/* Line 540 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ""; };
  break;
    

  case 195:
  if (yyn == 195)
    /* Line 350 of lalr1.java  */
/* Line 541 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = "all"; };
  break;
    

  case 196:
  if (yyn == 196)
    /* Line 350 of lalr1.java  */
/* Line 542 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = "access"; };
  break;
    

  case 197:
  if (yyn == 197)
    /* Line 350 of lalr1.java  */
/* Line 546 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = EventRequest.SUSPEND_ALL; };
  break;
    

  case 198:
  if (yyn == 198)
    /* Line 350 of lalr1.java  */
/* Line 547 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = EventRequest.SUSPEND_NONE; };
  break;
    

  case 199:
  if (yyn == 199)
    /* Line 350 of lalr1.java  */
/* Line 548 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; };
  break;
    

  case 200:
  if (yyn == 200)
    /* Line 350 of lalr1.java  */
/* Line 553 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((String)(yystack.valueAt (2-(2)))); };
  break;
    

  case 201:
  if (yyn == 201)
    /* Line 350 of lalr1.java  */
/* Line 557 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { yyval = ((Object)(yystack.valueAt (0-(-1)))); };
  break;
    

  case 202:
  if (yyn == 202)
    /* Line 350 of lalr1.java  */
/* Line 562 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toDefaultMode (); };
  break;
    

  case 203:
  if (yyn == 203)
    /* Line 350 of lalr1.java  */
/* Line 565 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toBreakMode (); };
  break;
    

  case 204:
  if (yyn == 204)
    /* Line 350 of lalr1.java  */
/* Line 569 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toPrintMode (); };
  break;
    

  case 205:
  if (yyn == 205)
    /* Line 350 of lalr1.java  */
/* Line 573 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { evaluator.checkConnect (); };
  break;
    

  case 206:
  if (yyn == 206)
    /* Line 350 of lalr1.java  */
/* Line 577 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toBalancedCollectMode (); };
  break;
    

  case 207:
  if (yyn == 207)
    /* Line 350 of lalr1.java  */
/* Line 581 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toCollectMode (); };
  break;
    

  case 208:
  if (yyn == 208)
    /* Line 350 of lalr1.java  */
/* Line 585 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */
    { lexer.toRunArgsMode (); };
  break;
    


/* Line 350 of lalr1.java  */
/* Line 1978 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 0)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -162;
  private static final short yypact_[] =
  {
       292,  -162,  -162,    30,    29,    78,  -162,  -162,  -162,    46,
    -162,    50,    89,    83,    83,    30,  -162,  -162,  -162,   168,
      51,    52,  -162,    51,    51,    51,    51,  -162,  -162,    30,
      20,  -162,  -162,  -162,  -162,    30,    30,    30,    30,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,    47,  -162,  -162,  -162,
     155,  -162,  -162,  -162,  -162,    30,  -162,    81,  -162,  -162,
    -162,  -162,   108,    92,  -162,  -162,   144,  -162,  -162,   141,
    -162,  -162,  -162,   162,  -162,   170,  -162,   184,  -162,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,   186,  -162,
     182,  -162,   192,   145,  -162,    30,  -162,  -162,  -162,  -162,
     195,  -162,    51,  -162,    51,  -162,  -162,  -162,  -162,    38,
      33,  -162,  -162,  -162,    42,    42,  -162,   -27,  -162,    21,
    -162,    30,  -162,  -162,    30,   -27,   134,    53,  -162,    83,
      83,  -162,    32,  -162,  -162,  -162,  -162,  -162,  -162,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,    60,
     205,  -162,   210,   213,  -162,   215,  -162,  -162,  -162,   212,
    -162,  -162,  -162,   224,    45,   227,   154,  -162,  -162,    45,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,   164,  -162,
     228,  -162,  -162,    30,    30,   158,   148,  -162,  -162,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,
     135,  -162,    54,  -162,    33,  -162,    58,   230,   231,  -162,
     147,   150,  -162,  -162,  -162,  -162,    -2,  -162,  -162,   183,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,    43,  -162,
      16,   156,  -162,  -162,  -162,   212,  -162,  -162,   212,   249,
    -162,  -162,   171,  -162,  -162,  -162,  -162,   212,  -162,  -162,
    -162,    15,   212,  -162,   253,   252,    10,  -162,    93,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,  -162,
    -162,  -162,  -162,  -162,  -162,  -162,   248,    30,   250,  -162,
    -162,    30,   251,   201,  -162,   212,   254,  -162,  -162,    18,
      51,    27,  -162,  -162,    43,    44,   150,   212,   150,  -162,
    -162,  -162,  -162,  -162,   150,  -162,    25,    45,  -162,  -162,
     257,  -162,  -162,  -162,  -162,  -162,  -162,   151,    12,  -162,
      22,  -162,   150,  -162,  -162,   165,  -162,   156,  -162,  -162,
     150,  -162,   256,  -162,  -162,  -162,  -162,    31,   151,  -162,
     209,   258,   247,   269,   266,  -162,   -36,   166,   150,  -162,
    -162,   271,  -162,  -162,  -162,   212,  -162,   175,   166,   267,
    -162
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final short yydefact_[] =
  {
         0,   136,   208,     0,     0,   139,     9,   204,   206,    14,
     208,   205,   205,   137,   137,     0,   205,   206,   204,     0,
       0,     0,   207,   205,   205,     0,   205,   203,   203,    62,
       0,   203,   203,   203,   203,    73,     0,     0,     0,   205,
     205,   205,   205,   205,   205,   205,   203,   205,   205,   205,
       0,   208,   203,   208,   206,     0,   208,   203,   203,   203,
     131,   132,   133,     0,     2,   207,     4,   147,     6,     0,
     140,   148,     8,   206,    13,     0,    15,    17,   205,   205,
      20,   205,   205,    23,   138,   205,   205,   205,    28,    30,
     206,   207,     0,     0,   206,     0,   144,   143,   205,   205,
      50,   145,   205,    52,   205,    54,   206,   205,    57,    59,
       0,    63,   206,   206,    66,    68,    70,   197,    72,   197,
     141,    74,    75,    76,     0,   197,     0,   137,    83,   137,
     137,    86,     0,   206,   206,   206,   108,   109,   111,   110,
     203,   205,    96,   203,   203,   205,   205,   205,   205,   205,
     116,   205,   118,   120,   122,     0,   126,   125,   124,     0,
     205,   134,     1,     0,     0,   157,     0,    10,   200,     0,
      19,    21,    22,    24,    25,    26,    27,   206,     0,    31,
       0,    34,    35,     0,     0,     0,     0,    43,    44,    45,
      46,    48,    49,    51,   146,    53,    55,    56,    58,   176,
       0,    60,     0,   172,    61,   170,     0,     0,     0,   166,
       0,   189,    67,    69,   199,   198,   194,   142,    77,     0,
      80,    81,    82,    84,    85,   184,    88,    89,     0,   185,
     181,   179,    92,    93,    94,     0,    95,   205,     0,   101,
     103,   104,   105,   205,   205,   113,   117,     0,   119,   121,
     123,   127,     0,   135,   201,     0,     0,     5,   149,   152,
     158,     7,   206,   206,    18,    29,   206,   206,    47,    36,
      37,    38,    39,    40,    41,    42,     0,     0,     0,   178,
     171,     0,     0,     0,    65,     0,     0,   195,   196,     0,
      78,   181,   182,   183,     0,     0,    99,     0,   100,   102,
     106,   107,   112,   114,   115,   128,     0,     0,   154,   155,
       0,   153,    11,    12,    32,    33,   175,   190,   177,   174,
     159,    64,   188,   167,   206,     0,    79,   180,   186,   187,
     202,   129,     0,   151,   156,   206,   169,     0,   190,   173,
       0,     0,    97,   167,     0,   161,     0,   162,   164,   168,
     203,   167,    98,   191,   160,     0,   165,     0,   163,     0,
     193
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -162,  -162,  -162,  -162,  -162,     7,    -3,  -162,  -162,   -11,
     262,  -162,  -162,  -161,  -162,    19,  -162,   -46,  -162,   -79,
     -70,  -162,  -162,    74,   172,    59,  -162,   -14,   167,   -49,
     260,  -162,   173,   -16,  -162,  -162,   -28,   272,    56,   -52,
     -37,   119
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,    63,    64,   164,   169,   203,    85,    71,   121,   101,
     102,    68,    72,   257,   258,   259,   261,   338,   346,   347,
     211,   201,   204,   205,   206,   230,   294,   231,   212,   336,
     116,   289,   216,    74,   307,   342,   109,    73,    80,    75,
     100,    66
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -193;
  private static final short
  yytable_[] =
  {
       110,    89,   153,   114,   115,   117,   119,    65,   264,    98,
      67,    86,  -159,   309,   106,   107,   -91,   214,   132,   287,
     354,   -71,    87,   305,   151,     1,   209,   -90,   163,   158,
     159,   160,    69,   331,  -177,     1,   111,   113,     1,   209,
     225,   199,   120,   122,   123,   124,   199,   -87,   254,    76,
     209,   225,   328,    78,   180,    99,    96,   167,    84,    97,
     207,   208,   154,   243,   157,   214,   277,   337,    83,   355,
     281,    79,    88,   324,   179,   112,   221,   337,   189,   103,
     105,   244,   108,    70,   156,   215,     1,   345,    84,   251,
     197,   194,   162,   194,    81,   125,   126,   127,   128,   129,
     130,   131,   190,   133,   134,   135,   226,   227,   228,   288,
      82,   161,   235,   286,   310,   237,   238,   232,   233,   234,
    -177,   292,  -159,   332,   222,   293,   223,   224,   217,    77,
    -177,   218,   292,   215,   170,   171,   293,   172,   173,   229,
     200,   174,   175,   176,    -3,   200,   333,   255,   256,   210,
     229,   329,   278,   165,   191,   192,   282,   262,   195,     1,
     196,   265,   279,   198,   136,   296,   279,   266,   298,     1,
     150,    91,   152,   263,   168,   155,    96,   304,   166,    97,
     187,   188,   306,    92,   -16,   267,   273,   274,   275,   177,
     269,   270,   300,   271,   272,   255,   256,   236,   178,   193,
     220,   239,   240,   241,   242,   245,   137,   247,   246,    93,
      94,    95,   138,   248,   139,   322,   252,   249,   250,   325,
     209,   140,   181,   182,   183,   184,   185,   330,   253,   186,
     260,   301,   268,   276,   283,   284,   141,   142,   143,   144,
     145,   146,   147,   148,   149,   285,   312,   313,   286,   290,
     314,   315,   299,  -150,   295,   308,   316,   321,   318,   320,
     334,   335,   323,   341,   343,   350,   351,   348,   352,  -130,
     353,  -192,   356,   359,   339,   360,   358,   311,   280,   326,
     327,   202,   213,   344,   317,   348,   104,   291,   319,   349,
      90,     0,     0,   297,   118,     0,     0,     1,   219,   302,
     303,     2,     3,     4,     0,     5,     6,     7,   340,     8,
       9,    10,    11,     0,    12,    13,    14,    15,    16,    17,
      18,    19,   357,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    20,    21,    22,    23,
      24,    25,    26,    27,    28,    29,    30,     0,     0,    31,
      32,    33,    34,    35,    36,    37,    38,    39,     0,    40,
      41,    42,    43,    44,    45,    46,     0,     0,     0,    47,
      48,    49,    50,     0,     0,     0,     0,     0,     0,    51,
       0,     0,    52,    53,    54,    55,    56,    57,    58,    59,
       0,    60,    61,    62
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        28,    17,    54,    31,    32,    33,    34,     0,   169,    20,
       3,    14,     0,     3,    25,    26,     0,    44,    46,    21,
      56,     0,    15,     8,    52,     5,     8,     0,    65,    57,
      58,    59,     3,     8,    12,     5,    29,    30,     5,     8,
       8,     8,    35,    36,    37,    38,     8,     0,     3,     3,
       8,     8,     8,     3,    91,     3,     5,    73,     5,     8,
     112,   113,    55,     3,    57,    44,    12,    55,    12,   105,
      12,    21,    16,    55,    90,    55,    23,    55,    94,    23,
      24,    21,    26,     5,     3,   112,     5,    56,     5,   159,
     106,   102,     0,   104,     5,    39,    40,    41,    42,    43,
      44,    45,    95,    47,    48,    49,    74,    75,    76,   111,
      21,     3,   140,    98,   104,   143,   144,   133,   134,   135,
      98,   105,   110,    98,   127,   109,   129,   130,   121,    10,
     108,   124,   105,   112,    78,    79,   109,    81,    82,   107,
     107,    85,    86,    87,     0,   107,   307,   102,   103,   107,
     107,   107,    98,    12,    98,    99,    98,     3,   102,     5,
     104,   177,   108,   107,     9,   235,   108,     3,   238,     5,
      51,     3,    53,   166,     4,    56,     5,   247,    16,     8,
      35,    36,   252,    15,     0,   178,    38,    39,    40,     3,
     183,   184,    21,    35,    36,   102,   103,   141,    16,     4,
      66,   145,   146,   147,   148,   149,    51,   151,     3,    41,
      42,    43,    57,     3,    59,   285,   160,     4,     3,   289,
       8,    66,    30,    31,    32,    33,    34,   297,     4,    37,
       3,   242,     4,    98,     4,     4,    81,    82,    83,    84,
      85,    86,    87,    88,    89,    98,   262,   263,    98,    66,
     266,   267,     3,     0,    98,     3,     8,    56,     8,     8,
       3,   110,     8,    98,     8,    56,     8,   337,    21,     0,
       4,     0,   106,    98,   320,     8,   355,   258,   204,   290,
     294,   109,   115,   335,   277,   355,    24,   228,   281,   338,
      18,    -1,    -1,   237,    34,    -1,    -1,     5,   125,   243,
     244,     9,    10,    11,    -1,    13,    14,    15,   324,    17,
      18,    19,    20,    -1,    22,    23,    24,    25,    26,    27,
      28,    29,   350,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    44,    45,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    -1,    -1,    57,
      58,    59,    60,    61,    62,    63,    64,    65,    -1,    67,
      68,    69,    70,    71,    72,    73,    -1,    -1,    -1,    77,
      78,    79,    80,    -1,    -1,    -1,    -1,    -1,    -1,    87,
      -1,    -1,    90,    91,    92,    93,    94,    95,    96,    97,
      -1,    99,   100,   101
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final short
  yystos_[] =
  {
         0,     5,     9,    10,    11,    13,    14,    15,    17,    18,
      19,    20,    22,    23,    24,    25,    26,    27,    28,    29,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,    57,    58,    59,    60,    61,    62,    63,    64,    65,
      67,    68,    69,    70,    71,    72,    73,    77,    78,    79,
      80,    87,    90,    91,    92,    93,    94,    95,    96,    97,
      99,   100,   101,   114,   115,   118,   154,   118,   124,     3,
       5,   120,   125,   150,   146,   152,     3,   154,     3,    21,
     151,     5,    21,   151,     5,   119,   119,   118,   151,   146,
     150,     3,    15,    41,    42,    43,     5,     8,   122,     3,
     153,   122,   123,   151,   123,   151,   122,   122,   151,   149,
     149,   118,    55,   118,   149,   149,   143,   149,   143,   149,
     118,   121,   118,   118,   118,   151,   151,   151,   151,   151,
     151,   151,   149,   151,   151,   151,     9,    51,    57,    59,
      66,    81,    82,    83,    84,    85,    86,    87,    88,    89,
     154,   149,   154,   152,   118,   154,     3,   118,   149,   149,
     149,     3,     0,   153,   116,    12,    16,   146,     4,   117,
     151,   151,   151,   151,   151,   151,   151,     3,    16,   146,
     153,    30,    31,    32,    33,    34,    37,    35,    36,   146,
     118,   151,   151,     4,   122,   151,   151,   146,   151,     8,
     107,   134,   137,   118,   135,   136,   137,   152,   152,     8,
     107,   133,   141,   141,    44,   112,   145,   118,   118,   145,
      66,    23,   119,   119,   119,     8,    74,    75,    76,   107,
     138,   140,   146,   146,   146,   149,   151,   149,   149,   151,
     151,   151,   151,     3,    21,   151,     3,   151,     3,     4,
       3,   133,   151,     4,     3,   102,   103,   126,   127,   128,
       3,   129,     3,   118,   126,   146,     3,   118,     4,   118,
     118,    35,    36,    38,    39,    40,    98,    12,    98,   108,
     136,    12,    98,     4,     4,    98,    98,    21,   111,   144,
      66,   138,   105,   109,   139,    98,   133,   151,   133,     3,
      21,   122,   151,   151,   133,     8,   133,   147,     3,     3,
     104,   128,   146,   146,   146,   146,     8,   118,     8,   118,
       8,    56,   133,     8,    55,   133,   122,   140,     8,   107,
     133,     8,    98,   126,     3,   110,   142,    55,   130,   130,
     146,    98,   148,     8,   152,    56,   131,   132,   133,   142,
      56,     8,    21,     4,    56,   105,   106,   149,   132,    98,
       8
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,    58,   267,   268,   269,    47,   270,   271,   272,
     273,   274,   275,   276,   277,   278,   279,   280,   281,   282,
     283,   284,   285,   286,   287,   288,   289,   290,   291,   292,
     293,   294,   295,   296,   297,   298,   299,   300,   301,   302,
     303,   304,   305,   306,   307,    40,    41,   308,   309,   310,
     311,   312,   313,   314,   315,   316,   317,   318,   319,   320,
     321,   322,   323,   324,   325,   326,    43,   327,   328,   329,
     330,   331,   332,   333,   334,   335,   336,   337,   338,   339,
     340,   341,   342,   343,   344,   345,   346,   347,    46,   348,
     349,   350,    60,    62,    38,    44,   351,    42,   352,    59,
     353,   354,   355
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short
  yyr1_[] =
  {
         0,   113,   114,   115,   116,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   117,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   115,
     115,   115,   115,   115,   115,   115,   118,   119,   119,   120,
     120,   121,   121,   122,   122,   123,   123,   124,   125,   126,
     126,   126,   127,   127,   128,   128,   128,   129,   129,   130,
     130,   130,   131,   131,   132,   132,   133,   133,   134,   134,
     135,   135,   136,   136,   136,   137,   137,   137,   137,   138,
     138,   139,   139,   139,   140,   140,   140,   140,   141,   141,
     142,   142,   143,   143,   144,   144,   144,   145,   145,   145,
     146,   147,   148,   149,   150,   151,   152,   153,   154
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     0,     4,     2,     4,     2,     1,
       3,     5,     5,     2,     1,     2,     2,     0,     4,     3,
       2,     3,     3,     2,     3,     3,     3,     3,     2,     4,
       2,     3,     5,     5,     3,     3,     4,     4,     4,     4,
       4,     4,     4,     3,     3,     3,     3,     4,     3,     3,
       2,     3,     2,     3,     2,     3,     3,     2,     3,     2,
       3,     3,     1,     2,     5,     4,     2,     3,     2,     3,
       2,     2,     2,     1,     2,     2,     2,     3,     4,     5,
       3,     3,     3,     2,     3,     3,     2,     1,     3,     3,
       4,     3,     3,     3,     3,     3,     2,     6,     7,     4,
       4,     3,     4,     3,     3,     3,     4,     4,     2,     2,
       2,     2,     4,     3,     4,     4,     2,     3,     2,     3,
       2,     3,     2,     3,     2,     2,     2,     3,     4,     5,
       6,     1,     1,     1,     2,     3,     1,     0,     1,     0,
       1,     1,     2,     1,     1,     1,     2,     1,     1,     1,
       1,     3,     1,     2,     2,     2,     3,     0,     1,     0,
       3,     2,     1,     3,     1,     2,     1,     3,     5,     4,
       1,     2,     1,     4,     3,     3,     1,     3,     2,     1,
       3,     0,     1,     1,     1,     1,     3,     3,     3,     1,
       0,     3,     6,     9,     0,     1,     1,     0,     1,     1,
       2,     0,     0,     0,     0,     0,     0,     0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "WORD", "TEXT", "INTLIT", "CHARLIT",
  "STRINGLIT", "IDENT", "\"run\"", "\"attach\"", "\"connect\"", "':'",
  "\"listen\"", "\"detach\"", "\"print\"", "'/'", "\"call\"",
  "\"exec-class\"", "\"exec-args\"", "\"backtrace\"", "\"all\"",
  "\"wherei\"", "\"up\"", "\"down\"", "\"frame\"", "\"save\"", "\"ptype\"",
  "\"dumpall\"", "\"set\"", "\"compressed\"", "\"pretty\"", "\"elements\"",
  "\"max-frames\"", "\"return\"", "\"on\"", "\"off\"", "\"prefix\"",
  "\"standard\"", "\"exprs\"", "\"both\"", "\"stdin\"", "\"variable\"",
  "\"history\"", "\"thread\"", "\"threadgroup\"", "\"^F\"", "\"suspend\"",
  "\"resume\"", "\"kill\"", "\"interrupt\"", "\"break\"", "\"clear\"",
  "\"command\"", "\"condition\"", "'('", "')'", "\"catch\"", "\"pass\"",
  "\"watch\"", "\"unwatch\"", "\"delete\"", "\"disable\"", "\"enable\"",
  "\"ignore\"", "\"trace\"", "\"methods\"", "\"untrace\"", "\"step\"",
  "\"finish\"", "\"next\"", "\"stepi\"", "\"continue\"", "\"exclude\"",
  "\"none\"", "\"reset\"", "'+'", "\"lock\"", "\"disablegc\"",
  "\"enablegc\"", "\"info\"", "\"locals\"", "\"classes\"", "\"class\"",
  "\"fields\"", "\"threads\"", "\"threadgroups\"", "\"classpath\"",
  "\"threadlocks\"", "\"stack\"", "\"loadclass\"", "\"sourcepath\"",
  "\"monitor\"", "\"unmonitor\"", "\"source\"", "\"list\"", "\"lines\"",
  "\"bytecodes\"", "'.'", "\"version\"", "\"quit\"", "\"help\"", "'<'",
  "'>'", "'&'", "','", "\"[]\"", "'*'", "\".0\"", "';'", "\"if\"",
  "\"access\"", "\"go\"", "$accept", "start", "command", "@1", "@2",
  "intlit", "intlit_dflt1", "intlit_dflt_m1", "int_list", "thread_id",
  "thread_id_list", "address", "address_opt", "run_args", "file_specs",
  "file_spec", "connector_args", "formal_types_opt", "formal_types",
  "formal_type", "class_id", "breakpoint_spec",
  "delete_breakpoint_spec_list", "delete_breakpoint_spec",
  "break_class_id", "exclude_class_id_list", "opt_sep", "id_pattern",
  "exception_spec", "if_clause_opt", "watchpoint_spec", "watch_type",
  "suspend_policy", "expr", "_copy_two_back", "_default_mode",
  "_break_mode", "_print_mode", "_check_connect", "_balanced_collect_mode",
  "_collect_all_mode", "_run_args_mode", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final short yyrhs_[] =
  {
       114,     0,    -1,   115,    -1,     9,   154,    -1,    -1,     9,
     154,   116,   126,    -1,    10,   124,    -1,    11,     3,    12,
     129,    -1,    13,   125,    -1,    14,    -1,    15,   150,   146,
      -1,    15,   150,    16,     3,   146,    -1,    15,   150,    16,
     118,   146,    -1,    17,   146,    -1,    18,    -1,    18,     3,
      -1,    19,   154,    -1,    -1,    19,   154,   117,   126,    -1,
      20,     3,   151,    -1,    20,   151,    -1,    20,    21,   151,
      -1,    22,     5,   151,    -1,    22,   151,    -1,    22,    21,
     151,    -1,    23,   119,   151,    -1,    24,   119,   151,    -1,
      25,   118,   151,    -1,    26,   151,    -1,    26,   151,     3,
     146,    -1,    27,   146,    -1,    28,   150,   146,    -1,    28,
     150,    16,     3,   146,    -1,    28,   150,    16,   118,   146,
      -1,    29,    15,    30,    -1,    29,    15,    31,    -1,    29,
      15,    32,   118,    -1,    29,    15,    33,   118,    -1,    29,
      15,    34,    35,    -1,    29,    15,    34,    36,    -1,    29,
      15,    37,    38,    -1,    29,    15,    37,    39,    -1,    29,
      15,    37,    40,    -1,    29,    41,    35,    -1,    29,    41,
      36,    -1,    29,    42,   146,    -1,    29,    43,   118,    -1,
      29,     3,   153,     4,    -1,    44,   122,   151,    -1,    45,
       3,   151,    -1,    46,   153,    -1,    46,   153,     4,    -1,
      47,   151,    -1,    47,   123,   151,    -1,    48,   151,    -1,
      48,   123,   151,    -1,    49,   122,   146,    -1,    50,   151,
      -1,    50,   122,   151,    -1,    51,   149,    -1,    51,   149,
     134,    -1,    52,   149,   135,    -1,    53,    -1,    53,   118,
      -1,    54,    55,   152,     4,    56,    -1,    54,   118,   152,
       4,    -1,    57,   149,    -1,    57,   149,   141,    -1,    58,
     149,    -1,    58,   149,   141,    -1,    59,   143,    -1,    60,
     149,    -1,    60,   143,    -1,    61,    -1,    61,   121,    -1,
      62,   118,    -1,    63,   118,    -1,    64,   118,   118,    -1,
      65,   151,   145,    66,    -1,    65,   151,   145,    66,   122,
      -1,    67,   151,    66,    -1,    68,   151,    23,    -1,    68,
     151,   119,    -1,    69,   151,    -1,    70,   151,   119,    -1,
      71,   151,   119,    -1,    72,   151,    -1,    73,    -1,    73,
     149,    74,    -1,    73,   149,    75,    -1,    73,   149,    76,
     138,    -1,    73,   149,   138,    -1,    77,   151,   146,    -1,
      78,   151,   146,    -1,    79,   151,   146,    -1,    80,    81,
     151,    -1,    80,    82,    -1,    80,    83,   149,   151,   133,
     148,    -1,    80,    83,   149,   151,   133,   148,    21,    -1,
      80,    66,   149,   133,    -1,    80,    84,   149,   133,    -1,
      80,    85,   151,    -1,    80,    85,   151,     3,    -1,    80,
      86,   151,    -1,    80,    87,   151,    -1,    80,    88,   151,
      -1,    80,    88,   151,    21,    -1,    80,    88,   151,   122,
      -1,    80,     9,    -1,    80,    51,    -1,    80,    59,    -1,
      80,    57,    -1,    80,    89,     3,   151,    -1,    80,    89,
     151,    -1,    80,    89,    21,   151,    -1,    90,   149,   151,
     133,    -1,    87,   154,    -1,    87,   154,     3,    -1,    91,
     154,    -1,    91,   154,     3,    -1,    92,   152,    -1,    92,
     152,     4,    -1,    93,   118,    -1,    94,   154,     3,    -1,
      95,   149,    -1,    95,   118,    -1,    95,     3,    -1,    96,
     149,   133,    -1,    96,   149,   133,     8,    -1,    97,   149,
     151,   133,     8,    -1,    97,   149,   151,   133,    98,     8,
      -1,    99,    -1,   100,    -1,   101,    -1,   101,     3,    -1,
     118,   153,     4,    -1,     5,    -1,    -1,     5,    -1,    -1,
       5,    -1,   118,    -1,   121,   118,    -1,     8,    -1,     5,
      -1,   122,    -1,   123,   122,    -1,   118,    -1,   120,    -1,
     127,    -1,     3,    -1,     3,   147,   126,    -1,   128,    -1,
     127,   128,    -1,   102,     3,    -1,   103,     3,    -1,   103,
     104,     3,    -1,    -1,     3,    -1,    -1,    55,   131,    56,
      -1,    55,    56,    -1,   132,    -1,   131,   105,   132,    -1,
     133,    -1,   132,   106,    -1,     8,    -1,   133,    98,     8,
      -1,   137,    98,     8,   130,   142,    -1,   137,    12,   118,
     142,    -1,   136,    -1,   135,   136,    -1,   118,    -1,   137,
      98,     8,   130,    -1,   137,    12,   118,    -1,   107,    98,
       8,    -1,     8,    -1,   137,    98,     8,    -1,   137,   108,
      -1,   140,    -1,   138,   139,   140,    -1,    -1,   105,    -1,
     109,    -1,     8,    -1,   107,    -1,   140,    98,     8,    -1,
     140,    98,   107,    -1,   107,    98,   133,    -1,   133,    -1,
      -1,   110,   152,     4,    -1,   149,   145,   144,   133,    98,
       8,    -1,   149,   145,   144,    55,   146,    56,   149,    98,
       8,    -1,    -1,    21,    -1,   111,    -1,    -1,   112,    -1,
      44,    -1,   152,     4,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,     9,    14,    17,    22,    25,
      27,    31,    37,    43,    46,    48,    51,    54,    55,    60,
      64,    67,    71,    75,    78,    82,    86,    90,    94,    97,
     102,   105,   109,   115,   121,   125,   129,   134,   139,   144,
     149,   154,   159,   164,   168,   172,   176,   180,   185,   189,
     193,   196,   200,   203,   207,   210,   214,   218,   221,   225,
     228,   232,   236,   238,   241,   247,   252,   255,   259,   262,
     266,   269,   272,   275,   277,   280,   283,   286,   290,   295,
     301,   305,   309,   313,   316,   320,   324,   327,   329,   333,
     337,   342,   346,   350,   354,   358,   362,   365,   372,   380,
     385,   390,   394,   399,   403,   407,   411,   416,   421,   424,
     427,   430,   433,   438,   442,   447,   452,   455,   459,   462,
     466,   469,   473,   476,   480,   483,   486,   489,   493,   498,
     504,   511,   513,   515,   517,   520,   524,   526,   527,   529,
     530,   532,   534,   537,   539,   541,   543,   546,   548,   550,
     552,   554,   558,   560,   563,   566,   569,   573,   574,   576,
     577,   581,   584,   586,   590,   592,   595,   597,   601,   607,
     612,   614,   617,   619,   624,   628,   632,   634,   638,   641,
     643,   647,   648,   650,   652,   654,   656,   660,   664,   668,
     670,   671,   675,   682,   692,   693,   695,   697,   698,   700,
     702,   705,   706,   707,   708,   709,   710,   711,   712
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    55,    55,    59,    62,    62,    65,    68,    71,    74,
      76,    79,    83,    86,    89,    91,    93,    95,    95,    97,
      99,   101,   103,   105,   107,   109,   111,   113,   115,   118,
     121,   123,   126,   130,   133,   135,   137,   139,   141,   143,
     145,   147,   149,   151,   153,   155,   157,   159,   162,   164,
     166,   168,   170,   172,   174,   176,   178,   180,   182,   184,
     186,   188,   190,   192,   194,   196,   198,   200,   202,   204,
     206,   208,   210,   212,   214,   216,   218,   220,   222,   224,
     226,   228,   231,   234,   237,   240,   243,   245,   247,   249,
     251,   253,   255,   258,   261,   264,   266,   268,   270,   272,
     274,   276,   278,   280,   282,   284,   286,   288,   290,   292,
     294,   296,   298,   300,   302,   304,   306,   308,   310,   312,
     314,   316,   318,   320,   322,   324,   326,   328,   330,   332,
     334,   336,   338,   340,   342,   344,   349,   352,   353,   357,
     358,   362,   364,   369,   370,   374,   377,   381,   385,   390,
     391,   395,   404,   405,   410,   416,   422,   431,   432,   436,
     437,   439,   443,   446,   451,   452,   456,   457,   461,   463,
     468,   472,   477,   478,   480,   485,   486,   487,   491,   498,
     503,   507,   509,   510,   514,   515,   516,   517,   521,   522,
     526,   527,   532,   534,   540,   541,   542,   546,   547,   548,
     552,   557,   562,   565,   569,   573,   577,   581,   585
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,   104,     2,
      55,    56,   107,    76,   105,     2,    98,    16,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    12,   109,
     102,     2,   103,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    13,    14,    15,
      17,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    31,    32,    33,    34,    35,    36,
      37,    38,    39,    40,    41,    42,    43,    44,    45,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    57,    58,
      59,    60,    61,    62,    63,    64,    65,    66,    67,    68,
      69,    70,    71,    72,    73,    74,    75,    77,    78,    79,
      80,    81,    82,    83,    84,    85,    86,    87,    88,    89,
      90,    91,    92,    93,    94,    95,    96,    97,    99,   100,
     101,   106,   108,   110,   111,   112
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 393;
  private static final int yynnts_ = 42;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 162;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 113;

  private static final int yyuser_token_number_max_ = 355;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */
/* Line 922 of lalr1.java  */
/* Line 588 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */

private Commands evaluator;
private boolean showPrompt;
private BufferedReader reader;
private static final HashMap<String, Integer> tokenMap = new HashMap<String, Integer> ();

static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt) 
{
    execute (src, evaluator, reader, prompt, false);
}

static void execute (String src, Commands evaluator, BufferedReader reader,
                     boolean prompt, boolean passException)
{
    CommandLexer llex = new CommandLexer(src);
    CommandParser parser = new CommandParser (llex);
    llex.parser = parser;
    parser.lexer = llex;

    try {
        try {
            parser.reader = reader;
            parser.evaluator = evaluator;
            parser.showPrompt = prompt;
            parser.parse ();
        } catch (UnsupportedOperationException uoe) {
            throw ERROR ("Command is not supported on the target VM");
        } catch (VMNotConnectedException vmnse) {
            throw ERROR ("Command is not valid until the program is started or attached");
        } catch (CommandException e) {
            throw e;
        } catch (VMDisconnectedException e) {
            Env.shutdown (null);
            throw ERROR ("Debugged process has disconnected.");
        } catch (Exception e) {
            e.printStackTrace();
            throw ERROR ("Unknown error in command: %s", e);
        }
    } catch (CommandException e) {
        if (passException) 
            throw e;
        Env.errorln ("%s", e.getMessage ());
    }
            
    if (parser.showPrompt)
        evaluator.printPrompt ();   
}

private CommandLexer lexer;

private int convertInt (String s) {
    try {
        return Integer.decode (s);
    } catch (NumberFormatException e) {
        throw ERROR ("badly formed integer numeral");
    }
}

static final private Pattern PRINT_OPTIONS_PATN 
  = Pattern.compile ("(?i)([xodbcsr]?)(\\d*)([xodbcsr]?)$");

private void startHandler () {
    evaluator.startHandler ();
}       

private int printDepth (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches ()) {
        if (m.group (2).equals (""))
            return 0;
        else 
            return Integer.parseInt (m.group (2));
    } else
        throw ERROR ("bad print format or depth specifier");
}

private char printFormat (String spec) {
    Matcher m = PRINT_OPTIONS_PATN.matcher (spec);
    if (m.matches () && m.group (1).length () + m.group (3).length () < 2) {
        if (m.group (1).equals ("") && m.group (3).equals (""))
            return ' ';
        else 
            return (m.group (1) + m.group (3)).charAt (0);
    } else
        throw ERROR ("bad print format or depth specifier");
}



private BreakpointSpec createBreakpointSpec(int number)
{
    BreakpointSpec breakpoint = 
        (BreakpointSpec) EventRequestSpec.idToSpec 
            (Env.eventRequestSpecs (BreakpointSpec.EXMPL), number);
    if (breakpoint == null)
        throw ERROR ("No such breakpoint: %d", number);
    return breakpoint;
}


private BreakpointSpec createBreakpointSpec(String breakClass, 
                                            int lineNum,
                                            String cond)
{
    try { 
        BreakpointSpec breakpoint = (BreakpointSpec)
            Env.specList.createBreakpoint(breakClass, lineNum);
        breakpoint.setCondition (cond);
        return breakpoint;
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}

private BreakpointSpec createBreakpointSpec(String breakClass, 
                                            String method,
                                            List<String> formals,
                                            String cond)
{
    try {
        BreakpointSpec spec = 
                (BreakpointSpec) Env.specList.createBreakpoint(breakClass, 
                                                               method, formals);
        spec.setCondition (cond);
        return spec;
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad method name: %s", method);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", breakClass);
    }
}

private EventRequestSpec createExceptionSpec (String className) {
    try {
        return Env.specList.createExceptionCatch(className);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", className);
    }
}

private List<EventRequestSpec> createWatchSpec (int policy, String type, 
                                                String classId, String expr,
                                                String fld) 
{
    ArrayList<EventRequestSpec> specs = new ArrayList<EventRequestSpec> ();
    boolean access = !type.equals (""); 
    boolean modification = !type.equals ("access");
    ObjectReference obj;

    if (expr == null) {
        obj = null;
    } else {
        Value val = evaluator.evaluate (expr);
        if (val instanceof ObjectReference)
           obj = (ObjectReference) val;
        else
           throw ERROR ("Value of (%s) is not object an object reference.",
                        expr);
    }

    try {
        
        if (access) {
            EventRequestSpec spec = 
                Env.specList.createAccessWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add (spec);
        }
        if (modification) {
            EventRequestSpec spec = 
                Env.specList.createModificationWatchpoint(classId, fld, obj);
            spec.suspendPolicy = policy;
            specs.add(spec);
        }
    } catch (BadMemberNameException exc) {
        throw ERROR ("Bad field name: %s", fld);
    } catch (ClassNotFoundException exc) {
        throw ERROR ("Bad class name: %s", classId);
    }

    return specs;
}

static int findQuotedToken (String s) {
    Integer i = tokenMap.get (s);
    return i == null ? 0 : i;
}

static String tildeConvert (String s) {
    if (s.equals ("~"))
        return System.getProperty ("user.home");
    try {
        Process p = Runtime.getRuntime ().exec (new String[] {
            System.getenv ("SHELL"), "-c", "echo " + s });
        StringBuilder r = new StringBuilder ();
        while (true) {
            int c = p.getInputStream ().read ();
            if (c == '\n' || c == -1)
                break;
            r.append ((char) c);
        }
        p.destroy ();
        return r.toString ();
    } catch (IOException e) {
        return s;
    }
}

static String shellConvert (String s) {
    if (s.startsWith ("~")) {
        int sl = s.indexOf (System.getProperty ("file.separator"));
        if (sl < 0)
            sl = s.length ();
        return tildeConvert (s.substring (0, sl)) + s.substring (sl);
    } else
        return s;
}

static {
    for (int i = 0; i < yytname_.length; i += 1) {
        if (yytname_[i] instanceof String) {
            String token = (String) yytname_[i];
            if (token.startsWith ("\""))
                tokenMap.put (token.substring (1, token.length () - 1), new Integer(yytoken_number_[i]));
        }
    }
}


/* Line 922 of lalr1.java  */
/* Line 3184 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java"  */

}

/* Line 926 of lalr1.java  */
/* Line 866 of "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y"  */


