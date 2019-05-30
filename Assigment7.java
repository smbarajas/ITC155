/* 
Wrote a modified version of the selection sort algorithm that selects the largest element each time 
and moves it to the end of the array, instead of selecting the smallest element and moving it towards the beginning.
*/

public static int[] sort(int[] list) {
int i, j, maxNum, maxInde, temp = 0;
for (i = list.length-1; i >= 0; i--) {

    maxNum = list[i];
    maxInde = i;
    for (j = 0; j < i; j++) { 
        if (list[j] > maxNum) {
            maxNum = list[j];
            maxInde = j;
        }
    }
    if (maxNum > list[i]) {
        temp = list[i];
        list[i] = list[maxInde];
        list[maxInde] = temp;
    }
}
