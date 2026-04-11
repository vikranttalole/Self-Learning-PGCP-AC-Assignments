#include <iostream>
using namespace std;

// Abstract class
class Shape {
public:
    // Pure virtual function
    virtual void area() = 0;
};

// Derived class 1
class Rectangle : public Shape {
private:
    int length, breadth;

public:
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        cout << "Area of Rectangle: " << length * breadth << endl;
    }
};

// Derived class 2
class Circle : public Shape {
private:
    float radius;

public:
    Circle(float r) {
        radius = r;
    }

    void area() {
        cout << "Area of Circle: " << 3.14 * radius * radius << endl;
    }
};

int main() {
    Shape *s;   // pointer of abstract class

    Rectangle r(10, 5);
    Circle c(7);

    s = &r;
    s->area();

    s = &c;
    s->area();

    return 0;
}
// 6. Implement Abstract classes in your program 