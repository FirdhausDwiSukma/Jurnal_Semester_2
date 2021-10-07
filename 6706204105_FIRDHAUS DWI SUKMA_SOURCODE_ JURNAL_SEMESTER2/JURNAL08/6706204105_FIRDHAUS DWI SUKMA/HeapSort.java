package Jurnal08;

public class HeapSort {
    public void sort (int anArray[]){
        int n = anArray.length;

        // Build heap (atur ulang array)
        for (int i = n / 2 - 1; i >= 0 ; i--)
            heapify(anArray, n, i);
        // Satu per satu ekstrak elemen dari heap
            for (int i = n - 1; i >= 0; i--) {

                // Pindahkan akar saat ini ke akhir
                int temp = anArray[0];
                anArray[0] = anArray[i];
                anArray[i] = temp;

                // panggil max heapify pada heap yang dikurangi
                heapify(anArray, i, 0);
            }
        }
    //Untuk menumpuk subpohon yang berakar dengan node i yaitu indeks dalam anArray[]. n adalah ukuran heap
    private void heapify(int anArray[], int n, int i)
    {
        int largest = i;  // Inisialisasi yang terbesar sebagai root
        int left = 2 * i + 1;  // kiri = 2*i + 1
        int right = 2 * i + 2;  // kanan = 2*i + 2

        //Jika kiri lebih besar dari root
        if (left < n && anArray[left] > anArray[largest])
            largest = left;

        // Jika kanan lebih besar dari yang terbesar
        if (right < n && anArray[right] > anArray[largest])
            largest = right;

        // Jika terbesar bukan akarnya
        if (largest != i)
        {
            int swap = anArray[i];
            anArray[i] = anArray[largest];
            anArray[largest] = swap;

            // Recursively heapify yang terpengaruh secara sub-tree
            heapify(anArray, n, largest);
        }
    }
    //Fungsi utilitas untuk mencetak berbagai ukuran n
    static void printArray(int anArray[])
    {
        int n = anArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(anArray[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};
        int n = array.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);

        System.out.println("Sort array :");
        printArray(array);
    }
}
