import java.util.*;
import java.io.*;

public class TestDVD {
  ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
  public static void main(String[] args) {
    new TestDVD().go();
  }

  public void go() {
    populateList();
    System.out.println(dvdlist);
    Collections.sort(dvdlist);
    System.out.println(dvdlist);
    
    GenreSort gs = new GenreSort();
    Collections.sort(dvdlist, gs);
    System.out.println(dvdlist); 
  }

  public void populateList() {
    DVDInfo d1 = new DVDInfo("Take the ball, pass the ball", "Sport", "Eric Abidal");
    DVDInfo d2 = new DVDInfo("Ash is purest white", "Criminal", "Pham Lieu");
    DVDInfo d3 = new DVDInfo("Mortal Engines", "Adventure", "Hera Hilmar");
    dvdlist.add(d1);
    dvdlist.add(d2);
    dvdlist.add(d3); 
  }
}


class GenreSort implements Comparator<DVDInfo> {
  public int compare(DVDInfo one, DVDInfo two) {
    return one.getGenre().compareTo(two.getGenre());
  }
}

