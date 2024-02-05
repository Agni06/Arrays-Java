class app
  {
void left(int[] a;int n)

    {
      int t = a[0];
      for(int i=1;i<n;i++)
        {
          a[i-1] = a[i];
          
        }
      a[n-1] = t;
      
    }
    
  }
