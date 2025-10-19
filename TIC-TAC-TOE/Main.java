import java.util.*;
public class Main{
   static String player1;
    static String player2;
    static int n;
    static int turn=0;
    static Scanner sc=new Scanner(System.in);
    static void reset(char ch[][],char car)
    {
        for(char c[]:ch)
        {
            Arrays.fill(c,car);
        }
    }
    static void printboard(char board[][])
    {
        System.out.print("\t");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+i+"        "); 
        }
        System.out.println();
        for(int i=0;i<n+1;i++)
        {
            System.out.print("     ");
            for(int j=0;j<n;j++)
            {
                if(j==n-1)
                System.out.print("+---------+");
                else
                System.out.print("+---------");
                
            }
            if(i<n)
            System.out.print( "\n"+i+"    ");
            for(int j=0;j<n&&i<n;j++)
            {
                if(j==n-1)
                System.out.print("|    "+board[i][j]+"    |");
                else
                System.out.print("|    "+board[i][j]+"    ");
                
            }
            System.out.println();
            
        }
    }
    static boolean isvalid(int x,int y)
    {
        if(x<0||y<0||x>=n||y>=n)
        return false;
        return true;
    }
    static boolean isfilled(char ch[][],int x,int y)
    {
        if(ch[x][y]!=' ')
            return true;
        return false;
    }
    static void playgame(char [][]board,String s1,String s2)
    {
        int idxr=0,idxc=0;
        if(turn%2==0)
        System.out.println(s1+"  turn's can play now");
        else
        System.out.println(s2+"  turn's can play now");
        System.out.println(" enter the postition to fill board (X or O):");
        idxr=sc.nextInt();
        idxc=sc.nextInt();
        if(isvalid(idxr,idxc))
        {
            if(isfilled(board,idxr,idxc))
            {
                System.out.println(" already placed choose another locations");
                playgame(board, s1, s2);
            }
            else
            {
                if(turn%2==0)
                {
                    board[idxr][idxc]='X';
                    turn++;
                }
                else
                {
                    board[idxr][idxc]='O';
                    turn++;
                }
            }
        }
        else
        {
            System.out.println("enter valid index");
            playgame(board, s1, s2);
        }
    }
    static boolean completed(char ch[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ch[i][j]==' ')
                    return false;
            }
        }
        return true;
    }
    static boolean win(char ch[][])
    {
        int r=0,c=0;
        for(int i=0;i<n;i++)
        {
            r=0;c=0;
            for(int j=0;j<n;j++)
            {
                if(ch[i][j]=='X')
                    r++;
                if(ch[i][j]=='O')
                    c++;
            }
            if(r==3||c==3)
            return true;
        }
        for(int i=0;i<n;i++)
        {
            r=0;c=0;
            for(int j=0;j<n;j++)
            {
                if(ch[j][i]=='X')
                    r++;
                if(ch[j][i]=='O')
                    c++;
            }
            if(r==n||c==n)
            return true;
        }
        for(int i=0;i<n;i++)
        {
            r=0;c=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    if(ch[i][j]=='X')
                        r++;
                    if(ch[i][j]=='O')
                        c++;
                }
            }
            if(r==n||c==n)
            return true;
        }
        for(int i=0;i<n;i++)
        {
            r=0;c=0;
            for(int j=0;j<n;j++)
            {
                if(i==n-j-1)
                {
                    if(ch[i][j]=='X')
                        r++;
                    if(ch[i][j]=='O')
                        c++;
                }
            }
            if(r==n||c==n)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("enter the grid size");
        n=sc.nextInt();
        char board[][]=new char[n][n];
        reset(board,' ');
        System.out.println("enter enter player1 name:");
        player1=sc.next();
        System.out.println("enter enter player2 name:");
        player2=sc.next();
        System.out.println("Game Started between  "+player1+" and "+player2);
        boolean found=true;
        printboard(board);
        while(!completed(board))
        {
            playgame(board,player1,player2);
            printboard(board);
            if(win(board))
            {
                if(turn%2!=0)
                    System.out.println(player1+" winner congratualtions ");
                else
                    System.out.println(player2+" winner congratualtions ");
                found=false;
                break ;
            }
        }
        printboard(board);
        if(found)
        {
            System.out.println("Match is DRAW@");
        }
        sc.close();
    }
}