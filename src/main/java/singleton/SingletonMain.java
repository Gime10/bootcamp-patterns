package singleton;

import java.sql.SQLException;

public class SingletonMain {

    public static void main(String[]arg){
        MongoDBClient mongoDBClient = MongoDBClient.getClient();
        System.out.println(mongoDBClient.getData());
        MongoDBClient mongoDBClient2 = MongoDBClient.getClient();
        System.out.println(mongoDBClient2.getData());
        MongoDBClient mongoDBClient3 = MongoDBClient.getClient();
        System.out.println(mongoDBClient3.getData());

        try {
            MySQLClient mySQLClient1 = MySQLClient.getInstance();
            System.out.println(mySQLClient1.getAllUsers().toString());
            MySQLClient mySQLClient2 = MySQLClient.getInstance();
            System.out.println(mySQLClient2.getAllUsers().toString());
            MySQLClient mySQLClient3 = MySQLClient.getInstance();
            System.out.println(mySQLClient3.getAllUsers().toString());
        } catch (SQLException sqlException) {
            System.out.println("Error Message: " + sqlException.getMessage());
            System.out.println("SQLState: " + sqlException.getSQLState());
            System.out.println("Error Code: " + sqlException.getErrorCode());
        }
    }
}
