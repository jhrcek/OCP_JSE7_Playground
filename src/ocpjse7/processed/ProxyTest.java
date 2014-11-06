package ocpjse7.processed;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class<?>[]{MyInterface.class},
                new MyLoggingInvocationHandler<>(new MyClass()));

        proxy.myMethod();
    }

    static class MyLoggingInvocationHandler<T> implements InvocationHandler {

        private T inst;

        public MyLoggingInvocationHandler(T inst) {
            this.inst = inst;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("inside proxy!");
            return method.invoke(inst, args);
        }
    }
}

class MyClass implements MyInterface {

    @Override
    public void myMethod() {
        System.out.println("My method called!");
    }
}

interface MyInterface {

    void myMethod();
}
