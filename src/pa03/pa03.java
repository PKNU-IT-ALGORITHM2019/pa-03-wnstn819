package pa03;

import java.util.Arrays;

public class pa03 {
	static int[] random_1000 = new int[1000];
	static int[] random_10000 = new int[10000];
	static int[] random_100000 = new int[100000];
	static int[] reverse_1000 = new int[1000];
	static int[] reverse_10000 = new int[10000];
	static int[] reverse_100000 = new int[100000];
	

	public static void main(String[] args) {
		 
	
		init();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("           random1000	    reverse1000     random10000     reverse100000     random100000     reverse100000 ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
         
        
		////////버블 정렬
		bubble_time();
	    ////////선택 정렬
		selection_time();
		////////삽입 정렬
		insert_time();
		////////합병 정렬
        merge_time();
        ////////뮉 정렬(중간값)
		quickMid_time();
		////////퀵 정렬(랜덤값)
        quickRan_time();
        ////////퀵 정렬(마지막값)
	    quickFin_time();
		////////힙  정렬
       heapSort_time();
        ////////자바 라이브러리 정렬
       librarySort_time();
        
		
		



        
	}
	
	    
	static void heapSort(int[] arr) {
		int len = arr.length;
		for(int k= len /2; k>0;k--) {
			downHeap(arr,k,len);
		}
	        do {
	        	int temp = arr[0];
	        	arr[0] = arr[len-1];
	        	arr[len-1] = temp;
	        	len = len -1;
	        	downHeap(arr,1,len);
	        	
	        }while(len>1);
	    
	    }
	
	static void downHeap(int arr[], int k , int len) {
		int j, temp = arr[k-1];
		while(k <= len/2) {
			j = 2*k;
			if((j<len) && (arr[j-1] <arr[j])) j++;
			if(temp>=arr[j-1]) break;
			
			arr[k-1] = arr[j-1];
			k=j;
			
		}
		arr[k-1] =temp;
	}
	    


	
	static void init() {
		random(random_1000);
		random(random_10000);
		random(random_100000);
		reverse(reverse_1000);
		reverse(reverse_10000);
		reverse(reverse_100000);
	}
	
	
	static void bubble_time() {
		System.out.print("bubble");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					bubble(random_1000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				bubble(reverse_1000);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					bubble(random_10000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				bubble(reverse_10000);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					bubble(random_100000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				bubble(reverse_100000);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
	}
	static void selection_time() {
		System.out.print("selection");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long et1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					selection(random_1000);
					 et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum +=(term)/1000;
					random(random_1000);
				}
				System.out.print((double)(sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				selection(reverse_1000);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					selection(random_10000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				selection(reverse_10000);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					selection(random_100000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				selection(reverse_100000);
			}
			
			if(i==1 || i==3 || i ==5) {
		     et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
	}
	static void insert_time() {

		System.out.print("insert");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					insert(random_1000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				insert(reverse_1000);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					insert(random_10000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				insert(reverse_10000);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					insert(random_100000);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				insert(reverse_100000);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
	}
	static void merge_time() {
		System.out.print("merge");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					mergeSort(random_1000,0,random_1000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				mergeSort(reverse_1000,0,reverse_1000.length-1);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					mergeSort(random_10000,0,random_10000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				mergeSort(reverse_10000,0,reverse_10000.length-1);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					mergeSort(random_100000,0,random_100000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				mergeSort(reverse_100000,0,reverse_100000.length-1);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
		
	}
	static void quickMid_time() {
		System.out.print("quickSortMid");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortMid(random_1000,0,random_1000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				quickSortMid(reverse_1000,0,reverse_1000.length-1);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortMid(random_10000,0,random_10000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				quickSortMid(reverse_10000,0,reverse_10000.length-1);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortMid(random_100000,0,random_100000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				quickSortMid(reverse_100000,0,reverse_100000.length-1);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
	}
	static void quickRan_time() {
		System.out.print("quickRan");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortRan_(random_1000,0,random_1000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				quickSortRan_(reverse_1000,0,reverse_1000.length-1);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortRan_(random_10000,0,random_10000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				quickSortRan_(reverse_10000,0,reverse_10000.length-1);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortRan_(random_100000,0,random_100000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				quickSortRan_(reverse_100000,0,reverse_100000.length-1);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
		
	}
	static void quickFin_time() {
		System.out.print("quickFin");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortFin(random_1000,0,random_1000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_1000);
				}
				System.out.print(((double)sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				quickSortFin(reverse_1000,0,reverse_1000.length-1);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortFin(random_10000,0,random_10000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				quickSortFin(reverse_10000,0,reverse_10000.length-1);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					quickSortFin(random_100000,0,random_100000.length-1);
					long et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				quickSortFin(reverse_100000,0,reverse_100000.length-1);
			}
			
			if(i==1 || i==3 || i ==5) {
			long et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
	}
    static void heapSort_time() {
    	System.out.print("heapSort");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long et1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					heapSort(random_1000);
					 et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum +=(term)/1000;
					random(random_1000);
				}
				System.out.print((double)(sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				heapSort(reverse_1000);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					heapSort(random_10000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				heapSort(reverse_10000);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					heapSort(random_100000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				heapSort(reverse_100000);
			}
			
			if(i==1 || i==3 || i ==5) {
		     et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
    }
    static void librarySort_time() {
    	System.out.print("librarySort");
		for(int i=0; i<6;i++) {
			System.out.print("       "+ (i+1)+".");
			long st1 =0;
			long et1 =0;
			long sum=0;
			if(i==0) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					Arrays.sort(random_1000);
					 et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum +=(term)/1000;
					random(random_1000);
				}
				System.out.print((double)(sum/10)+"  ");
					
			}else if(i==1) {
				st1 = System.currentTimeMillis();
				Arrays.sort(reverse_1000);
			}
			else if(i==2) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					Arrays.sort(random_10000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_10000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==3) {
				st1 = System.currentTimeMillis();
				Arrays.sort(reverse_10000);
			}else if(i==4) {
				for(int j=0;j<10;j++) {
					st1 = System.currentTimeMillis();
					Arrays.sort(random_100000);
				    et1 = System.currentTimeMillis();
					long term = et1-st1;
					sum += (term/1000);
					random(random_100000);
				}
				System.out.print(((double)sum/10)+"  ");
			}else if(i==5) {
				st1 = System.currentTimeMillis();
				Arrays.sort(reverse_100000);
			}
			
			if(i==1 || i==3 || i ==5) {
		     et1 = System.currentTimeMillis();
			long term = et1-st1;
			System.out.print(((double)term/1000)+"  ");
			}
			
			
		}
		System.out.println();
    }
	
	
	
	
	static void swap(int arr[],int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	static void threeSort(int arr[], int left, int mid, int right) {
		if(arr[left]>arr[mid]) swap(arr, left,mid);
		if(arr[mid]>arr[right]) swap(arr, mid, right);
		if(arr[left]>arr[mid]) swap(arr,left,mid);
	}
	static void quickSortMid(int arr[], int left, int right) {
		int i, j , pivot, mid = left+(right-left)/2;
		threeSort(arr, left,mid,right);
		if(right-left+1>3) {
			pivot = arr[mid];
			swap(arr,mid,right-1);
			i=left;
			j=right-1;
			
			while(true) {
				while(arr[++i]<pivot&& i<right);
				while(arr[--j]>pivot && left<j);
				if(i>=j) break;
				swap(arr,i,j);
				
			}
			
			swap(arr,i,right-1);
			quickSortMid(arr,left,i-1);
			quickSortMid(arr,i+1,right);
			
		}
	}
	
	static int partitionFin(int arr[], int left, int right) {
             int pivot = arr[left];
             int low = left+1;
             int high = right;
             
             while(low <= high) {
            	 while(pivot >=arr[low] && low <=right) {
            		 if(low == arr.length-1) {
            			 break;
            		 }
            		 low++;
            	 }
            	 while(pivot <= arr[high] && high >= (left+1)) {
            		 high--;
            	 }
            	 if(low<=high) {
            		 swap(arr,low,high);
            	 }
            	 if(low == arr.length-1) {
            		 break;
            	 }
             }
		swap(arr,left,high);
		return high;
	}

	static void quickSortFin(int arr[],int left, int right)
	{
		if(left <= right) {
			int pivot = partitionFin(arr,left,right);
			quickSortFin(arr,left,pivot-1);
			quickSortFin(arr,pivot+1,right);
		}
	}
	
	static int partitionRan_(int arr[], int left, int right) {
         int pivot = arr[(int) (Math.random()*arr.length)];
         int low = left+1;
         int high = right;
         while(low <=high) {
        	 while(pivot >= arr[low] && low <=right) {
        		 if(low == arr.length-1) {
        			 break;
        		 }
        		 low++;
        	 }
        	 
        	 while(pivot <= arr[high] && high >= (left+1)) {
        		 high--;
        	 }
        	 if(low <= high) {
        		 swap(arr,low,high);
        	 }
        	 if(low == arr.length-1) {
        		 break;
        	 }
         }
         swap(arr,left,high);
         return high;
		
		
	}

	 static void quickSortRan_(int arr[], int left, int right) {
          if(left < right) {
        	  int pivot = partitionRan_(arr,left,right);
        	  quickSortRan_(arr,left,pivot-1);
        	  quickSortRan_(arr,pivot+1,right);
          }
		

	}
	
	
	
	

	
	
	
	static void bubble(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr.length-(i+1); j++) {
			 if (arr[j] > arr[j+1]) {
			 // 자리교환
			 temp = arr[j+1];
			 arr[j+1] = arr[j];
			 arr[j] = temp;
			 }
			}
			 }

			
	}
	
	static void insert(int arr[]) {
		for (int i = 1; i < arr.length; i++) { 
			int tmp = arr[i]; 
			int j = i; 
		while (j > 0 && arr[j - 1] >= tmp) { 
			arr[j] = arr[j - 1]; --j; } 
		arr[j] = tmp; 
		}

		
	}
	static void selection(int arr[]) {
		
		int temp;
		for(int i = 0 ; i <  arr.length -1 ; i ++) {
			for(int j = i+1 ; j < arr.length ; j ++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
    static void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=r) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=r)
			temp[k++] = arr[j++];
		for(int index=l; index<k; index++)
			arr[index] = temp[index];
	}




	
	static void random(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*arr.length) + 1;
		}
		
	}
	static void reverse(int[] arr) {
		int count = arr.length;
		for(int i=0; i<arr.length; i++) {
			arr[i] = count;
			count-- ;
		}
	}

}
