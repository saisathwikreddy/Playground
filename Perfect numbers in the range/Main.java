#include<iostream>
int main()
{
  int a,b,i,j;
  std::cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    int c=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
        c+=j;
    }
    if(i==c)
      std::cout<<i<<" ";
  }
}