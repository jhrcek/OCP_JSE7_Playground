package ocpjse7.processed;

import java.lang.reflect.Constructor;
import ocpjse7.test.DefaultConstr;

public class DefaultConstrTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // When inner class doesn't declare constructor, it's default constructor has THE SAME access modifier as the inner class itself
        Class<?> testClass = Class.forName("ocpjse7.test.DefaultConstr");
        Class<?>[] innerClassesOfTest = testClass.getDeclaredClasses();
        for (Class<?> innerCl : innerClassesOfTest) {
            System.out.println(innerCl);
            Constructor<?> defConstrOfInnerCl = innerCl.getDeclaredConstructor();
            System.out.println("    has constructor : " + defConstrOfInnerCl);
        }

        new DefaultConstr.InnerPublic();

        // The following 3 defalult constructors not accessible  -> compiler error
        //        new DefaultConstr.InnerProtected();
        //        new DefaultConstr.InnerDefault();
        //        new DefaultConstr.InnerPrivate();
    }
}
