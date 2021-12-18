public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener taskDoneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(taskDoneListener,errorListener);
        worker.start();


    }
}
