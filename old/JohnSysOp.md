Tratto da [<html>]<a href="http://www.jroller.com/page/pyrasun/20040113#xa_exposed_part_ii_schwartz">XA Exposed Part II</a>[</html>].

[....]

"Consider a case like this - admittedly rare, but these things do sometimes happen in real life: 
	* The system's humming along, transactions are flowing, your boss is smiling, all is good with the world. 
	* The boss' son, Little Jimmy, sneaks into the server room and pulls the plug on your Application Server machine's UPS. He plugs in his GameCube w/ LCD in its place, and plays a bit of Zelda while your UPS slowly winds down to 0 ergs. 
	* The system operator in charge of seeing that the UPS light is flashing on his monitoring console, is instead frantically running around on the corporate floors trying to find Little Jimmy for the boss. 
	* The UPS reaches the end of its rope, gives one last Gasp "Oh, Stella, if I'd only told you how I truly felt!", and then promptly expires, taking the machine and your application server along for the ride to go see Thanatos. 
	* The horrified system operator, peeking into all the toilet stalls on the 17th floor (still looking for Little Jimmy), hears over the corporate-wide intercom "JohnSysOp, JohnSysOp, please come to the 4th floor operations room immediately. The server opsx1115 has gone down, a quarter of the users are offline, and the boss swears he heard a UPS in the machine room calling the name 'Stella'. The talking power supplies and downed servers require your immediate attention. Thank you and have a nice day." 
	* JohnSysOp runs to the 4th floor, finds that not only has all hell has broken loose, but Satan himself is sitting in his cubicle drinking his cafe latte, and almost as bad finds the door to the production machine room is jammed. Meanwhile, checking his consoles (after directing Satan to the men's room on the 17th floor), John sees that half the transactions in the system are blocked due to 10 "in-doubt transactions" in DB2. 
	* John consults his runbook, frantically skims the index, and finds the entry on page 1,231 which covers downed application servers, jammed doors, Satan sitting in his cubicble drinking lattes, and a slight drizzle coming from the West. First checking that it is indeed drizzling outside, John follows the directions: "Log onto DB2, list in_doubts, rollback all in-doub transactions. Call maintenance to unjam the door. Borrow and umbrella from Suzie on the fifth floor. AND ABOVE ALL, DON'T LET SATAN GO TO THE BATHROOM! 
	* Despite his lapse with the Satan thing, John considers he's done good. Transactions aren't blocked, maintenance has unjammed the door, he's found Jimmy, he's plugged the UPS back in, and the app server's coming back up 
	* Upon sauntering back to his console, John finds 7 messages on the alert console. "ERROR: Heueristic rollback is incompatible with the global state of this transaction - WHY DID YOU LET SATAN GO TO THE BATHROOM!?!?" 

[...]
