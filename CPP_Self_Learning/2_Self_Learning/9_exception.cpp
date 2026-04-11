#include <iostream>
using namespace std;

int main() {
    int a, b;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    try {
        if (b == 0) {
            throw "Division by zero is not allowed!";
        }

        int result = a / b;
        cout << "Result: " << result << endl;
    }
    catch (const char* msg) {
        cout << "Exception caught: " << msg << endl;
    }

    cout << "Program continues..." << endl;

    return 0;
}

// 9. Implement exceptions and do proper management through your program 