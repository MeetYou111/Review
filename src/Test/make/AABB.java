package Test.make;

/**
 * @Author: XiaoPan
 * @CreateTime: 2020-09-22 19:35
 */
public class AABB{
    private static AABB ab = null;

    private AABB(){};

    public synchronized static AABB getInstance(){
        if (ab == null) ab = new AABB();

        return ab;
    }
}

