#include <iostream>
using namespace std;
class Vikrant
{
    int num;

    public:
    Vikrant()
    {
        cout<<"No argument constructor is called:"<<endl;
        // num=10;
    }

    Vikrant(int n)
    {
        num=n;
        cout<<"Parametrized constrctor is called "<<endl;
    }
    ~Vikrant()
    {
        cout<<"Destructor is called"<<endl;
    }

    void display()
    {
        cout<<"Value of num is :"<<num<<endl;
    }
};
int main()
{
    Vikrant obj1;
    obj1.display();                 //default constructor
    
    Vikrant obj2(50);
    obj2.display();               //parametrized constructor
    return 0;

};

// 2. Implement constructor and destructors through your program 