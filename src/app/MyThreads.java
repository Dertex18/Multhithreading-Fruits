package app;

class MyThread extends  {

    dataHandler;

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    public  run() {
        dataHandler.getOutput();
    }
}

