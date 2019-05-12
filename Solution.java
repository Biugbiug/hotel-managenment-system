package NiuKe;

import java.util.ArrayList;
import java.util.Stack;

//��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
//ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
//�ж��������Ƿ��и�����
public class Solution {
    public boolean Find(int target, int [][] array) {

       for (int i = 0; i < array.length; i++) {
		
    	  int low = 0;
    	  int high = array[i].length - 1;
    	  int mid = 0;
    	  
    	  while(low <= high) {
    		 mid = (low + high) / 2;
    		 
    		 if (array[i][mid] > target) {
				
    			 high = mid - 1;
			}else if(array[i][mid] < target) {
    		  low = mid + 1; 
    	  }else {
    		  return true;
    	  }
	}
    }
       return false;
}
    
    
//    ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
//    ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
    public String replaceSpace(StringBuffer str) {
    	
    	if (str == null) {
			return null;
		}
    	
    	for (int i = 0; i < str.length(); i++) {
			
    		if (str.charAt(i) == ' ') {
				str.replace(i, i+1, "%20");
			}
		}
    	String string = str.toString();
    	return string;
    	
    }
    
//   ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
	 //��ʼ������
	 Stack<Integer> stack = new Stack<>();
	 
	 //�������ڿյ�ʱ�� ��ֵѹ��ջ
     while (listNode != null) {
    	 //ѹջ
         stack.push(listNode.val);
         //�ı��б�λ��
         listNode = listNode.next;
     }

     //����һ��ArrayList
     ArrayList<Integer> list = new ArrayList<>();
     
     //��ջ�е�ֵ�ŵ�arraylist��
     while (!stack.isEmpty()) {
         list.add(stack.pop());
     }
     return list; 
	 
    }
    
 public String removeOuterParentheses(String S) {
     int max = S.length();
     StringBuffer sb = new StringBuffer(S);
     sb.replace(0, 1, "");
     sb.replace(max,max+1,"");
     return sb.toString();
 }
 
 
// ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
// �������쳲��������еĵ�n���0��ʼ����0��Ϊ0��
 public int Fibonacci(int n) {

	 if (n <= 0) {
		return 0;
	}
	 if (n == 1 || n == 2) {
		return 1; 
	}
	 
	 int temp = 0;
	 int f1 = 1;
	 int f2 = 1;
	 
	 for(int i = 0 ; i < n ; i ++) {
	 temp = f2;
	 f2 = f1 + f2 ;
	 f1 = temp;
	 }
	 
	 return f2;
 }
 
 //һֻ����һ�ο�������1��̨�ף�Ҳ��������2��
// �������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 public int JumpFloor(int target) {
	        //�ų��������
	        if (target <= 0)  return 0;
	        if (target == 1)  return 1;
	        if (target == 2)  return 2;
	        //쳲��������й���
	        int first = 1, second = 2, third = 0;
	        for (int i = 3; i <= target; i++) {
	            third = first + second;
	            first = second;
	            second = third;
	        }
	        return third;
	    }
	 
 }