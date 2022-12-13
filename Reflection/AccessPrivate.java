package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivate {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Foo");
            Object foo = c.newInstance();
            Method m = c.getDeclaredMethod("message", null);

            m.setAccessible(true);
            m.invoke(foo, null);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        

    }
}

class Foo {
    private void message() {
        System.out.println("Hello Reflection");
    }
}
