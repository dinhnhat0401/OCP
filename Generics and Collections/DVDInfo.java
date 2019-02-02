class DVDInfo implements Comparable<DVDInfo> {
  String title;
  String genre;
  String leadActor;
  
  DVDInfo(String t, String g, String a) {
    title = t;
    genre = g;
    leadActor = a;
  }

  public String toString() {
    return "Title: " + title + "\n" + "Genre: " + genre + "\n" +"Lead Actor: " + leadActor + "\n";
  }

  public int compareTo(DVDInfo d) {
    return title.compareTo(d.getTitle());
  }

  public String getTitle() {
    return title;
  }
  
  public String getGenre() {
    return genre;
  }

  
}

