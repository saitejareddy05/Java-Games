import java.util.*;
public class Main {
    static void fill(char arr[])
    {

        char ch='A';
        for(int i=0;i<arr.length/2;i++)
        {
            arr[i]=ch;
            arr[arr.length-i-1]=ch;
            ch++;
        }
        return ;
    }
    static void print(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            System.out.print("     "+i+"    ");
        }
        System.out.println();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print("|    "+ch[i]+"    ");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of cards:");
        char ans[]=new char[sc.nextInt()];
        char dup[]=new char[ans.length];
        Arrays.fill(dup,' ');
        fill(ans);
        int found=0;
        while(found!=ans.length/2)
        {
            System.out.println();
            print(dup);
            System.out.println("enter the first card index value from 0 to "+ans.length);
            int i=sc.nextInt();
            System.out.println("enter the second card index value from 0 to "+ans.length);
            int j=sc.nextInt();
            if(i==j)
            {
                System.out.println("you enter same indices enter again");
            }
            else if(ans[i]==ans[j])
            {
                dup[i]=dup[j]=ans[i];
                found++;
                System.out.printf("\n%d Pairs are found\n",found);
            }
            else
            {
                System.out.println("Try Again ");
            }
        }
        System.out.println("Congartualtions Well done @");
    }
}
