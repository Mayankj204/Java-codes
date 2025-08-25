// import java.util.Stack;

// public class infix 
//     public static void main(String[] args) {
//         String st = "3*(2+4)/3";   // 6 +4/3   6+1 7
//         Stack<Integer> val = new Stack<>();
//         Stack<Character> op = new Stack<>();
//         for (int i = 0; i < st.length(); i++) {
//             char c = st.charAt(i);
//             int ascii = (int) c;
//             if (ascii >= 48 && ascii <= 57)
//                 val.push(ascii - 48);
//             else if (op.isEmpty() ||c=='(' )
//                 op.push(c);
//              else if(c==')') {
//                 while(op.peek()!='(' && !op.isEmpty()){
//                     int val2=val.pop();
//                     int val1=val.pop();
//                      if (op.peek() == '+')
//                         val.push(val1 + val2);
//                     if (op.peek() == '-')
//                         val.push(val1 - val2);
//                     if (op.peek() == '/')
//                         val.push(val1 / val2);
//                     if (op.peek() == '*')
//                         val.push(val1 * val2);
//                     op.pop();
//                 }
//                 if(!op.isEmpty())
//                 op.pop();
//              }
//             else {
//                 if (c == '+' || c == '-') {
//                     int val2 = val.pop();
//                     int val1 = val.pop();
//                     if (op.peek() == '+')
//                         val.push(val1 + val2);
//                     if (op.peek() == '-')
//                         val.push(val1 - val2);
//                     if (op.peek() == '/')
//                         val.push(val1 / val2);
//                     if (op.peek() == '*')
//                         val.push(val1 * val2);
//                     op.pop();
//                     op.push(c);
//                 }

//                 if (c == '*' || c == '/') {
//                     if (op.peek() == '*' || op.peek() == '/') {
//                         int val2 = val.pop();
//                         int val1 = val.pop();
//                         if (op.peek() == '*')
//                             val.push(val1 * val2);
//                         if (op.peek() == '/')
//                             val.push(val1 / val2);
//                             op.pop();
//                             op.push(c);

//                     }
//                     else op.push(c);
//                 }
//             }
//         }
//         while(val.size()>1){
//             int val2 = val.pop();
//             int val1 = val.pop();
//              if (op.peek() == '+')
//                         val.push(val1 + val2);
//             if (op.peek() == '-')
//                         val.push(val1 - val2);
//             if (op.peek() == '/')
//                         val.push(val1 / val2);
//             if (op.peek() == '*')
//                         val.push(val1 * val2);

//         op.pop();

//         }
//         System.out.println(val.peek());

//     }
// }