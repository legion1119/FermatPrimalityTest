This is a primality test which uses Fermats little theorem (a^p-1 is congruent to 1 mod p (where a is any random integer greater than 1
and less than p and p is the integer to be tested)) in order to determine whether or not a number is probably prime.  Since this primality 
test can turn up false primes via carmichael number then it is necessary to run more than one test where a is the changing variable.  Given
that their are 10 test the chance of producing a false prime should should be .09765625%.  Also, I think that this implementation is an O(n)
algorithm, but I'm not sure.
