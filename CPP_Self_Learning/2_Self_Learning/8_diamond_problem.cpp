#include <iostream>
using namespace std;

class Person {
public:
    void show() {
        cout << "I am Person" << endl;
    }
};

// Virtual inheritance
class Student : virtual public Person {};
class Employee : virtual public Person {};

class Manager : public Student, public Employee {};

int main() {
    Manager m;
    m.show();  // ✔ no ambiguity

    return 0;
}




// 8. Implement diamond problem with real life example 