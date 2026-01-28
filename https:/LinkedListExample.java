// LinkedListExample.java
// Program to demonstrate basic linked list operations

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

public class LinkedListExample {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List:");
        list.display();
    }
}// calculator.c
// Program to perform basic arithmetic operations

#include <stdio.h>

int main() {
    char operator;
    double num1, num2;
    printf("Enter an operator (+, -, *, /): ");
    scanf(" %c", &operator);
    printf("Enter two numbers: ");
    scanf("%lf %lf", &num1, &num2);

    switch(operator) {
        case '+': printf("%.2lf + %.2lf = %.2lf\n", num1, num2, num1 + num2); break;
        case '-': printf("%.2lf - %.2lf = %.2lf\n", num1, num2, num1 - num2); break;
        case '*': printf("%.2lf * %.2lf = %.2lf\n", num1, num2, num1 * num2); break;
        case '/': 
            if(num2 != 0) printf("%.2lf / %.2lf = %.2lf\n", num1, num2, num1 / num2);
            else printf("Error: Division by zero!\n");
            break;
        default: printf("Invalid operator\n");
    }
    return 0;
}# factorial.py
# Program to calculate factorial of a number

def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n-1)

num = int(input("Enter a number: "))
print(f"Factorial of {num} is {factorial(num)}")
