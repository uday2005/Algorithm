#include <bits/stdc++.h>
using namespace std;

void max_subarray1(){
   int best = 0;
    
    vector<int> arr {-1 , 2, 3 , -2 , 4, 6, -5 ,2};
    int n = arr.size();

    for(int i = 0; i< n; i++){
        for (int j = i ; j< n ; j++){
            int sum = 0;
            for(int k = i ; k<= j ; k++){
                sum += arr[k];
            }
            best = max(best,sum);
        }
    }
    cout << best << "\n";

}
// This time complexity is o (n3) and it is quite efficient

void max_subarray2(){
    int best = 0; 
    vector<int> arr {-1 , 2, 3 , -2 , 4, 6, -5 ,2};
    int n = arr.size();

    for(int i = 0 ; i< n ; i++){
        int sum = 0;
        for(int j = i ; j< n ; j++){
            sum += arr[j];
            best = max(sum , best);
        }
    }
    cout << best << "\n";
}
// now this is the algorith which is for o(n2)

void max_subarray2(){
    int best = 0; 
    vector<int> arr {-1 , 2, 3 , -2 , 4, 6, -5 ,2};
    int n = arr.size();
    int sum = 0;
    for(int i = 0; i<n;i++ ){
        sum = max(arr[i], arr[i]+sum);
        best = max(best , sum);
    }

    cout << best <<  "\n";
}
// This is kdanes algorithm and this the most efficient as this is o(n)
int main(){
 
}


