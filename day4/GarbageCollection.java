public class GarbageCollection {
    GarbageCollection(String name) {
        this.name = name;
    }
    String name;

    // finalize() mehtod will be called before object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected for object: " + name);
    }

    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection("Object1");
        GarbageCollection obj2 = new GarbageCollection("Object2");

        // make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // request JVM or run Garbage Collector
        System.out.println("Requesting Garbage Collection...");
        System.gc();

        // pause to let gc complete (not guaranteed)
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Program");
    }
}
