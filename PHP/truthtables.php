#!/usr/bin/php -d display_errors
<?php
error_reporting(E_ALL);
//above causes php to send errors to the console, instead of hiding them.

/**
 * The code file for problem set 3.
 *
 * We want to print truth tables to see how PHP evaluates certain statements.
 * So, we will create an array with the values FALSE and TRUE, and then create
 * nested loops to generate the truth table.
 * 
 * The documentation for logical operators in php may be found at 
 * https://www.php.net/manual/en/language.operators.logical.php .
 */
$TruthValues = array( false, true );

/**
 * If we ask php to print(true); php will output a 1.
 * If we ask php to print(false); php will output ... nothing!
 */
 //print(true); //uncomment this line if you want to try it for yourself.

/** 
 * So, we need a function to make it print the words "true" and "false".
 * Fortunately, one exists...the "var_export" function.  (comp-sci profs
 * would yell at me for using "debug" statements in my code)
 */


/**
 * Let us test our setup by producing the truth table for "not".
 * To write "not p", we use the bang symbol !
 */
print ( " p \t NOT p \n"); //Table header... \t produces a tab character.
foreach ($TruthValues as $p) {
	var_export($p);				//output p
	print("\t");				//tab stop
	var_export(!$p);			//evaluates "not p", and outputs the truth value.
	print("\n");			//newline character to finish the row.
}

echo "\n\n"; //adds some space

/**
 * To "order" our statements, we use parentheses.  Try it for yourself:
 * @TODO alter the following statememnt so that the computer outputs the truth
 * table for "not (not p)". (WORKINGandDONE)
 */
print ( " p \t NOT p \t NOT(NOT(p)) \n"); //Table header... \t produces a tab character.
foreach ($TruthValues as $p) {
	var_export($p);				//output p
	print("\t");				//tab stop
	var_export(!$p);			//evaluates "not p", and outputs the truth value.
	print("\t");			//newline character to finish the row.
	var_export( !(!$p) );	//@TODO change me to output not(not(p)) (WORKINGandDONE)
	print("\n");
}

echo "\n\n"; //adds some space


/**
 * to make an "AND" statment in PHP, we use the operator "and"
 * (You can also write &&)
 * The following code will make a truth table for the statement
 *    p and q
 */
print( " p \t q \t p AND q \n"); //prints the table header
foreach ($TruthValues as $p) {
	foreach ($TruthValues as $q) {
		var_export($p);			//output p
		print("\t");			// tab stop
		var_export($q);			//output q
		print("\t");
		var_export($p and $q); 	//this evaluates "p and q", and outputs the truth value.
		print("\n");			//newline character to finish the row.
	}
}
echo "\n\n"; //adds some space.

/**
 *  @TODO Using the above as a model, make a truth table for
 *		the "or" operator.  I have provided the header.
 */
print( " p \t q \t p OR q \n"); //prints the table header
foreach ($TruthValues as $p) {
	foreach ($TruthValues as $q) {
		var_Export ($p);
		print("\t");
		var_export($q);
		print("\t");
		var_Export($p or $q);
		print("\n");
	}
}

echo "\n\n"; //adds some space.
/**
 * Finally, we want to produce the truth table for "q OR (NOT p)", which will
 *  be a very important one for us.
 * I have provided the header below.  @TODO write the loop that
 * will produce the truth table consistant with the header provided.
 */
print( "p \t q \t NOT p\t q OR (NOT p)\n");
foreach ($TruthValues as $p) {
	foreach ($TruthValues as $q) {
		var_Export ($p);
		print("\t");
		var_export($q);
		print("\t");
		var_Export(!$p);
		print("\t");
		var_Export($q OR !$p);
		print("\n");
	}
}














