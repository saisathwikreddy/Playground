#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  std::cin>>a;
  while(a>1)
  {
    std::cout<<a<<"\n";
    if(a%2)
      a=3*a+1;
    else
      a/=2;
    c++;
  }
  std::cout<<a<<"\n"<<c;
}