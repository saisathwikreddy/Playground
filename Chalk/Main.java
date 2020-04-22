#include<iostream>
using namespace std;
int main()
{
  int n,i;
  std::cin>>n;
  if(n>15)
    std::cout<<n+5;
  else if(n<=15)
    std::cout<<n+4;
}