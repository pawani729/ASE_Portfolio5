package FP;

import java.util.Arrays;
import java.util.List;

public class FIFA09 {
  public static void main(String[] args) {
    List<FIFAData> table = Arrays.asList(
        new FIFAData(1,"L. Messi","FC Barcelona",84,95,70,86,97,93,96,91,95,85,68,72,59,94,94,94,33),
        new FIFAData(2,"Cristiano Ronaldo","Juventus",84,94,89,87,88,81,94,89,70,95,95,88,79,93,95,82,28),
        new FIFAData(3,"Neymar Jr","Paris Saint-Germain",79,87,62,84,96,88,95,94,84,80,61,81,49,82,89,87,27),
        new FIFAData(4,"De Gea","Manchester United",17,13,21,13,18,21,42,57,43,31,67,43,64,12,12,68,15),
        new FIFAData(5,"K. De Bruyne","Manchester City",93,82,55,82,86,85,91,78,77,91,63,90,75,91,87,94,68),
        new FIFAData(6,"E. Hazard","Chelsea",81,84,61,80,95,83,94,94,94,82,56,83,66,80,87,89,34),
        new FIFAData(7,"L. Modrić","Real Madrid",86,72,55,76,90,85,93,80,94,79,68,89,58,82,79,92,60),
        new FIFAData(8,"L. Suárez", "FC Barcelona",77,93,77,88,87,86,90,86,83,86,69,90,83,85,92,84,62),
        new FIFAData(9,"Sergio Ramos","Real Madrid",66,60,91,66,63,74,84,76,66,79,93,84,83,59,60,63,87),
        new FIFAData(10,"J. Oblak","Atlético Madrid",13,11,15,13,12,13,16,43,49,22,76,41,78,12,11,70,27),
        new FIFAData(11,"R. Lewandowski","FC Bayern München",62,1,85,89,85,77,89,77,78,88,84,78,84,84,91,77,34),
        new FIFAData(12,"T. Kroos","Real Madrid",88,76,54,82,81,86,90,64,71,87,30,75,73,92,79,86,72),
        new FIFAData(13,"D. Godín","Atlético Madrid",55,42,92,47,53,49,76,68,54,67,91,66,88,43,48,52,90),
        new FIFAData(15,"David Silva","Manchester City",84,76,54,82,89,82,94,70,90,72,64,78,52,75,89,92,59),
        new FIFAData(16,"N. Kanté","Chelsea",68,65,54,56,79,49,80,82,92,71,77,96,76,69,71,79,90),
        new FIFAData(17,"P. Dybala","Juventus",82,84,68,88,92,88,92,87,85,82,75,80,65,88,84,87,23),
        new FIFAData(18,"H. Kane","Tottenham Hotspur",75,94,85,84,80,78,84,68,71,88,78,89,84,85,93,80,56),
        new FIFAData(19,"A. Griezmann","Atlético Madrid",82,90,84,87,88,84,90,88,80,80,90,83,62,82,91,83,59),
        new FIFAData(20,"M. ter Stegen","FC Barcelona",15,14,11,14,17,18,18,38,43,22,79,35,79,10,11,69,25));  
  
  
  
    System.out.println("Clubs starting with F");
    table.stream().filter(fifa -> fifa.getClub().contains("F")).forEach(System.out::println);
  }

}
