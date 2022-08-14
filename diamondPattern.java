class Practise
{
    public static void main(String args[])
    {
        StarsUptoN(1, 10);
    }
    static void StarsUptoN(int i, int n)
    {
        if(i == n+1)
            return;

        upLeftPrintStars(i, n); // up left
        UpRightPrintStars(1, i); // up right
        System.out.println();


        StarsUptoN(i+1, n);

        if(i < n)
        {
            downLeftPrintStars(i, n);// down left
            downRightPrintStars(1, i);// down right
            System.out.println();
        }
    }
    static void UpRightPrintStars(int i, int n)
    {
        if(i == n)
            return;
        System.out.print('*'  + " ");
        UpRightPrintStars(i+1, n);

    }
    static void downRightPrintStars(int i, int n)
    {
        if(i == n)
            return;

        downRightPrintStars(i+1, n);
        System.out.print('*' + " ");
    }
    static void upLeftPrintStars(int i, int n)
    {
        if(n <= 0)
            return;
        if(n > i)
            System.out.print(" " + " ");
        else if(n <= i)
            System.out.print('*' + " ");
        upLeftPrintStars(i, n-1);
    }
    static void downLeftPrintStars(int i, int n)
    {
        if(n == 0)
            return;
        if(n <= i)
            System.out.print('*' + " ");
        else if(n > i)
            System.out.print(" " +  " ");

        downLeftPrintStars(i, n-1);

    }
}

/* above program output

                  * 
                * * * 
              * * * * * 
            * * * * * * * 
          * * * * * * * * * 
        * * * * * * * * * * * 
      * * * * * * * * * * * * * 
    * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * * * 
    * * * * * * * * * * * * * * * 
      * * * * * * * * * * * * * 
        * * * * * * * * * * * 
          * * * * * * * * * 
            * * * * * * * 
              * * * * * 
                * * * 
                  * 

Process finished with exit code 0

*/
