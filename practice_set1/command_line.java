public class command_line
{
     public static void main(String[] args)
     {

        if(args.length>2)
        {
            System.out.println("Please provide two arguments.");
            return;
        }

        else
            {
int args0 = Integer.parseInt(args[0]);
int args1 = Integer.parseInt(args[1]);

System.out.println("This is the command line program has argument:"+ args[0]+"and"+args[1]);

int sum = args0 + args1;
System.out.println("The sum of the two arguments is: " + sum);

        }
        

    }
}