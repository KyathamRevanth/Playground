#include<iostream>
int main() {
  int a,b,sum,sub,mul,div,mod;
  std::cin>>a;
  std::cin>>b;
  sum=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  mod=a%b;
  std::cout<<"a+b="<<sum<<"\n";
  std::cout<<"a-b="<<sub<<"\n";
  std::cout<<"a*b="<<mul<<"\n";
  std::cout<<"a/b="<<div<<"\n";
  std::cout<<"a%b="<<mod;
}