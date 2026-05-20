package app;

import static java.lang.Thread.currentThread;

public class DataHandler {

    String[] fruits = new DataRepository().getData();

    public DataHandler() {
    }

    public void getOutput() {


        synchronized ( this) {
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            for (String fruit : fruits) {
                counter++;
                sb.append(String.format("(%d) %s ",
                        counter, fruit));
            }

            System.out.println(currentThread().getName() + ": " + sb);
        }
    }


}
