#include <bits/stdc++.h>

using namespace std;
// one of the preety good sorting is o(n2)

void sorting1(vector<int> &arr ){
    int n = arr.size();
    for(int i = 0; i< n; i++){
        for(int j = 0 ; j< n-1; j++){
            swap(arr[j] , arr[j+1]);

        }
    }
}

void  merge(vector<int> &arr,int low , int mid ,int high){
   
    vector<int> ds;
    int i = low; 
    int j = mid+1;
    
    // This is giving it to array into two array virtually

    while(i <= mid && j <= high){
        if(arr[i] < arr[j]){
            ds.push_back(arr[i]);
            i++;
        }
        else{
            ds.push_back(arr[j]);
            j++;
        }
    }
    while(i <= mid){
        ds.push_back(arr[i]);
        i++;
    }
    while(j <= high){
        ds.push_back(arr[j]);
        j++;
    }
    
    for(int k = low ; k<= high ; k++){
        arr[k] = ds[k-low];
    }


}
void merge_sort(vector<int>&arr , int low , int high){
    if (low >= high) return ;
    int mid = low +( high - low )/2;
    merge_sort(arr , low , mid);
    merge_sort(arr , mid+1 , high);  
    merge(arr, low, mid, high); 
} 

void counting_sort(vector<int> &arr){
    
}

int main(){

    vector<int> arr = {5, 2, 4, 7, 1, 3, 2, 6};
    merge_sort(arr, 0, arr.size()-1);

    for (int x : arr) cout << x << " ";
    // Output: 1 2 2 3 4 5 6 7
    return 0;
}