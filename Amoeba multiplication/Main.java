#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=1,d;
  std::cin>>a;
  while(a-2>0)
  {
    d=b+c;
    b=c;
    c=d;
    a-=1;
  }
  std::cout<<d;
}