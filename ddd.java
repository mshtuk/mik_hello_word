public class ddd{
    static final String COMMA = ",";

    public static void main(String[] args) {

            String str = "876 54-321   CHANGE";
         str = str.replaceAll("\\D+",""); 
         System.out.println(">"+str+"<");
         str = "876 54-321   ";
         str = str.replaceAll("[\\D&&\\W]", "");
          System.out.println(">"+str+"<");
        str = "876 54-321   CHANGE";
        str = str.replaceAll("\\D","");
        System.out.println(">"+str+"<");
        str = "876 54-321   CHANGE";
             str = str.substring(0,str.indexOf(' ') );
             System.out.println(">"+str+"<");
           str = "12345678901234567890";
           str = str.substring(0,17);
         System.out.println(">"+str+"<");

if ( null != args && args.length > 0 ) {
       str = args[0];
System.out.println(">"+str+"<");
 str = str.replaceAll("\"", "'");
System.out.println(">"+str+"<");
if (str.length() > 17)
str = str.substring(str.length() - 17);
System.out.println(">"+str+"<");
       
            } 
if ( null != args && args.length > 1 ) {
       str = args[1];
System.out.println(">"+str+"<");
 str = str.replaceAll("_", "");
System.out.println(">"+str+"<");

            }


    }
}
