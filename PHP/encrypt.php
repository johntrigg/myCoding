#!/usr/bin/php -d display_errors
<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

class Caesar {
	public static $numbersToLetters = array(
	0 	=> 'A',
	1 	=> 'B',
	2 	=> 'C',
	3 	=> 'D',
	4 	=> 'E',
	5 	=> 'F',
	6 	=> 'G',
	7 	=> 'H',
	8	=> 'I',
	9 	=> 'J',
	10 	=> 'K',
	11 	=> 'L',
	12	=> 'M',
	13	=> 'N',
	14	=> 'O',
	15	=> 'P',
	16	=> 'Q',
	17	=> 'R',
	18	=> 'S',
	19	=> 'T',
	20	=> 'U',
	21  => 'V',
	22	=> 'W',
	23  => 'X',
	24  => 'Y',
	25	=> 'Z'
	);
	
	public static $lettersToNumbers = array(
	'A'	=> 0,
	'B'	=> 1,
	'C' => 2,
	'D'	=> 3,
	'E'	=> 4,
	'F'	=> 5,
	'G' => 6,
	'H'	=> 7,
	'I' => 8,
	'J'	=> 9,
	'K'	=> 10,
	'L'	=> 11,
	'M'	=> 12,
	'N'	=> 13,
	'O'	=> 14,
	'P'	=> 15,
	'Q'	=> 16,
	'R'	=> 17,
	'S'	=> 18,
	'T'	=> 19,
	'U'	=> 20,
	'V' => 21,
	'W'	=> 22,
	'X' => 23,
	'Y' => 24,
	'Z'	=> 25
	);




	/**
	 * The shift 
	 */
	public $shift_key = 3;

	/**
	 * Encrypts the plaintext using the shift key, and returns the ciphertext (in all caps).
	 */
	public function encrypt($plaintext) {
		$plaintext = strtoupper($plaintext); 
		$plaintext = str_split ($plaintext); 
		$cyphertext = array(); 
		$tmp_plain_num = 0;
		$tmp_crypt_num = 0;
		foreach ($plaintext as $char) {
			if(ctype_alpha($char)) {
				$tmp_plain_num = self::$lettersToNumbers[$char];
				$tmp_crypt_num = ($tmp_plain_num + $this->shift_key) % 26; 
				$cyphertext[] = self::$numbersToLetters[$tmp_crypt_num]; 
			} else {
				$cyphertext[] = $char; 
		}
		

		
		$cyphertext = implode($cyphertext); 
		
		return($cyphertext);
	}
