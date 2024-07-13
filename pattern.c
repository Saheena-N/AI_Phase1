#include <stdio.h>

int main() {
    int i,j,n;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1&&j<n)
            {
                printf("1");
            }
            else if(i==1&&j==n) 
            {
                printf("*");
            }
            else if(i==2&&i<3&&j==1)
            {
                printf("#");
            }
            else if(i==2&&j<=n)
            {
                printf("2");
            }
            else if(i==3&&j<n)
            {
                printf("3");
            }
            else if(i>=3&&i<4&&j==n)
            {
                printf("*");
            }
            else if(i>=4&&i<5&&j==1)
            {
                printf("#");
            }
            else if(i==4&&j<=n)
            {
                printf("4");
            }
            else if(i==5&&j<n)
            {
                printf("5");
            }
            else if(i<=5&&j==n)
            {
                printf("*");
            }
        }
        printf("\n");
    }
    return 0;
}
