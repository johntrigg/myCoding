#!/usr/bin/php -d display_errors
<?php
error_reporting(E_ALL);
//above causes php to send errors to the console, instead of hiding them.

/**
 * The code file for problem set 2.
 */



///// Variables ////

$var1 = 5; 			//to create a variable in php, I begin with the $ character,
$var2 = 4; 			// followed by the name I want to give my variable. 
$var3 = "pooky";    // To assign that variable a value, I use the equal sign.

$var4 = $var1 + $var2;  //this adds the two numbers, and assigns it to var4
print("var1 + var2 = " . $var4 . ", and var3 is " . $var3 . "\n"); 

/**
 * The . in the above statment appends the strings to one another.
 * This is called concatenation.
 * @TODO read about concatenation in the php manual at
 *  https://www.php.net/manual/en/language.operators.string.php,
 * then modify the statment below to output "I read about concatenation."
 */
print("" . "\n");


//////////////////////// Conditionals ////////////////////

/**
 * I want to execute the following code only if a logical condition
 * is met.  In this case, I want to check if var4 equals some value.
 * Since the "=" sign assigns a variable, I use "==" to check to see
 * if two things are equal.
 */
if (9 == $var4) {
	print ("var4 equals nine.\n");
} else { //If I want a piece of code to run if my condition is not true
	print ("var4 does not equal nine.\n");
}
//@TODO modify the assignment of var1 at the top, so the above code
// outputs "var4 equals nine".  Run the code to make sure it works.

/**
 * @TODO create your own variable, and then write a condition
 * that only executes if the variable equals ten, similar to the 
 * statement above.
 * If you need help, start with the documentation for the if control structure,
 * https://www.php.net/manual/en/control-structures.if.php
 */
 $var5 = 10; //My Variable 
 if (10 == var5) {
	 print("My personal variable var5 equals ten!");
 }
 
 
 

 
 
 ///////////////////////// ARRAYS //////////////////////

/**
 * The following is an array in php.
 */
 $loonyToons = array(
	"Bugs Bunny",
	"Claude Cat",
	"Daffy Duck",
	"Elmer Fudd",
	"Marvin the Martian",
	"Merlin the Magic Mouse",
	"Michigan J. Frog",
	"Pepe Le Pew",
	"Porky Pig",
	"Road Runner",
	"Sylvester",
	"Tweety Bird",
	"Wile E. Coyote",
	"Yosemite Sam",
	"Tasmanian Devil"
 );
 
 /**
  *  To access a variable stored in an array, I type the name of the variable, and
  *  then the index in the array.  You can set your own indices, but if you do not,
  *  then PHP wall use the counting numbers, starting from zero.
  */
print ($loonyToons[0] . "\n"); //outputs the "first" element in the array...element zero.
print (substr($loonyToons[1],0,2)); //outputs the first two letters of "Claude Cat".
//print_r ($loonyToons); //the print_r will output the entire array.  Uncomment this line, see what happens, then comment it back.


//@TODO print "Marvin the Martian" as output, accessing his entry in the array.
 
// YOUR CODE HERE
 print ($loonyToons[4] . "/n");
 
echo "\n\n\n"; //give some space
 
/**
 * The "foreach" statement will loop over the entire contents of an array, exectuing code.
 * This is the same as saying, "for every x in loonyToons, print ...", but I say 
 * it backwards, and use the word "as".
 */
foreach ($loonyToons as $x) {
	print($x . " is a Loony Toon.\n");
}

echo "\n\n\n"; //give some space

/**
 * @TODO read about the function substr on the php documentation page (you get to find it this time).
 * Then, create a foreach loop, similar to the one above, but that only prints the name
 * of the loony toon if the name begins with the letter, "M".
 */
 foreach ($loonyToons as $a) {
	 ( $a = substr ($loonyToons [1], 0, 1));
	 if $a = m;
	 print (" $a is a Loony Toon whose name begins with M!";
 }
 //Creates a substring for each Loony Toon with the first letter of their name. It sets that to a variable, and if that variable is equal to M, it prints the statement.
 
 
 
 
 
 