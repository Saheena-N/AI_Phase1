#include <stdio.h>
#include <string.h>
int main() 
{
    int n;
    scanf("%d",&n);
    int a[n],i,j,c=0;
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("prime numbers are\n");
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=2;j<=a[i]/2;j++)
        {
            if(a[i]%j==0)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            printf("%d\n",a[i]);
        }
    }
    
    return 0;
}
