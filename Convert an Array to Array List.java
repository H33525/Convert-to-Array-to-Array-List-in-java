import java.io.*;
class ConvertArrayToArrayList 
{
    public static void main(String args[]) 
{
        
            /* Array Declaration and initialization*/
     String array[]={"AA", "BB", "CC", "DD"};

     /*ArrayList declaration*/
     ArrayList<String> arraylist= new ArrayList<String>();

     /*Conversion*/
     Collections.addAll(arraylist, array);

     /*Adding new elements to the converted List*/
     arraylist.add("Boston");
     arraylist.add("Dallas");

     /*Display array list*/
     for (String str: arraylist)
     {
   System.out.println(str);
     }
  }
}