#include<iostream>
using namespace std;
int main()
{
  int a,c=0,b;
  std::cin>>a;
  b=a;
  while(a>0)
  {
    c+=a%10;
    a/=10;
  }
  if(b%c==0)
  std::cout<<"Harshad Number";
  else
  std::cout<<"Not Harshad Number";
}