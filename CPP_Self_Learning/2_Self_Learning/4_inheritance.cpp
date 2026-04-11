#include <iostream>
using namespace std;

// Base class 1
class Printer {
protected:
    string brand;

public:
    Printer(string b) {
        brand = b;
    }
};

// Base class 2
class Scanner {
protected:
    int scanSpeed;

public:
    Scanner(int s) {
        scanSpeed = s;
    }
};

// Derived class using multiple inheritance
class AllInOne : public Printer, public Scanner {
private:
    int printSpeed;

public:
    AllInOne(string b, int s, int p) : Printer(b), Scanner(s) {
        printSpeed = p;
    }

    // Friend function
    friend void show(AllInOne obj);
};

// Friend function definition
void show(AllInOne obj) {
    cout << "Brand: " << obj.brand << endl;
    cout << "Scan Speed: " << obj.scanSpeed << endl;
    cout << "Print Speed: " << obj.printSpeed << endl;
}

int main() {
    AllInOne a("HP", 20, 30);
    show(a);

    return 0;
}

// 4. Design a hierarchy of computer printers.
//  Use multiple inheritance in your hierarchy.
//  Also use friend functions and classes in your program. 