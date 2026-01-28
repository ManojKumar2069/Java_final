class Matrix_op
{
	public void display_mat(int[][] a)
	{
		for(int[]rows : a)
		{
			for(int value:rows)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void addMatrix(int[][] a,int[][] b)
	{
		int[][] res=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		display_mat(res);
	}
	public void addMatrix(int[][] a,int[][] b,int size)
	{
		int[][] res=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		display_mat(res);
	}
	public void addMatrix(int[][] a,int[][] b,int rows,int col)
	{
		int[][] res=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		display_mat(res);
	}
}
public class pg12_1 {
	public static void main(String args[])
	{
		Matrix_op obj=new Matrix_op();
		int[][] m1={{1,3},{5,6}};
		int[][] m2={{6,8},{5,4}};
		obj.addMatrix(m1, m2);
		int[][] m3={{5,6,7},{5,6,4},{3,8,6}};
		int[][] m4={{4,3,9},{8,2,3},{7,4,1}};
		obj.addMatrix(m3, m4, 3);
		int[][] m5={{5,6,3},{9,6,3}};
		int[][] m6={{8,9,6},{7,4,2}};
		obj.addMatrix(m5, m6, 2, 3);
	}
}
