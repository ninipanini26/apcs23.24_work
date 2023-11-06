public class countZNames{
    
    public static void testZNames(String names[], int expected ){
        
        int result = countZNames(names);
         System.out.println("expected " +expected+ " result: " + result);
           if (result == expected)
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Boohoo.");
        
    }
    
    public static int countZNames(String names[]){
        int count = 0;
        for(int i = 0; i < names.length; i++){
            
            if(names[i].substring(0,1).equals("Z") || names[i].substring(0,1).equals("z")){
                count+=names[i].length(); 
            }
        }return count;
    
    } public static void main (String [] args){
        
        String names1[] = {"Zorro", "zero", "zippy"};
        testZNames(names1, 14);
        
        String names2[] = {"Hi", "Bye", "Zip"};
        testZNames(names2, 3);
        
    }
    
}