#include <iostream>
using namespace std;

// Abstract Base Class
class Printer {
public:
    virtual void print() = 0;  // pure virtual function
};

// Derived Class 1
class InkjetPrinter : public Printer {
public:
    void print() {
        cout << "Printing using Inkjet Printer" << endl;
    }
};

// Derived Class 2
class LaserPrinter : public Printer {
public:
    void print() {
        cout << "Printing using Laser Printer" << endl;
    }
};

// Derived Class 3
class DotMatrixPrinter : public Printer {
public:
    void print() {
        cout << "Printing using Dot Matrix Printer" << endl;
    }
};

int main() {
    Printer *p;   // base class pointer

    InkjetPrinter i;
    LaserPrinter l;
    DotMatrixPrinter d;

    p = &i;
    p->print();

    p = &l;
    p->print();

    p = &d;
    p->print();

    return 0;
}


// 7. Using virtual and pure virtual functions implement hierarchy of computer printers