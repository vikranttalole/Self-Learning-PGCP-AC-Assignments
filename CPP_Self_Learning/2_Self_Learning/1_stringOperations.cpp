#include <iostream>
using namespace std;

// String length
int mystrlen(char *str) {
    int count = 0;
    while (*(str + count) != '\0') {
        count++;
    }
    return count;
}

// String copy
void mystrcpy(char *dest, char *src) {
    while (*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// String concatenate
void mystrcat(char *dest, char *src) {
    while (*dest != '\0') {
        dest++;
    }
    while (*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// String compare
int mystrcmp(char *str1, char *str2) {
    while (*str1 && *str2) {
        if (*str1 != *str2) {
            return *str1 - *str2;
        }
        str1++;
        str2++;
    }
    return *str1 - *str2;
}

int main() {
    char str1[50] = "Hello";
    char str2[50] = "World";
    char str3[50];

    cout << "Length of str1: " << mystrlen(str1) << endl;

    mystrcpy(str3, str1);
    cout << "Copied string: " << str3 << endl;

    mystrcat(str1, str2);
    cout << "Concatenated string: " << str1 << endl;

    int res = mystrcmp(str1, str2);
    if (res == 0)
        cout << "Strings are equal" << endl;
    else
        cout << "Strings are not equal" << endl;

    return 0;
}


// 1. Using pointers, write your own functions for the following: 
// String concatenate
//  String copy
//  String length
//   Note: 
// Do not include in your program and implement Delete operator in your program. 