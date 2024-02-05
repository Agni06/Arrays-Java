class app
  {
    public static void main(String args[])
    {
int[] a = {1,2,3,4};
      int l =0;
      int h = a.length-1;
      while(l<h)
        {
int tem = a[l];
        a[l] = a[h];
          a[h] = tem ;
          l++;
          h--;
          
          
        
        print(a);
      
    }
  }
