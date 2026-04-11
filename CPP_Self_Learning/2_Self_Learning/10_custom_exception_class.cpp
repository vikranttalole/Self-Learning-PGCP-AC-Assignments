#include <iostream>
using namespace std;

// Custom Exception Class
class MyException {
public:
    void message() {
        cout << "Custom Exception: Division by zero is not allowed!" << endl;
    }
};

int main() {
    int a, b;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    try {
        if (b == 0) {
            throw MyException();  // throwing object
        }

        cout << "Result: " << a / b << endl;
    }
    catch (MyException e) {
        e.message();  // handling exception
    }

    cout << "Program continues..." << endl;

    return 0;
}


// 10. Implement Custom exception class 



