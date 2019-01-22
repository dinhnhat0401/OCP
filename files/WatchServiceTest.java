import java.nio.file.WatchService;
import java.nio.file.WatchKey;
import java.nio.file.Path;
import java.lang.InterruptedException;
import java.nio.file.Paths;
import java.nio.file.FileSystems;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.io.IOException;

class WatchServiceTest {
  public static void main(String [] args) {
    Path dir = Paths.get("dir");
    try {
      WatchService watcher = FileSystems.getDefault().newWatchService();
      dir.register(watcher, ENTRY_DELETE);
      while (true) {
        WatchKey key;
        try {
          key = watcher.take();
        } catch (InterruptedException x) {
          return;
        }

        for (WatchEvent<?> event : key.pollEvents()) {
          WatchEvent.Kind<?> kind = event.kind();
          System.out.println(kind.name());
          System.out.println(kind.type());
          System.out.println(event.context());
          String name = event.context().toString();
          if (name.equals("directoryToDelete")) {
            System.out.format("Directory deleted, now we can proceed");
            return;
          }
        }
      key.reset();
      }
    } catch (IOException e) {
       e.printStackTrace(); 
    }
  } 
}

