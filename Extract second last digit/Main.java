#include<stdio.h>
int main()
{
  int n,s,r;
  scanf("%d",&n);
  s=n%1000;
  r=(s/10)%10;
  printf("%d",r);
  return 0;
}