package practice;

public class KlentParaisoLab01 {

	private int count;
    private int[] stack = new int[20];
    private int top = 1;

    public String getStack() {
        String output = "Stack: ";
        if (top <= 1) {
            output += "Empty ";

        } else {
            for (int i = 0; i < top-1; i++) {
                output += stack[i] + ",";
            }
        }
        return output;
    }

    public void push(int element) {
        if (top >= stack.length) {
            System.out.println("Overflow");

        } else {
            stack[top - 1] = element;
            top++;
        }
    }

    public int pop() {
        if (top <= 1) {
            System.out.println("Underflow");
            return 0;

        } else {
            int n = stack[top - 2];
            stack[top-2]=0;
            
            top--;
                return n; 
        }
       
            
        }
    public int getSize(){
        for (int i = 0; i< stack.length; i++ ){
            if(stack[i] != 0){
             count++   ;
            }
        }return count;
            
    }
    
    public boolean isEmpty(){
        if(top<1){
            return true;
        } else {
            return false;
        }
    }	
    
    public int getTop(){
        return pop();
    }
    
    }
