// Author: Joshua Ciffer
// Version: 04/03/2018

#include <iostream>

using namespace std;

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
