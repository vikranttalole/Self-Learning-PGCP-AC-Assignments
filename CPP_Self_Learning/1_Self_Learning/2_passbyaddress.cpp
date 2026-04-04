    #include <iostream>
    using namespace std;
    void changevalue(int *n)
    {
        *n=20;
    }
    int main()
    {
        int num =10;
        cout<<"Before function call :"<<num<<endl;

        changevalue(&num);
        cout<<"After function call :"<<num<<endl;
        return 0;
    }
    