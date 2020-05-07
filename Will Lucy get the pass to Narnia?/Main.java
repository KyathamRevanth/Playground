#include<iostream>
int main() 
{
  int a,b,c,x;
  float d;
  std::cin>>a;
  std::cin>>b;
  std::cin>>x;
  std::cout<<"Enter first number : ";
  std::cout<<"Enter second number : ";
  std::cout<<"Menu";
  std::cout<<"\n"<<"1.Addition";
  std::cout<<"\n"<<"2.Subtraction";
  std::cout<<"\n"<<"3.Multiplication";
  std::cout<<"\n"<<"4.Division";
  std::cout<<"\n"<<"5.Remainder"<<"\n";
  switch(x) 
  {
    default : std::cout<<"Invalid operation";
    break;
    case 1 :
      c = a + b;
      std::cout<<c;
    break;
    case 2 : 
      c = a - b;
      std::cout<<c;
    break;
    case 3 :
      c = a * b;
      std::cout<<c;
    break;
    case 4 :
      d = a / b;
      std::cout<<d;
    break;
    case 5 :
      c = a % b;
      std::cout<<c;
    break;
  }
}