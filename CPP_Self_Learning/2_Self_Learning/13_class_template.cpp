#include <iostream>
using namespace std;

template <class T>
class Test {
private:
    T data;

public:
    void setData(T d) {
        data = d;
    }

    void display() {
        cout << "Data: " << data << endl;
    }
};

int main() {
    Test<int> t1;
    t1.setData(10);
    t1.display();

    Test<string> t2;
    t2.setData("Vikrant");
    t2.display();

    return 0;
}