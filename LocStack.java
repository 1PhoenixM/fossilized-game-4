package fossilized;

public class LocStack {

    //
    // Public
    //
    public LocStack() {
        init();
    }

    public void push(Locale loc) throws Exception {
        // Check for stack overflow.
        if (topPtr > 0) {
            topPtr = topPtr - 1;
            arr[topPtr] = loc;
        } else {
             Exception overflow = new Exception("Stack Overflow");
            throw overflow;
        }
    }
    
    public Locale pop() throws Exception {
        Locale retVal = null;
        // Check for stack underflow.
        if (topPtr < CAPACITY) {
            retVal = arr[topPtr];
            topPtr = topPtr + 1;
        } else {
            Exception underflow = new Exception("Stack Underflow");
            throw underflow;
        }
        return retVal;
    }

    public boolean isEmpty() {
        boolean retVal = false;
        if (topPtr == CAPACITY) {
            retVal = true;
        }
        return retVal;
    }

    //
    // Private
    //
    private final int CAPACITY = 1000;
    private Locale[] arr = new Locale[CAPACITY];
    private int topPtr = 0;

    private void init() {
       for (int i = 0; i < CAPACITY; i++) {
           arr[i] = null;
       }
       topPtr = CAPACITY;
    }


}