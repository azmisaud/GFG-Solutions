//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



// class Node {
//     int data;
//     Node next;
    
//     public Node (int data){
//         this.data = data;
//         this.next = null;
//     }
// }

class Solution {
    // private Node reverse(Node head){
    //     Node previous=null;
    //     Node current=head;
    //     while(current!=null){
    //         Node next=current.next;
    //         current.next=previous;
    //         previous=current;
    //         current=next;
    //     }
    //     return previous;
    // }
    // private Node combineLists(Node node1, Node node2){
    //     Node forUse=new Node(0);
    //     Node tail=forUse;
    //     while(node1!=null && node2!=null){
    //         if(node1.data<=node2.data){
    //             tail.next=node1;
    //             node1=node1.next;
    //         } else {
    //             tail.next=node2;
    //             node2=node2.next;
    //         }
    //         tail=tail.next;
    //     }
    //     if(node1!=null) tail.next=node1;
    //     if(node2!=null) tail.next=node2;
    //     return forUse.next;
    // }
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        // if(head==null || head.next==null) return head;
        // Node increasing=head,decreasing=head.next,temp=decreasing.next;
        // while(temp!=null){
        //     Node nextIncreasing=temp.next;
        //     Node nextDecreasing=null;
        //     if(nextIncreasing!=null) nextDecreasing=nextIncreasing.next;
        //     increasing.next=temp;
        //     increasing=temp;
        //     if(nextDecreasing!=null){
        //         decreasing.next=nextIncreasing;
        //         decreasing=nextIncreasing;
        //     } else decreasing.next=null;
        // }
        // increasing.next=null;
        // decreasing=reverse(decreasing);
        // return combineLists(head,decreasing);
        ArrayList<Integer> ar=new ArrayList<>();
        Node current=head;
        while(current!=null){
            ar.add(current.data);
            current=current.next;
        }
        Collections.sort(ar);
        Node head1=new Node(ar.get(0));
        Node temp=head1;
        for(int i=1;i<ar.size();i++){
            Node n=new Node(ar.get(i));
            temp.next=n;
            temp=n;
        }
        return head1;
   }

}