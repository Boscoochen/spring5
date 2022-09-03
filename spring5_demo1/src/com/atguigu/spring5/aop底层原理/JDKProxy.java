package com.atguigu.spring5.aop底层原理;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        // 接口=实现类的代理对象，
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(dao.getClass().getName());
        int result = dao.add(1, 2);
        String abc = dao.update("abc");
        System.out.println("result:" + result + "::" + abc);


        //接口向下转型 例子
//        A a = (A) new B();
//        a.test();
    }
}

class UserDaoProxy implements InvocationHandler {
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法之前执行。。。" + method.getName() + " :传递的参数。。。" + Arrays.toString(args));
        Object res = method.invoke(obj, args);
        System.out.println("方法之后执行。。。" + obj);
        return res;
    }
}

interface A {
    public void test();
}

class B implements A{

    @Override
    public void test() {
        System.out.println("hello world");
    }
}
