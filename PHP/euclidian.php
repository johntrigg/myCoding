#!/usr/bin/php -d display_errors
<?php
error_reporting(E_ALL);
//above causes php to send errors to the console, instead of hiding them.

/**
 * The code file for problem set 6
 *
 * We want to create a function that implements a few algorithms, and
 * we will use while loops to do it.
 */

/**
 * This is a php function (procedure in math-speak).
 * The documentation for functions can be found at
 * https://www.php.net/manual/en/functions.user-defined.php
 */

/**
 * This method implements the division algorithm.
 * 
 * It takes as input $a as non-negative integer  
 * and d as a positive integers, computes a/d,
 * and outputs an array contatining the quotient q and the remainder r.
 */
function divisionAlg(int $a, int $d) {
	//a little error checking for types
	if ($a < 0) {
		throw new InvalidArgumentException('divisionAlg requires first parameter be non-negative. Input was: ' . $a);
	} else if ($d < 1) {
		throw new InvalidArgumentException('divisionAlg requires divisor be positive.  Input was: ' . $d);
	}
	
	//initialize the values for the loop
	$r = $a; //this will become the remainder
	$q = 0;  //this will become the quotient
	/**
	 * Repeatedly remove d cards from the stack of r cards until the stack
	 * is shorter than d, counting a group every time you pull d cards.
	 */
	 while ($d < $r) {
		 $r = $r - $d;
		 $q++;
		 print( "r: " .  $r .  "\tq: " . $q . "\n" ); //debug code
	 }
	 return array( "q" => $q, "r" => $r );
}

print_r(divisionAlg(25, 5));  //@TODO making sure that you have php displaying errors, try to make one of these negavite.
							  //@TODO okay, switch them both back to positive, so we can move on.

/**
 * @TODO 
 * Write the function implementing the Euclidean algorithm (from my notes or section 4.10 of the book)
 */ 							  
function getGCD(int $a, int $b	) {
	 if ($a < 1 || $b < 1) {
		throw new InvalidArgumentException('getGCD requires non-negative integers.  Input was: ' . $a . 'and' . $b);
	}
	 $bigger = 0;
	 $smaller = 0;
	 $gcdCanidate = 420;//initialize our initial set of variables
	if ($a > $b){
	$bigger = $a;
	$smaller = $b;
	}else{
	$bigger = $b;
	$smaller = $a;
	}
	$newsmaller = 1;
	$r = 1; //initialize the second round of variables using a placeholder for the loop and an if-else statement
	while ($r != 0){
	$newsmaller = $bigger % $smaller;
		if ($newsmaller == 0){
		print($smaller);
		break;
		}else {
		$bigger = $smaller;
		$smaller = $newsmaller;
		}
		//heres a loop, it breaks out when we have the gcd in the correct variable
	}
}
print ("\nThe GCD of 105280 and 495 is ... ");
getGCD(105280,495);













