import java.util.concurrent.Flow;

public class ReactiveExample {


    public static void main(String[] args) {
        Flow.Publisher<Integer> publisher = new Flow.Publisher<Integer>() {
            public void subscribe(Flow.Subscriber<? super Integer> subscriber) {
                subscriber.onSubscribe(new Flow.Subscription() {
                    public void request(long n) {
                        subscriber.onNext(1);
                        subscriber.onComplete();
                    }

                    public void cancel() {
                        // Handle cancellation
                    }
                });
            }
        };

        Flow.Subscriber<Integer> subscriber = new Flow.Subscriber<Integer>() {
            private Flow.Subscription subscription;

            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            public void onNext(Integer item) {
                System.out.println("Received: " + item);
            }

            public void onError(Throwable throwable) {
                // Handle errors
            }

            public void onComplete() {
                System.out.println("Processing complete.");
            }
        };

        publisher.subscribe(subscriber);
    }
}
