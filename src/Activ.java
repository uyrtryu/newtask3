import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;

public abstract class Activ implements ActionListener {


    public static String[] activ(String path, String extention) {


        List<String> list = new ArrayList<>();

        File file1 = new File(path);
        Queue queue = new LinkedList();


        queue.add(file1.getAbsoluteFile());

        while (!queue.isEmpty()) {
            File file = (File) queue.remove();
            if (file.isFile() && file.getName().endsWith(extention)) {
                list.add(file.getName());
            } else if (file.isDirectory()) {
                for (File kol : file.listFiles()) {
                    queue.add(kol);
                }
            }
        }
        String[] ansver = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ansver[i] = list.get(i);
        }

/*2 my*/
//        MyQueue myQueue = new MyQueue();
//        myQueue.add((file1.getAbsoluteFile()));
//
//        while (!MyQueue.isEmpty()) {
//            File file = new File(String.valueOf(myQueue.pop1()));
//            if (file.isFile() && file.getName().endsWith(extention)) {
//                list.add(file.getName());
//            } else if (file.isDirectory()) {
//                for (File kol : file.listFiles()) {
//                    myQueue.add((kol));
//                }
//            }
//        }
//        String[] ansver = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            ansver[i] = list.get(i);
//        }



        return ansver;




    }


}



