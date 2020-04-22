#include <iostream>
int main() 
{
	int a,b=0;
  	std::cin>>a;
  while(a>0)
  {
    b=b*10+a%10;
    a/=10;
  }
  std::cout<<b;
}