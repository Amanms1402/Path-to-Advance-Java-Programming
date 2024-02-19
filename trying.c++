#include <iostream>
using namespace std;

class Node {
public:
  Node *prev;
  Node *next;
  int data;

  Node() {
    this->data = 0;
    this->prev = NULL;
    this->next = NULL;
  }

  Node(int data) {
    this->data = data;
    this->prev = NULL;
    this->next = NULL;
  }
};

void print(Node *head) {
  Node *temp = head;
  while (temp != NULL) {
    cout << temp->data << " ";
    temp = temp->next;
  }
}

void insertAtHead(Node *&head, Node *&tail, int data) {
  if (head == NULL) {
    Node *newNode = new Node(data);
    head = newNode;
    tail = newNode;
    return;
  }

  // step 1 : Creata a new node
  Node *newNode = new Node(data);

  // step
  newNode->next = head;
  head->prev = newNode;
  head = newNode;
}

int main() {
  Node *head = NULL;
  Node *tail = NULL;
  Node *first = new Node(12);
  Node *second = new Node(98);
  first->next = second;
  second->prev = first;
  insertAtHead(head, tail, 23);
  insertAtHead(head, tail, 39);
  print(head);
}