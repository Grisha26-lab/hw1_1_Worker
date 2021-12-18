public class Worker {

    private final OnTaskDoneListener callback;
    private  final OnTaskErrorListener errorListener;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i!=33)
            callback.onDone("Task " + i + " Done");
            else 
            errorListener.onError(i+" Завершилось с ошибкой");
        }
    }
}
