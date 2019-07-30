#include <stdio.h>
#include <math.h>
int main()
{
   float a, b, c;
  float discriminant; 
    float root1, root2,real,imag;
    scanf("%f",&a);
   scanf("%f",&b);
   scanf("%f",&c);
    discriminant = b*b-(4*a*c);
    // condition for real and different roots
    if (discriminant > 0)
    {
    // sqrt() function returns square root
        root1 = (-b+sqrt(discriminant))/(2*a);
        root2 = (-b-sqrt(discriminant))/(2*a);
        printf("root1 = %.2f  root2 = %.2f",root1 ,root2);
    }
    //condition for real and equal roots
    else if (discriminant == 0)
    {
        root1 = root2 = -b/(2*a);
        printf("root1 = %.2f  root2 = %.2f",root1,root2);
    }
    else
    {
      real=-b/(2*a);
      imag=sqrt(-discriminant)/(2*a);
      printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,imag,real,imag);
    }
  return 0;
}