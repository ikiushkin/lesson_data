package patterns.create;

public class ProxyPattern {
    interface Service {
        void operation();
    }

    static class RealService implements Service {
        public void operation() {
            System.out.println("Performing operation in RealService");
        }
    }

    static class ProxyService implements Service {
        private final RealService realService;

        public ProxyService() {
            this.realService = new RealService();
        }

        public void operation() {
            System.out.println("Proxy: Logging before operation");
            realService.operation();
            System.out.println("Proxy: Logging after operation");
        }
    }

    public static void main(String[] args) {
        Service service = new ProxyService();
        service.operation();
    }
}