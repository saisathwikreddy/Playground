#include<iostream>
int main()
{
int a,b,i,c=0;
  std::cin>>a>>b;
  for(i=1;i<a+b;i++)
  {
    if((a+b)%i==0)
    {
      c+=i;
    }
  }
  if(c==a+b)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}