public class Java03_Bitwise{
    public static void main(String[] args){
        int a = 15;
        int b = 16;
        int var = 3;
// BITWISE AND
        System.out.println(a&b);
// BITWISE OR
        System.out.println(a|b);
// BITWISE NOT
        System.out.println(~a);
// LEFT SHIFT OPERATOR: left shifting is equivalent to multiplication by 2^(right operand)
        System.out.println(var<<1);
// RIGTH SHIFT OPERATOR: right shifting is equivalent to division by 2^(right operand)
        System.out.println(var>>1);
        System.out.println(32>>4);
// BITWISE XOR OPERATOR
        System.out.println(a^b);
// ADDITION USING BITWISE OPERATOR
        int carry;
        while(b!=0){
            carry = a&b;
            a = a^b;
            b = carry <<1;
        }
        System.out.println(a);
// SUBTRACTION USING BITWISE OPERATOR
        int borrow;
        int x = 32; 
        int y = 10;
        while(y!=0){
            borrow = (~x) &y;
            x = x^y;
            y = borrow << 1;
        }
        System.out.println(x);
    }
}