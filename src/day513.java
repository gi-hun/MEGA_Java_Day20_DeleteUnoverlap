// 위 배열에서 중복안된숫자를 제거하시요 
// 1) {1,2,1,2}
// 2) {4,4}
// 3) {1,1,1,1}

public class day513 {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		
		int temp[] = new int[5];
		int count = 0;
		
		for(int i=0;i<5;i++)
		{
			temp[count] = test1[i];
			int check = 0;
			
			for(int j=0;j<5;j++)
			{
				if(i != j && temp[count] == test1[j])
				{
					check = 1;
				}
				
			}
			if(check == 1)
			{
				count++;
			}
		}
		
		System.out.println("test1");
		for(int i=0;i<count;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		count = 0;
		
		for(int i=0;i<5;i++)
		{
			temp[count] = test2[i];
			int check = 0;
			
			for(int j=0;j<5;j++)
			{
				if(i != j && temp[count] == test2[j])
				{
					check = 1;
				}
				
			}
			if(check == 1)
			{
				count++;
			}
		}
		
		System.out.println("test2");
		for(int i=0;i<count;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		count = 0;
		
		for(int i=0;i<5;i++)
		{
			temp[count] = test3[i];
			int check = 0;
			
			for(int j=0;j<5;j++)
			{
				if(i != j && temp[count] == test3[j])
				{
					check = 1;
				}
				
			}
			if(check == 1)
			{
				count++;
			}
		}
		
		System.out.println("test3");
		for(int i=0;i<count;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}