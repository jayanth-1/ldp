package singleton;

public class Demo {
    public static void main(String[] args) {

        System.out.println(DbDriverInstance.getDbDriverInstance().hashCode());
        System.out.println(DbDriverInstance.getDbDriverInstance().hashCode());

//        can't create another instance because of private constructor
//        DbDriverInstance dbDriverInstance = new DbDriverInstance();
    }
}
