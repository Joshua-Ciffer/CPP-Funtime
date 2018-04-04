// Author: Joshua Ciffer
// Version: 04/03/2018

#include <iostream>
#include <cmath>

using namespace std;

void helloWorld();
void temperatureConversion();
void doMath();

int main() {
	doMath();
	return 0;
}

/*
 * cout is an object from the std namespace.  It is the standard console output stream. cout is utilized with the << operator.  This << operator sends
 * data to the object to be written to the console.  << functions similarily to the concatenation operator in java.  endl is also an object from std
 * that acts as the new line terminator.  Similar to \n.
 */
void helloWorld() {
	cout << "Hello World!" << endl;
}

/*
 * cin is an object from the std namespace that provides console input.  You store input using the stream operator (>>), with the data flowing
 * from the cin object to the variable.
 */
void temperatureConversion() {
	double celsius;
	cout << "Enter the celsius temperature: ";
	cin >> celsius;
	cout << "Farenheit temperature: " << ((celsius * 1.8) + 32) << endl;
}

/*
 * The math library requires the inclusion of cmath.
 */
void doMath() {
	sqrt(34);
}

