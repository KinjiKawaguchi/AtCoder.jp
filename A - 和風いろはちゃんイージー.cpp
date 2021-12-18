#include <iostream>

using namespace std;

int main() {
	int A[3] = { 0,0,0 };
	int five = 0, seven = 0;
	for (int i = 0; i < 3; i++)cin >> A[i];
	for (int i = 0; i < 3; i++) {
		if (A[i] == 5) {
			five++;
		}
		else if (A[i] == 7) {
			seven++;
		}
	}
	if (five == 2 && seven == 1) {
		cout << "YES";
	}else {
		cout << "NO";
	}
	return 0;
}
