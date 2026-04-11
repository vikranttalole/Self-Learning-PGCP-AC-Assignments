#include <iostream>
#include <vector>
using namespace std;

class Item
{
public:
    int itemId;
    string itemName;
    float price;

    // Function to take input
    void input()
    {
        cout << "Enter Item ID: ";
        cin >> itemId;

        cout << "Enter Item Name: ";
        cin >> itemName;

        cout << "Enter Price: ";
        cin >> price;

        // Exception handling
        if(price < 0)
        {
            throw "Price cannot be negative!";
        }
    }

    // Function to display item
    void display()
    {
        cout << "ID: " << itemId 
             << " Name: " << itemName 
             << " Price: " << price << endl;
    }
};

int main()
{
    vector<Item> cart;
    int choice;

    do
    {
        cout << "\n--- Shopping Cart Menu ---\n";
        cout << "1. Add Item\n";
        cout << "2. Display Items\n";
        cout << "3. Calculate Total Bill\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        try
        {
            switch(choice)
            {
                case 1:
                {
                    Item temp;
                    temp.input();   // may throw exception
                    cart.push_back(temp);
                    break;
                }

                case 2:
                {
                    cout << "\nItems in Cart:\n";
                    for(auto item : cart)
                    {
                        item.display();
                    }
                    break;
                }

                case 3:
                {
                    float total = 0;
                    for(auto item : cart)
                    {
                        total += item.price;
                    }
                    cout << "Total Bill: " << total << endl;
                    break;
                }

                case 4:
                    cout << "Exiting...\n";
                    break;

                default:
                    cout << "Invalid choice!\n";
            }
        }
        catch(const char* msg)
        {
            cout << "Exception: " << msg << endl;
        }

    } while(choice != 4);

    return 0;
}