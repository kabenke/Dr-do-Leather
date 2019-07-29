import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
public class GGCoding
{
    public static void main( String[] args )
    {


        File file = new File(args[0]);
        FileReader fr = null;
        String s = "";

        try{
             fr = new FileReader(file);
             int ch ;
             while ((ch = fr.read()) >10 ) { //Backspace sind nicht erlaub
               s +=(char)ch;
             }
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }

        CharacterSearchTree hal = new CharacterSearchTree();

        for (int i= 0;i<s.length() ;i++ ) {
          hal.add(s.charAt(i));
        }
         Object obj = 'n';

        System.out.println(hal.onLevel(obj,hal.heigth()));System.out.println();


        // System.out.println("Preorder : ");hal.show2();
        // System.out.println("Postorder : ");hal.show1();
        // System.out.println(hal.heigth());
        // String codeOfHal = "";
        // for ( int i = 0; i < s.length() ; i++ )
        // {
        //     codeOfHal += hal.getCode( s.charAt( i ) );
        // }
        // System.out.println( "bit code: " );
        // System.out.println( "--------------------------" );
        // System.out.println( codeOfHal );
        // System.out.println();
        // System.out.println( "input chars: " + s.length() );
        // System.out.println( "input bits: " + s.length() * 8 );
        // System.out.println( "output bits: " + codeOfHal.length() );
        }

    // }
}

