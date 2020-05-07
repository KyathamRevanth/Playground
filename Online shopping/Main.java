#include<iostream>
using namespace std;
int main()
{
  int f1,f2,f3,s1,s2,s3,a1,a2,a3;
  float c1,c2,c3,d1,d2,d3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  d1=(f1*f2)*0.01;
  c1=f1+f3-d1;
  d2=(s1*s2)*0.01;
  c2=s1+s3-d2;
  d3=(a1*a2)*0.01;
  c3=a1+a3-d3;
  cout<<"In Flipkart Rs."<<c1;
  cout<<"\nIn Snapdeal Rs."<<c2;
  cout<<"\nIn Amazon Rs."<<c3;
  if(c1<=c2 && c1<=c3)
     cout<<"\nHe will prefer Flipkart";
  else if(c2<c3)
     cout<<"\nHe will prefer Snapdeal";
  else
     cout<<"\nHe will prefer Amazon";
}