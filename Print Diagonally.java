class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int A[][])
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int k = 0; k < n; k++)
        {
            
            int row = 0, col = k;
            while (col >= 0)
            {
              list.add(A[row][col]);
              row++;
              col--;
            }
        }
         
         
        for (int j = 1; j < n; j++)
        {
            int col = n - 1, row = j;
            while (row < n)
            {
                list.add(A[row][col]);
                row++;
                col--;
            }
        }
        
        return list;
    }
}

