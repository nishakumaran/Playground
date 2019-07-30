#include<stdio.h>
int main()
{
int a,b,smaller,f=0,gcd,lcm;
scanf("%d",&a);
scanf("%d",&b);
if(a>b)
	smaller=b;
else
    smaller=a;
for(int i=smaller;i>1;i--)
      {
        if((a%i==0)&&(b%i==0))
           {
            gcd=i;
             f=1;
             break;
           }
      }
      if(f==0)
      {
        gcd=1;
      }
  lcm=(a*b)/gcd;
  printf("%d",lcm);
 return 0;

}