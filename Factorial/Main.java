#include<stdio.h>
int main()
{
	
    int i;
  long int num,fact = 1;
    scanf("%ld", &num);
    if (num <= 0)
        fact = 1;
    else
    {
     for (i = 1; i <= num; i++)
     {
      fact = fact * i;
     }
    }
    printf("%ld\n",fact);
}
