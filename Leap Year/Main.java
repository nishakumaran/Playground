#include<stdio.h>
int main()
{
  int year,f=0;
  scanf("%d",&year);
  if(year%100==0)
  {
    if(year%400==0)
    {
      f=1;
    }
  }
  else if(year%4==0) 
  {
    f=1;
  }
  if(f==1)
  {
    printf("LEAP YEAR");
  }
  else 
  {
    printf("NOT LEAP YEAR");
  }
           
  
  return 0;
}