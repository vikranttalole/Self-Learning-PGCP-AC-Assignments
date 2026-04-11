#include <iostream>
using namespace std;

class Date {
private:
    int day, month, year;

public:
    void read() {
        cout << "Enter date (dd mm yyyy): ";
        cin >> day >> month >> year;
    }

    void print() {
        cout << day << "/" << month << "/" << year << endl;
    }

    // Add days
    void operate(int d) {
        day += d;
    }

    // Subtract days
    void operate(int d, int flag) {
        day -= d;
    }
};

class Time {
private:
    int hh, mm, ss;

public:
    void read() {
        cout << "Enter time (hh mm ss): ";
        cin >> hh >> mm >> ss;
    }

    void print() {
        cout << hh << ":" << mm << ":" << ss << endl;
    }

    // Add seconds
    void operate(int s) {
        ss += s;
    }

    // Subtract seconds
    void operate(int s, int flag) {
        ss -= s;
    }
};

int main() {
    Date d;
    Time t;

    d.read();
    d.print();

    t.read();
    t.print();

    // Overloaded functions
    d.operate(5);        // add days
    t.operate(30);       // add seconds

    cout << "\nAfter Addition:\n";
    d.print();
    t.print();

    d.operate(2, 1);     // subtract days
    t.operate(10, 1);    // subtract seconds

    cout << "\nAfter Subtraction:\n";
    d.print();
    t.print();

    return 0;
}


// 5. Write Date and Time classes that allow you to
//  add, subtract, read and print simple dates in dd/mm/yyyy and time in hh:mm:ss formats. 
// Use function overloading in your program