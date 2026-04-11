#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ifstream fin("data.txt");
    string line;

    while (getline(fin, line)) {
        cout << line << endl;
    }

    fin.close();

    return 0;
}
// 12. Assignments on files doing different operations