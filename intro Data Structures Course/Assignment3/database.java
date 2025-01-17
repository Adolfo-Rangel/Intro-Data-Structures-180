package assignment3;

 public class database{
	 
	public void bubbleSort (int dbnums []) {

			int temp;
			int indicator=0;

		for(int i = dbnums.length-1; i >= 0; i--) {

		for(int j = 0; j < i; j++) {

			if(dbnums[j]>dbnums[j+1]) {

				indicator=1;

				temp=dbnums[j];

				dbnums[j]=dbnums[j+1];

				dbnums[j+1]=temp;

				}
			}

		if(indicator==0)break;

		}

	}

	public int min (int dbnums[]) {

			int min=dbnums[0];

		for (int i = 1 ; i < dbnums.length; i++) {

		if(dbnums[i] < min) min = dbnums[i];

			}

	return min;

		}

	public int max (int dbnums[]) {

			int max = dbnums[0];

		for (int i = 1; i  <dbnums.length; i++) {

		if(dbnums[i] > max) max = dbnums[i];

			}

	return max;

		}

	public double average (int dbnums[]) {

			double total = 0;

		for (int i = 0 ; i < dbnums.length; i++) {

			total+=dbnums[i];

			}

	return total/(dbnums.length);

		}

	public int binarySearch(int dbnums[] ,int key) {

			int l = 0;

			int r = dbnums.length-1;

		while (l <= r)

		{

			int m = l + (r-l)/2;

		if (dbnums[m] == key)

	return m;  

		if (dbnums[m] < key)

			l = m + 1;

		else

			r = m - 1;

		}

	return -1;

	}

}

