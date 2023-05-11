package singleton;

public class DbDriverInstance {

    private static volatile DbDriverInstance dbDriverInstance = null;
    private String url, userName, password;
    private DbDriverInstance(){}

    private void setDbDriverConfig(){
        this.url = "http://localhost:5432/db_name";
        this.userName = "postgres";
        this.password = "postgres";
    }
    public static DbDriverInstance getDbDriverInstance(){

        if(dbDriverInstance == null){
            synchronized (DbDriverInstance.class){
                if(dbDriverInstance == null){
                    dbDriverInstance = new DbDriverInstance();
                    dbDriverInstance.setDbDriverConfig();
                }
            }
        }
        return dbDriverInstance;
    }
}
