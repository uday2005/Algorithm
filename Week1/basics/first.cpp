#include <bits/stdc++.h>

using namespace std;

long long factorial(int num, int m){
	long long x = 1;

	for(int i = 2; i<=num; i++){
		x = (x* i)%m;
	}
	return x % m;
}

int main(){
	
	cout << "why";

	// cout << "Enter two integers: ";
	// int a  , b;
	// scanf("%d %d", &a, &b);
	// printf("%d %d\n", a, b);

	long long x = 123445575LL;
	cout << x;

	int m = 123456789;
	long long n = m * m;
	cout << n << "\n";

	// so what happens here is it overflows so we can explicitely type cast the int to long long 

	long long p = (long long) m* m;
	cout << p << "\n";
	return 0;
}

// we can also use the scanf and printf functions from the C standard library
// to read and write data in C++ programs.

// These are little bit faster than cin and cout, but they are less safe.

