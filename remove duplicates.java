class app
  {
    int remDuplicates(int[] a, int n)
    {
int[] tem = new int[n];
tem[0] = a[0];
      int r =1;
      for(int i=1;i<n;i++)
        {
if(tem[r-1]!=a[i])
{
tem[r] = a[i];
  r++;
  
  
}
        }
          for(int i=0;i<n;i++)
            {
a[i] = tem[i];

              
            }
          
        
      
      
    }
  }

    
  
