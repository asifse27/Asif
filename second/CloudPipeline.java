//package second;

class CloudPipeline extends DataProcessingPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("Connecting to cloud...");
        // Simulate connection logic
        connected = true;
        return connected;
    }

    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("Transforming data for cloud...");
        // Simulate transformation logic
        transformed = true;
        return transformed;
    }

    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("Storing data in cloud...");
        // Simulate storage logic
        stored = true;
        return stored;
    }
}
