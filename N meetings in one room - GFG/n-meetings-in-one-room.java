//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int st[], int end[], int n)
    {
        // add your code here
	int [][] arr = new int [st.length][2];
	for (int i = 0; i < arr.length; i++) {
		arr[i][0] = st[i];
		arr[i][1] = end[i];
	}
	Arrays.sort(arr,Comparator.comparingInt(o->o[1]));
	int count = 1;
	int s = arr[0][0];
	int en = arr[0][1]; 
	for (int i = 1; i < end.length; i++) {
		
		if(arr[i][0]>en) {
			s = arr[i][0];
			en = arr[i][1];
			count++;
		}
		
	} return count;
    }
}
