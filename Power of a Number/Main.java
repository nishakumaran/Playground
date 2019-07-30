#include<stdio.h>
int main()
{
    int base,expo;
    long long res=1;
    scanf("%d%d",&base,&expo);
  if(expo<0)
    printf("Wrong input");
  else
  {
  while(expo!=0)
    {
        res*=base;
        --expo;
    }
    printf("%lld", res);
  }
    return 0;
}