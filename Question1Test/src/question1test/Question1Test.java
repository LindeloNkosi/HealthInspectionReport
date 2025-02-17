package question1test;

/**
 *
 * @author Lindelo Desiree Nkosi
 */
public class Question1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Two-dimensional arrays
        int[][] inspections = {{4, 8, 6},
                               {5, 4, 2},
                               {4, 2, 8}}; 
        
        //printing the table report
        
        System.out.println("***********************************************");
        System.out.println("HEALTH INSPECTION REPORT");
        System.out.println("***********************************************");
        
       
        System.out.print("\t");
        System.out.print("\tJAN");
        System.out.print("\tFEB");
        System.out.print("\tMAR");
        System.out.println("\tAVG");
        
         
        
         //first row, printing months next to the table
        
          for(int i = 0; i <  inspections.length; i++){
           System.out.println();
           switch(i){
               case 0 : System.out.print("HOSPITAL 1-->");break;
               case 1 : System.out.print("HOSPITAL 2--> ");break;
               case 2 : System.out.print("HOSPITAL 3-->");break;
              
               
           }
           for(int j = 0; j < inspections [i].length; j++){
               System.out.print("\t" +  inspections[i][j] );
               
               
               
           }
              System.out.println();
        }
          
          System.out.println("***********************************************");
          System.out.println("MONTHLY TOTALS");
          System.out.println("***********************************************");
          
             //finding the sum each row on the array
        double rows,columns,sumRows;
           //calculate sum of each row of given matrix
           rows = inspections.length; 
       columns = inspections[0].length;
       for(int i = 0; i<rows; i++ ){
           sumRows = 0;
           for(int j = 0; j < columns; j++){
             sumRows = sumRows + inspections[i][j];  
           }
           System.out.println("HOSPITAL " + ( i + 1 )  +":"+ " \t" +sumRows);
       }
       
       //fing the average for which row
      
        System.out.println();
       
        System.out.println("AVG");
          
           rows = inspections.length; 
       columns = inspections[0].length;
       for(int i = 0; i<rows; i++ ){
           sumRows = 0;
           for(int j = 0; j < columns; j++){
             sumRows = sumRows + inspections[i][j];  
           }
           System.out.println(sumRows/inspections[i].length);
       }
        System.out.println("***********************************************");
       
    }
    
}
