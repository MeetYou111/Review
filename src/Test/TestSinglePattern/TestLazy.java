package Test.TestSinglePattern;

/**
 * @author 小潘
 * @create 2020-06-08-18:58
 */
public class TestLazy {
    public static void main(String[] args) {
        /*lpDemo s1 = lpDemo.getInstance();
        lpDemo s2 = lpDemo.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);*/

        //下面演示线程安全问题
       /* Callable<lpDemo> c = new Callable<lpDemo>() {
            @Override
            public lpDemo call() throws Exception {
                return lpDemo.getInstance();
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<lpDemo> f1 = es.submit(c);
        Future<lpDemo> f2 = es.submit(c);

        try {
            lpDemo s1 = f1.get();
            lpDemo s2 = f2.get();

            System.out.println(s1 == s2);
            System.out.println(s1);
            System.out.println(s2);

            es.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/

        //好用的 静态内部类形式测试
        /*lpDemo2 lpDemo2 = singlePattern.lazyPattern.lpDemo2.getInstance();
        lpDemo2 lpDemo22 = singlePattern.lazyPattern.lpDemo2.getInstance();
        System.out.println(lpDemo2 == lpDemo22);
        System.out.println(lpDemo2);
        System.out.println(lpDemo22);*/

    }
}
