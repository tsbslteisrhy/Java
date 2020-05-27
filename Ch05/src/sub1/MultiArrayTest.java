package sub1;

/*
 * ��¥ : 2020/05/04
 * �̸� : ��ȿ��
 * ���� : ������ �迭 �ǽ��ϱ�
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		
		// 1���� �迭
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;

		/** �̷��Ե� ����
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		*/
		
		for(int score : scores ) {
			sum += score;
		}
				
		System.out.println("�迭 scores�� ���� : "+sum);
		
		// 2���� �迭
		int arr2d[][] = {{1,  2,  3,  4},
						 {5,  6,  7,  8},
						 {9, 10, 11, 12}};
		
		for(int a=0 ; a<arr2d.length ; a++) {
			for (int b=0 ; b<arr2d[a].length ; b++) {
				System.out.println("�迭 arr2d�� "+(a+1)+"�� "+(b+1)+"�� ���� : "+arr2d[a][b]);
			}
		}
		
		// 3���� �迭
		int arr3d[][][] = {{{ 1,  2,  3}, 
							{ 4,  5,  6},
							{ 7,  8,  9},
							{10, 11, 12}}, 
						   {{13, 14, 15},
							{16, 17, 18},
							{19, 20, 21},
							{22, 23, 24}}, 
						   {{25, 26, 27}, 
							{28, 29, 30},
							{31, 32, 33},
							{34, 35, 36}}};
		
		/**3�� for���� �� �Ⱦ���.
		for(int x=0 ; x<arr3d.length ; x++) {
			for(int y=0 ; y<arr3d[x].length ; y++) {
				for(int z=0 ; z<arr3d[x][y].length ; z++) {
					System.out.println("3���� �迭 "+(x+1)+"��"+(y+1)+"��"+(z+1)+"�� : "+arr3d[x][y][z]);
				}
			}
		}
		*/
		
		System.out.println("3���� �迭 1��1��1�� : "+arr3d[0][0][0]);
		System.out.println("3���� �迭 1��3��3�� : "+arr3d[0][2][2]);
		System.out.println("3���� �迭 2��1��2�� : "+arr3d[1][0][1]);
		System.out.println("3���� �迭 2��3��3�� : "+arr3d[1][2][2]);
		System.out.println("3���� �迭 3��1��3�� : "+arr3d[2][0][2]);
		System.out.println("3���� �迭 3��4��3�� : "+arr3d[2][3][2]);
	}
}
