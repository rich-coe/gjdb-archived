/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015 Free Software Foundation, Inc.

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

/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":36  */ /* lalr1.java:91  */

/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":38  */ /* lalr1.java:92  */
/* "%code imports" blocks.  */
/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":28  */ /* lalr1.java:93  */

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


/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":63  */ /* lalr1.java:93  */

/**
 * A Bison parser, automatically generated from <tt>/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class CommandParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.0.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";





  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>CommandParser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int WORD = 258;
    /** Token number,to be returned by the scanner.  */
    static final int TEXT = 259;
    /** Token number,to be returned by the scanner.  */
    static final int INTLIT = 260;
    /** Token number,to be returned by the scanner.  */
    static final int CHARLIT = 261;
    /** Token number,to be returned by the scanner.  */
    static final int STRINGLIT = 262;
    /** Token number,to be returned by the scanner.  */
    static final int IDENT = 263;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param msg The string for the error message.
     */
     void yyerror (String msg);
  }

  private class YYLexer implements Lexer {
/* "%code lexer" blocks.  */
/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":814  */ /* lalr1.java:236  */


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


/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":183  */ /* lalr1.java:236  */

  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;
  
  


  /**
   * Instantiates the Bison-generated parser.
   */
  public CommandParser (CommandLexer cmdlexer) 
  {
    
    this.yylexer = new YYLexer(cmdlexer);
    
  }


  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  protected CommandParser (Lexer yylexer) 
  {
    
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

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
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

    public final void push (int state, Object value                            ) {
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
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
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
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yy_lr_goto_state_ (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

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
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":60  */ /* lalr1.java:489  */
    { evaluator.commandRun ();
                  startHandler (); };
  break;
    

  case 4:
  if (yyn == 4)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":62  */ /* lalr1.java:489  */
    { yyval = new CommandLineSpec (); };
  break;
    

  case 5:
  if (yyn == 5)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":63  */ /* lalr1.java:489  */
    {  evaluator.commandRun (((CommandLineSpec)(yystack.valueAt (4-(3))))); 
                   startHandler (); };
  break;
    

  case 6:
  if (yyn == 6)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":66  */ /* lalr1.java:489  */
    { evaluator.commandAttach (((Integer)(yystack.valueAt (2-(2))))); 
                  startHandler (); };
  break;
    

  case 7:
  if (yyn == 7)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":69  */ /* lalr1.java:489  */
    { evaluator.commandConnect (((String)(yystack.valueAt (4-(2)))) + ":" + ((String)(yystack.valueAt (4-(4))))); 
                  startHandler (); };
  break;
    

  case 8:
  if (yyn == 8)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":72  */ /* lalr1.java:489  */
    { evaluator.commandListen (((Integer)(yystack.valueAt (2-(2)))));
                  startHandler (); };
  break;
    

  case 9:
  if (yyn == 9)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":75  */ /* lalr1.java:489  */
    { evaluator.commandDetach (); };
  break;
    

  case 10:
  if (yyn == 10)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":77  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.PRINT, ' ', false); 
                  showPrompt = false; };
  break;
    

  case 11:
  if (yyn == 11)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":80  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), printDepth (((String)(yystack.valueAt (5-(4))))), printFormat (((String)(yystack.valueAt (5-(4))))),
                                          false);
                  showPrompt = false; };
  break;
    

  case 12:
  if (yyn == 12)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":84  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), ((Integer)(yystack.valueAt (5-(4)))), ' ', false);
                  showPrompt = false; };
  break;
    

  case 13:
  if (yyn == 13)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":87  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (2-(2)))), evaluator.NO_PRINT, ' ', false);
                  showPrompt = false; };
  break;
    

  case 14:
  if (yyn == 14)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":90  */ /* lalr1.java:489  */
    { evaluator.commandSetClass (""); };
  break;
    

  case 15:
  if (yyn == 15)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":92  */ /* lalr1.java:489  */
    { evaluator.commandSetClass (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 16:
  if (yyn == 16)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":94  */ /* lalr1.java:489  */
    { evaluator.commandSetArgs (new CommandLineSpec ()); };
  break;
    

  case 17:
  if (yyn == 17)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":95  */ /* lalr1.java:489  */
    { yyval = new CommandLineSpec (); };
  break;
    

  case 18:
  if (yyn == 18)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":96  */ /* lalr1.java:489  */
    { evaluator.commandSetArgs (((CommandLineSpec)(yystack.valueAt (4-(3))))); };
  break;
    

  case 19:
  if (yyn == 19)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":98  */ /* lalr1.java:489  */
    { evaluator.commandWhere (((String)(yystack.valueAt (3-(2)))), false); };
  break;
    

  case 20:
  if (yyn == 20)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":100  */ /* lalr1.java:489  */
    { evaluator.commandWhere (null, false); };
  break;
    

  case 21:
  if (yyn == 21)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":102  */ /* lalr1.java:489  */
    { evaluator.commandWhereAll (false); };
  break;
    

  case 22:
  if (yyn == 22)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":104  */ /* lalr1.java:489  */
    { evaluator.commandWhere (((String)(yystack.valueAt (3-(2)))), true); };
  break;
    

  case 23:
  if (yyn == 23)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":106  */ /* lalr1.java:489  */
    { evaluator.commandWhere (null, true); };
  break;
    

  case 24:
  if (yyn == 24)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":108  */ /* lalr1.java:489  */
    { evaluator.commandWhereAll (true); };
  break;
    

  case 25:
  if (yyn == 25)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":110  */ /* lalr1.java:489  */
    { evaluator.commandUp (((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 26:
  if (yyn == 26)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":112  */ /* lalr1.java:489  */
    { evaluator.commandUp (-((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 27:
  if (yyn == 27)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":114  */ /* lalr1.java:489  */
    { evaluator.commandFrame (((Integer)(yystack.valueAt (3-(2))))); };
  break;
    

  case 28:
  if (yyn == 28)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":116  */ /* lalr1.java:489  */
    { evaluator.commandSave (); 
                  showPrompt = false; };
  break;
    

  case 29:
  if (yyn == 29)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":119  */ /* lalr1.java:489  */
    {  evaluator.commandSave (((String)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4)))));
                   showPrompt = false; };
  break;
    

  case 30:
  if (yyn == 30)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":122  */ /* lalr1.java:489  */
    { evaluator.commandPtype (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 31:
  if (yyn == 31)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":124  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.EXAMINE, ' ', true);
                  showPrompt = false; };
  break;
    

  case 32:
  if (yyn == 32)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":127  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), printDepth (((String)(yystack.valueAt (5-(4))))), 
                                          printFormat (((String)(yystack.valueAt (5-(4))))), true);
                  showPrompt = false; };
  break;
    

  case 33:
  if (yyn == 33)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":131  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (5-(5)))), ((Integer)(yystack.valueAt (5-(4)))), ' ', true);
                  showPrompt = false; };
  break;
    

  case 34:
  if (yyn == 34)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":134  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "compressed", 0); };
  break;
    

  case 35:
  if (yyn == 35)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":136  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "pretty", 0); };
  break;
    

  case 36:
  if (yyn == 36)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":138  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "elements", ((Integer)(yystack.valueAt (4-(4))))); };
  break;
    

  case 37:
  if (yyn == 37)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":140  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "max-frames", ((Integer)(yystack.valueAt (4-(4))))); };
  break;
    

  case 38:
  if (yyn == 38)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":142  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "return", 1); };
  break;
    

  case 39:
  if (yyn == 39)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":144  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "return", 0); };
  break;
    

  case 40:
  if (yyn == 40)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":146  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "prefix", 0); };
  break;
    

  case 41:
  if (yyn == 41)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":148  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "prefix", 1); };
  break;
    

  case 42:
  if (yyn == 42)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":150  */ /* lalr1.java:489  */
    { evaluator.commandSet ("print", "prefix", 2); };
  break;
    

  case 43:
  if (yyn == 43)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":152  */ /* lalr1.java:489  */
    { evaluator.commandSet ("stdin", "on", 0); };
  break;
    

  case 44:
  if (yyn == 44)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":154  */ /* lalr1.java:489  */
    { evaluator.commandSet ("stdin", "off", 0); };
  break;
    

  case 45:
  if (yyn == 45)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":156  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (3-(3)))), evaluator.PRINT, ' ', false); };
  break;
    

  case 46:
  if (yyn == 46)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":158  */ /* lalr1.java:489  */
    { evaluator.commandSet ("history", "save", ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 47:
  if (yyn == 47)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":160  */ /* lalr1.java:489  */
    { evaluator.commandPrint (((String)(yystack.valueAt (4-(2)))) + " " + ((String)(yystack.valueAt (4-(4)))),
                                          evaluator.PRINT, ' ', false); };
  break;
    

  case 48:
  if (yyn == 48)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":163  */ /* lalr1.java:489  */
    { evaluator.commandThread (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 49:
  if (yyn == 49)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":165  */ /* lalr1.java:489  */
    { evaluator.commandThreadGroup (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 50:
  if (yyn == 50)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":167  */ /* lalr1.java:489  */
    { evaluator.commandSuspend (); };
  break;
    

  case 51:
  if (yyn == 51)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":169  */ /* lalr1.java:489  */
    { evaluator.commandSuspend (); };
  break;
    

  case 52:
  if (yyn == 52)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":171  */ /* lalr1.java:489  */
    { evaluator.commandSuspend (); };
  break;
    

  case 53:
  if (yyn == 53)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":173  */ /* lalr1.java:489  */
    { evaluator.commandSuspend (((List)(yystack.valueAt (3-(2))))); };
  break;
    

  case 54:
  if (yyn == 54)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":175  */ /* lalr1.java:489  */
    { evaluator.commandResume (); };
  break;
    

  case 55:
  if (yyn == 55)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":177  */ /* lalr1.java:489  */
    { evaluator.commandResume (((List)(yystack.valueAt (3-(2))))); };
  break;
    

  case 56:
  if (yyn == 56)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":179  */ /* lalr1.java:489  */
    { evaluator.commandKill (((String)(yystack.valueAt (3-(2)))), ((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 57:
  if (yyn == 57)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":181  */ /* lalr1.java:489  */
    { evaluator.commandInterrupt (); };
  break;
    

  case 58:
  if (yyn == 58)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":183  */ /* lalr1.java:489  */
    { evaluator.commandInterrupt (((String)(yystack.valueAt (3-(2))))); };
  break;
    

  case 59:
  if (yyn == 59)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":185  */ /* lalr1.java:489  */
    { evaluator.commandBreak (); };
  break;
    

  case 60:
  if (yyn == 60)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":187  */ /* lalr1.java:489  */
    { evaluator.commandBreak (((BreakpointSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 61:
  if (yyn == 61)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":189  */ /* lalr1.java:489  */
    { evaluator.commandClear (((List)(yystack.valueAt (3-(3))))); };
  break;
    

  case 62:
  if (yyn == 62)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":191  */ /* lalr1.java:489  */
    { evaluator.commandCommand (false); };
  break;
    

  case 63:
  if (yyn == 63)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":193  */ /* lalr1.java:489  */
    { evaluator.commandCommand (((Integer)(yystack.valueAt (2-(2)))), false); };
  break;
    

  case 64:
  if (yyn == 64)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":195  */ /* lalr1.java:489  */
    { evaluator.commandCond (((String)(yystack.valueAt (5-(4))))); };
  break;
    

  case 65:
  if (yyn == 65)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":197  */ /* lalr1.java:489  */
    { evaluator.commandCond (((Integer)(yystack.valueAt (4-(2)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 66:
  if (yyn == 66)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":199  */ /* lalr1.java:489  */
    { evaluator.commandCatch (); };
  break;
    

  case 67:
  if (yyn == 67)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":201  */ /* lalr1.java:489  */
    { evaluator.commandCatch (((EventRequestSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 68:
  if (yyn == 68)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":203  */ /* lalr1.java:489  */
    { evaluator.commandPass (); };
  break;
    

  case 69:
  if (yyn == 69)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":205  */ /* lalr1.java:489  */
    { evaluator.commandPass (((EventRequestSpec)(yystack.valueAt (3-(3))))); };
  break;
    

  case 70:
  if (yyn == 70)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":207  */ /* lalr1.java:489  */
    { evaluator.commandWatch (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 71:
  if (yyn == 71)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":209  */ /* lalr1.java:489  */
    { evaluator.commandUnwatch (); };
  break;
    

  case 72:
  if (yyn == 72)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":211  */ /* lalr1.java:489  */
    { evaluator.commandUnwatch (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 73:
  if (yyn == 73)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":213  */ /* lalr1.java:489  */
    { evaluator.commandDelete (); };
  break;
    

  case 74:
  if (yyn == 74)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":215  */ /* lalr1.java:489  */
    { evaluator.commandDelete (((List)(yystack.valueAt (2-(2))))); };
  break;
    

  case 75:
  if (yyn == 75)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":217  */ /* lalr1.java:489  */
    { evaluator.commandEnable (((Integer)(yystack.valueAt (2-(2)))), false); };
  break;
    

  case 76:
  if (yyn == 76)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":219  */ /* lalr1.java:489  */
    { evaluator.commandEnable (((Integer)(yystack.valueAt (2-(2)))), true); };
  break;
    

  case 77:
  if (yyn == 77)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":221  */ /* lalr1.java:489  */
    { evaluator.commandIgnore (((Integer)(yystack.valueAt (3-(2)))), ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 78:
  if (yyn == 78)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":223  */ /* lalr1.java:489  */
    { evaluator.commandTrace (((Integer)(yystack.valueAt (4-(3)))), null); };
  break;
    

  case 79:
  if (yyn == 79)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":225  */ /* lalr1.java:489  */
    { evaluator.commandTrace (((Integer)(yystack.valueAt (5-(3)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 80:
  if (yyn == 80)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":227  */ /* lalr1.java:489  */
    { evaluator.commandUntrace (); };
  break;
    

  case 81:
  if (yyn == 81)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":229  */ /* lalr1.java:489  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); };
  break;
    

  case 82:
  if (yyn == 82)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":232  */ /* lalr1.java:489  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_INTO, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 83:
  if (yyn == 83)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":235  */ /* lalr1.java:489  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OUT, 1); };
  break;
    

  case 84:
  if (yyn == 84)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":238  */ /* lalr1.java:489  */
    { evaluator.commandStep (StepRequest.STEP_LINE, 
                                         StepRequest.STEP_OVER, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 85:
  if (yyn == 85)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":241  */ /* lalr1.java:489  */
    { evaluator.commandStep (StepRequest.STEP_MIN, 
                                         StepRequest.STEP_INTO, ((Integer)(yystack.valueAt (3-(3))))); };
  break;
    

  case 86:
  if (yyn == 86)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":244  */ /* lalr1.java:489  */
    { evaluator.commandCont (); };
  break;
    

  case 87:
  if (yyn == 87)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":246  */ /* lalr1.java:489  */
    { evaluator.commandExclude (); };
  break;
    

  case 88:
  if (yyn == 88)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":248  */ /* lalr1.java:489  */
    { evaluator.commandExcludeClear (); };
  break;
    

  case 89:
  if (yyn == 89)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":250  */ /* lalr1.java:489  */
    { evaluator.commandExcludeReset (); };
  break;
    

  case 90:
  if (yyn == 90)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":252  */ /* lalr1.java:489  */
    { evaluator.commandExcludeAdd (((List)(yystack.valueAt (4-(4))))); };
  break;
    

  case 91:
  if (yyn == 91)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":254  */ /* lalr1.java:489  */
    { evaluator.commandExcludeSet (((List)(yystack.valueAt (3-(3))))); };
  break;
    

  case 92:
  if (yyn == 92)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":256  */ /* lalr1.java:489  */
    { evaluator.commandLock (((String)(yystack.valueAt (3-(3))))); 
                  showPrompt = false; };
  break;
    

  case 93:
  if (yyn == 93)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":259  */ /* lalr1.java:489  */
    { evaluator.commandEnableGC (((String)(yystack.valueAt (3-(3)))), false); 
                  showPrompt = false; };
  break;
    

  case 94:
  if (yyn == 94)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":262  */ /* lalr1.java:489  */
    { evaluator.commandEnableGC (((String)(yystack.valueAt (3-(3)))), true); 
                  showPrompt = false; };
  break;
    

  case 95:
  if (yyn == 95)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":265  */ /* lalr1.java:489  */
    { evaluator.commandLocals (); };
  break;
    

  case 96:
  if (yyn == 96)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":267  */ /* lalr1.java:489  */
    { evaluator.commandClasses (); };
  break;
    

  case 97:
  if (yyn == 97)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":269  */ /* lalr1.java:489  */
    { evaluator.commandClass (((String)(yystack.valueAt (6-(5)))), false); };
  break;
    

  case 98:
  if (yyn == 98)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":271  */ /* lalr1.java:489  */
    { evaluator.commandClass (((String)(yystack.valueAt (7-(5)))), true); };
  break;
    

  case 99:
  if (yyn == 99)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":273  */ /* lalr1.java:489  */
    { evaluator.commandMethods (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 100:
  if (yyn == 100)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":275  */ /* lalr1.java:489  */
    { evaluator.commandFields (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 101:
  if (yyn == 101)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":277  */ /* lalr1.java:489  */
    { evaluator.commandThreads (); };
  break;
    

  case 102:
  if (yyn == 102)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":279  */ /* lalr1.java:489  */
    { evaluator.commandThreads (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 103:
  if (yyn == 103)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":281  */ /* lalr1.java:489  */
    { evaluator.commandThreadGroups (); };
  break;
    

  case 104:
  if (yyn == 104)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":283  */ /* lalr1.java:489  */
    { evaluator.commandClasspathInfo (); };
  break;
    

  case 105:
  if (yyn == 105)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":285  */ /* lalr1.java:489  */
    { evaluator.commandThreadlocks (); };
  break;
    

  case 106:
  if (yyn == 106)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":287  */ /* lalr1.java:489  */
    { evaluator.commandThreadlocksAll (); };
  break;
    

  case 107:
  if (yyn == 107)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":289  */ /* lalr1.java:489  */
    { evaluator.commandThreadlocks (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 108:
  if (yyn == 108)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":291  */ /* lalr1.java:489  */
    { evaluator.commandInfoRun (); };
  break;
    

  case 109:
  if (yyn == 109)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":293  */ /* lalr1.java:489  */
    { evaluator.listEventSpecs (BreakpointSpec.EXMPL); };
  break;
    

  case 110:
  if (yyn == 110)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":295  */ /* lalr1.java:489  */
    { evaluator.listEventSpecs (WatchpointSpec.EXMPL); };
  break;
    

  case 111:
  if (yyn == 111)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":297  */ /* lalr1.java:489  */
    { evaluator.listEventSpecs (ExceptionSpec.EXMPL); };
  break;
    

  case 112:
  if (yyn == 112)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":299  */ /* lalr1.java:489  */
    { evaluator.commandWhere (((String)(yystack.valueAt (4-(3)))), false); };
  break;
    

  case 113:
  if (yyn == 113)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":301  */ /* lalr1.java:489  */
    { evaluator.commandWhere (null, false); };
  break;
    

  case 114:
  if (yyn == 114)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":303  */ /* lalr1.java:489  */
    { evaluator.commandWhereAll (false); };
  break;
    

  case 115:
  if (yyn == 115)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":305  */ /* lalr1.java:489  */
    { evaluator.commandLoadclass (((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 116:
  if (yyn == 116)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":307  */ /* lalr1.java:489  */
    { evaluator.commandClasspath (); };
  break;
    

  case 117:
  if (yyn == 117)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":309  */ /* lalr1.java:489  */
    { evaluator.commandClasspath (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 118:
  if (yyn == 118)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":311  */ /* lalr1.java:489  */
    { evaluator.commandUse (); };
  break;
    

  case 119:
  if (yyn == 119)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":313  */ /* lalr1.java:489  */
    { evaluator.commandUse (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 120:
  if (yyn == 120)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":315  */ /* lalr1.java:489  */
    { evaluator.commandMonitor (); };
  break;
    

  case 121:
  if (yyn == 121)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":317  */ /* lalr1.java:489  */
    { evaluator.commandMonitor (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 122:
  if (yyn == 122)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":319  */ /* lalr1.java:489  */
    { evaluator.commandUnmonitor (((Integer)(yystack.valueAt (2-(2))))); };
  break;
    

  case 123:
  if (yyn == 123)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":321  */ /* lalr1.java:489  */
    { evaluator.commandRead (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 124:
  if (yyn == 124)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":323  */ /* lalr1.java:489  */
    { evaluator.commandList (-1, null); };
  break;
    

  case 125:
  if (yyn == 125)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":325  */ /* lalr1.java:489  */
    { evaluator.commandList (((Integer)(yystack.valueAt (2-(2)))), null); };
  break;
    

  case 126:
  if (yyn == 126)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":327  */ /* lalr1.java:489  */
    { evaluator.commandList (-1, ((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 127:
  if (yyn == 127)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":329  */ /* lalr1.java:489  */
    { evaluator.commandLines (((String)(yystack.valueAt (3-(3)))), null); };
  break;
    

  case 128:
  if (yyn == 128)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":331  */ /* lalr1.java:489  */
    { evaluator.commandLines (((String)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 129:
  if (yyn == 129)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":333  */ /* lalr1.java:489  */
    { evaluator.commandBytecodes (((String)(yystack.valueAt (5-(4)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 130:
  if (yyn == 130)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":335  */ /* lalr1.java:489  */
    { evaluator.commandBytecodes (((String)(yystack.valueAt (6-(4)))), ((String)(yystack.valueAt (6-(6))))); };
  break;
    

  case 131:
  if (yyn == 131)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":337  */ /* lalr1.java:489  */
    { evaluator.commandVersion (GJDB.progname, Version.value); };
  break;
    

  case 132:
  if (yyn == 132)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":339  */ /* lalr1.java:489  */
    { evaluator.commandQuit (); };
  break;
    

  case 133:
  if (yyn == 133)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":341  */ /* lalr1.java:489  */
    { GJDB.help (); };
  break;
    

  case 134:
  if (yyn == 134)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":343  */ /* lalr1.java:489  */
    { GJDB.help (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 135:
  if (yyn == 135)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":345  */ /* lalr1.java:489  */
    { evaluator.commandRepeat (((Integer)(yystack.valueAt (3-(1)))), ((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 136:
  if (yyn == 136)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":349  */ /* lalr1.java:489  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 137:
  if (yyn == 137)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":352  */ /* lalr1.java:489  */
    { yyval = 1; };
  break;
    

  case 138:
  if (yyn == 138)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":353  */ /* lalr1.java:489  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 139:
  if (yyn == 139)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":357  */ /* lalr1.java:489  */
    { yyval = -1; };
  break;
    

  case 140:
  if (yyn == 140)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":358  */ /* lalr1.java:489  */
    { yyval = convertInt (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 141:
  if (yyn == 141)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":362  */ /* lalr1.java:489  */
    { ArrayList<Integer> L = new ArrayList<Integer> (); 
                          yyval = L; L.add (((Integer)(yystack.valueAt (1-(1))))); };
  break;
    

  case 142:
  if (yyn == 142)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":365  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((Integer)(yystack.valueAt (2-(2))))); };
  break;
    

  case 145:
  if (yyn == 145)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":374  */ /* lalr1.java:489  */
    { ArrayList<String> v = new ArrayList<String> ();
                          v.add (((String)(yystack.valueAt (1-(1))))); 
                          yyval = v; };
  break;
    

  case 146:
  if (yyn == 146)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":378  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((String)(yystack.valueAt (2-(2))))); };
  break;
    

  case 150:
  if (yyn == 150)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":392  */ /* lalr1.java:489  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (1-(0))));
                          spec.cmdArgs += " " + shellConvert (((String)(yystack.valueAt (1-(1))))); 
                          yyval = spec; };
  break;
    

  case 151:
  if (yyn == 151)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":396  */ /* lalr1.java:489  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (3-(2))));
                          spec.cmdArgs = " " + shellConvert (((String)(yystack.valueAt (3-(1))))) 
                                         + spec.cmdArgs; 
                          yyval = spec; };
  break;
    

  case 152:
  if (yyn == 152)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":404  */ /* lalr1.java:489  */
    { yyval = ((CommandLineSpec)(yystack.valueAt (1-(0)))); };
  break;
    

  case 153:
  if (yyn == 153)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":405  */ /* lalr1.java:489  */
    { yyval = ((Object)(yystack.valueAt (2-(1)))); };
  break;
    

  case 154:
  if (yyn == 154)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":411  */ /* lalr1.java:489  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (2-(0))));
                          if (spec.inFile != null)
                              throw ERROR ("Ambiguous input redirection");
                          spec.inFile = shellConvert (((String)(yystack.valueAt (2-(2)))));
                        };
  break;
    

  case 155:
  if (yyn == 155)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":417  */ /* lalr1.java:489  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (2-(0))));
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = shellConvert (((String)(yystack.valueAt (2-(2)))));
                        };
  break;
    

  case 156:
  if (yyn == 156)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":423  */ /* lalr1.java:489  */
    { CommandLineSpec spec = ((CommandLineSpec)(yystack.valueAt (3-(0))));
                          if (spec.outFile != null)
                              throw ERROR ("Ambiguous output redirection");
                          spec.outFile = spec.errFile = shellConvert (((String)(yystack.valueAt (3-(3)))));
                        };
  break;
    

  case 157:
  if (yyn == 157)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":431  */ /* lalr1.java:489  */
    { yyval = ""; };
  break;
    

  case 159:
  if (yyn == 159)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":436  */ /* lalr1.java:489  */
    { yyval = null; };
  break;
    

  case 160:
  if (yyn == 160)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":438  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (3-(2)))); };
  break;
    

  case 161:
  if (yyn == 161)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":439  */ /* lalr1.java:489  */
    { yyval = Collections.EMPTY_LIST; };
  break;
    

  case 162:
  if (yyn == 162)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":443  */ /* lalr1.java:489  */
    { ArrayList<String> L = new ArrayList<String> (); 
                          yyval = L;
                          L.add (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 163:
  if (yyn == 163)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":447  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (3-(1)))); ((List)(yystack.valueAt (3-(1)))).add (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 165:
  if (yyn == 165)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":452  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (2-(1)))) + "[]"; };
  break;
    

  case 167:
  if (yyn == 167)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":457  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 168:
  if (yyn == 168)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":462  */ /* lalr1.java:489  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (5-(1)))), ((String)(yystack.valueAt (5-(3)))), ((List)(yystack.valueAt (5-(4)))), ((String)(yystack.valueAt (5-(5))))); };
  break;
    

  case 169:
  if (yyn == 169)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":464  */ /* lalr1.java:489  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (4-(1)))), ((Integer)(yystack.valueAt (4-(3)))), ((String)(yystack.valueAt (4-(4))))); };
  break;
    

  case 170:
  if (yyn == 170)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":469  */ /* lalr1.java:489  */
    { ArrayList<Object> L = new ArrayList<Object> ();
               yyval = L; 
               L.add (((BreakpointSpec)(yystack.valueAt (1-(1))))); };
  break;
    

  case 171:
  if (yyn == 171)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":473  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (2-(1)))); ((List)(yystack.valueAt (2-(1)))).add (((BreakpointSpec)(yystack.valueAt (2-(2))))); };
  break;
    

  case 172:
  if (yyn == 172)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":477  */ /* lalr1.java:489  */
    { yyval = createBreakpointSpec (((Integer)(yystack.valueAt (1-(1))))); };
  break;
    

  case 173:
  if (yyn == 173)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":479  */ /* lalr1.java:489  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (4-(1)))), ((String)(yystack.valueAt (4-(3)))), ((List)(yystack.valueAt (4-(4)))), null); };
  break;
    

  case 174:
  if (yyn == 174)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":481  */ /* lalr1.java:489  */
    { yyval = createBreakpointSpec (((String)(yystack.valueAt (3-(1)))), ((Integer)(yystack.valueAt (3-(3)))), null); };
  break;
    

  case 175:
  if (yyn == 175)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":485  */ /* lalr1.java:489  */
    { yyval = "*." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 177:
  if (yyn == 177)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":488  */ /* lalr1.java:489  */
    { if (((String)(yystack.valueAt (3-(1)))).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 178:
  if (yyn == 178)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":492  */ /* lalr1.java:489  */
    { if (((String)(yystack.valueAt (2-(1)))).endsWith (".0"))
                                      throw ERROR ("Bad class specification");
                                  yyval = ((String)(yystack.valueAt (2-(1)))) + ".0"; };
  break;
    

  case 179:
  if (yyn == 179)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":499  */ /* lalr1.java:489  */
    { ArrayList<String> L = new ArrayList<String> ();
                          L.add (((String)(yystack.valueAt (1-(1))))); 
                          yyval = L;
                        };
  break;
    

  case 180:
  if (yyn == 180)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":504  */ /* lalr1.java:489  */
    { yyval = ((List)(yystack.valueAt (3-(1)))); ((List)(yystack.valueAt (3-(1)))).add (((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 185:
  if (yyn == 185)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":515  */ /* lalr1.java:489  */
    { yyval = "*"; };
  break;
    

  case 186:
  if (yyn == 186)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":516  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + "." + ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 187:
  if (yyn == 187)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":517  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (3-(1)))) + ".*"; };
  break;
    

  case 188:
  if (yyn == 188)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":521  */ /* lalr1.java:489  */
    { yyval = createExceptionSpec ("*." + ((String)(yystack.valueAt (3-(3))))); };
  break;
    

  case 189:
  if (yyn == 189)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":522  */ /* lalr1.java:489  */
    { yyval = createExceptionSpec (((String)(yystack.valueAt (1-(1))))); };
  break;
    

  case 190:
  if (yyn == 190)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":526  */ /* lalr1.java:489  */
    { yyval = null; };
  break;
    

  case 191:
  if (yyn == 191)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":528  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (3-(3)))); };
  break;
    

  case 192:
  if (yyn == 192)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":533  */ /* lalr1.java:489  */
    { yyval = createWatchSpec (((Integer)(yystack.valueAt (6-(2)))), ((String)(yystack.valueAt (6-(3)))), ((String)(yystack.valueAt (6-(4)))), null, ((String)(yystack.valueAt (6-(6))))); };
  break;
    

  case 193:
  if (yyn == 193)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":536  */ /* lalr1.java:489  */
    { yyval = createWatchSpec (((Integer)(yystack.valueAt (9-(2)))), ((String)(yystack.valueAt (9-(3)))), null, ((String)(yystack.valueAt (9-(5)))), ((String)(yystack.valueAt (9-(9))))); };
  break;
    

  case 194:
  if (yyn == 194)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":540  */ /* lalr1.java:489  */
    { yyval = ""; };
  break;
    

  case 195:
  if (yyn == 195)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":541  */ /* lalr1.java:489  */
    { yyval = "all"; };
  break;
    

  case 196:
  if (yyn == 196)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":542  */ /* lalr1.java:489  */
    { yyval = "access"; };
  break;
    

  case 197:
  if (yyn == 197)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":546  */ /* lalr1.java:489  */
    { yyval = EventRequest.SUSPEND_ALL; };
  break;
    

  case 198:
  if (yyn == 198)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":547  */ /* lalr1.java:489  */
    { yyval = EventRequest.SUSPEND_NONE; };
  break;
    

  case 199:
  if (yyn == 199)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":548  */ /* lalr1.java:489  */
    { yyval = EventRequest.SUSPEND_EVENT_THREAD; };
  break;
    

  case 200:
  if (yyn == 200)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":553  */ /* lalr1.java:489  */
    { yyval = ((String)(yystack.valueAt (2-(2)))); };
  break;
    

  case 201:
  if (yyn == 201)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":557  */ /* lalr1.java:489  */
    { yyval = ((Object)(yystack.valueAt (0-(-1)))); };
  break;
    

  case 202:
  if (yyn == 202)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":562  */ /* lalr1.java:489  */
    { lexer.toDefaultMode (); };
  break;
    

  case 203:
  if (yyn == 203)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":565  */ /* lalr1.java:489  */
    { lexer.toBreakMode (); };
  break;
    

  case 204:
  if (yyn == 204)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":569  */ /* lalr1.java:489  */
    { lexer.toPrintMode (); };
  break;
    

  case 205:
  if (yyn == 205)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":573  */ /* lalr1.java:489  */
    { evaluator.checkConnect (); };
  break;
    

  case 206:
  if (yyn == 206)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":577  */ /* lalr1.java:489  */
    { lexer.toBalancedCollectMode (); };
  break;
    

  case 207:
  if (yyn == 207)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":581  */ /* lalr1.java:489  */
    { lexer.toCollectMode (); };
  break;
    

  case 208:
  if (yyn == 208)
    /* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":585  */ /* lalr1.java:489  */
    { lexer.toRunArgsMode (); };
  break;
    


/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":1812  */ /* lalr1.java:489  */
        default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yy_lr_goto_state_ (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }



  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                 Object yyvaluep                                 )
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
    


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



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
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

        /* Convert token to internal form.  */
        if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
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

        if (yychar <= Lexer.EOF)
          {
          /* Return failure if at end of input.  */
          if (yychar == Lexer.EOF)
            return false;
          }
        else
            yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
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
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

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

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;



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
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -162;
  private static final short yytable_ninf_ = -193;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short yypact_[] = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
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
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final short yydefact_[] = yydefact_init();
  private static final short[] yydefact_init()
  {
    return new short[]
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
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -162,  -162,  -162,  -162,  -162,     7,    -3,  -162,  -162,   -11,
     262,  -162,  -162,  -161,  -162,    19,  -162,   -46,  -162,   -79,
     -70,  -162,  -162,    74,   172,    59,  -162,   -14,   167,   -49,
     260,  -162,   173,   -16,  -162,  -162,   -28,   272,    56,   -52,
     -37,   119
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short yydefgoto_[] = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,    63,    64,   164,   169,   203,    85,    71,   121,   101,
     102,    68,    72,   257,   258,   259,   261,   338,   346,   347,
     211,   201,   204,   205,   206,   230,   294,   231,   212,   336,
     116,   289,   216,    74,   307,   342,   109,    73,    80,    75,
     100,    66
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short yytable_[] = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
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
  }

private static final short yycheck_[] = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
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
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short yystos_[] = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
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
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short yyr1_[] = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
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
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
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
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
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
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
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
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
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
  }


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
                       yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
                       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
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
  }

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
/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":588  */ /* lalr1.java:1066  */

private Commands evaluator;
private boolean showPrompt;
private static final HashMap<String, Integer> tokenMap = new HashMap<String, Integer> ();

static void execute (String src, Commands evaluator, boolean prompt) 
{
    execute (src, evaluator, prompt, false);
}

static void execute (String src, Commands evaluator, boolean prompt, boolean passException)
{
    CommandLexer llex = new CommandLexer(src);
    CommandParser parser = new CommandParser (llex);
    llex.parser = parser;
    parser.lexer = llex;

    try {
        try {
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

/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.java":2857  */ /* lalr1.java:1066  */

}

/* "/usr/local/ext/src/github/gjdb/src/ucb/gjdb/CommandParser.y":862  */ /* lalr1.java:1070  */

