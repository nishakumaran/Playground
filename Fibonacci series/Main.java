#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=0,b=1,c;
  printf("%d ",a);
  printf("%d ",b);
  for(int i=1;i<=n-2;i++)
  {
    c=a+b;
    printf("%d ",c);
    a=b;
    b=c;
  } 
  return 0;
}