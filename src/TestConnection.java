import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import my_package.*;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;

public class TestConnection {
    // The recommended format of a connection URL is:
    // "jdbc:oracle:thin:@<DATABASE_NAME_LOWERCASE>_tp?TNS_ADMIN=<PATH_TO_WALLET>"
    // where
    // <DATABASE_NAME_LOWERCASE> is your database name in lowercase
    // and
    // <PATH_TO_WALLET> is the path to the connection wallet on your machine.
    // NOTE: on a Mac, there's no C: drive...
    final static String DB_URL = "jdbc:oracle:thin:@finalProject_tp?TNS_ADMIN=C:/Users/coolr/Downloads/Wallet_finalProject";
    final static String DB_USER = "ADMIN";
    final static String DB_PASSWORD = "CS174adbpassword";

    // This method creates a database connection using
    // oracle.jdbc.pool.OracleDataSource.
    public static void main(String args[]) throws SQLException {
        Properties info = new Properties();

        System.out.println("Initializing connection properties...");
        info.put(OracleConnection.CONNECTION_PROPERTY_USER_NAME, DB_USER);
        info.put(OracleConnection.CONNECTION_PROPERTY_PASSWORD, DB_PASSWORD);
        info.put(OracleConnection.CONNECTION_PROPERTY_DEFAULT_ROW_PREFETCH, "20");

        System.out.println("Creating OracleDataSource...");
        OracleDataSource ods = new OracleDataSource();

        System.out.println("Setting connection properties...");
        ods.setURL(DB_URL);
        ods.setConnectionProperties(info);

        // With AutoCloseable, the connection is closed automatically
        try (OracleConnection connection = (OracleConnection) ods.getConnection()) {
            System.out.println("Connection established!");
            // Get JDBC driver name and version
            DatabaseMetaData dbmd = connection.getMetaData();
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            // Print some connection properties
            System.out.println(
                "Default Row Prefetch Value: " + connection.getDefaultRowPrefetch()
            );
            System.out.println("Database username: " + connection.getUserName());
            System.out.println();
            // Perform some database operations

            
            // insertTA(connection);
            // printInstructors(connection);

            //==============================================================
            //                  LOGIN AND REGISTER
            // =============================================================
            Util.printSigninMsg();

            switch (Util.getSigninOption()) {
                case "Register":
                    String name = Util.getInput("Enter name:");
                    String state = Util.getInput("Enter state:");
                    String phoneNo = Util.getInput("Enter phone number:");
                    String email = Util.getInput("Enter email:");
                    String taxId = Util.getInput("Enter Tax ID:");
                    String username = Util.getInput("Choose username:");
                    while (!validateUsername(username)) {
                        username = Util.getInput("username already taken:");
                    }
                    String password = Util.getInput("Choose password");

                    CustomerProfile newCustomerProfile = new CustomerProfile(name, state, phoneNo, email, taxId, username, password);
                    registerNewCustomer(connection, newCustomerProfile);

                    break;
                case "Login":

                    break;
                default:
                    break;
            }

            // ==================================================================

            // ==================================================================

        } catch (Exception e) {
            System.out.println("CONNECTION ERROR:");
            System.out.println(e);
        }
    }

    // TODO: fix this
    public static void registerNewCustomer(Connection connection, CustomerProfile c) {
        System.out.println("Registering " + c.toString());
        
        
        try (Statement statement = connection.createStatement()) {
            try (
                ResultSet resultSet = statement.executeQuery(
                    "INSERT INTO CUSTOMER_PROFILES VALUES (3, 'Momin Haider', 'TA')"
                )
            ) {}
        } catch (Exception e) {
            System.out.println("ERROR: insertion failed.");
            System.out.println(e);
        }
    }

    // Inserts another TA into the Instructors table.
    public static void insertTA(Connection connection) throws SQLException {
        System.out.println("Preparing to insert TA into Instructors table...");
        // Statement and ResultSet are AutoCloseable and closed automatically. 
        try (Statement statement = connection.createStatement()) {
            try (
                ResultSet resultSet = statement.executeQuery(
                    "INSERT INTO INSTRUCTORS VALUES (3, 'Momin Haider', 'TA')"
                )
            ) {}
        } catch (Exception e) {
            System.out.println("ERROR: insertion failed.");
            System.out.println(e);
        }
    }

    // Displays data from Instructors table.
    public static void printInstructors(Connection connection) throws SQLException {
        // Statement and ResultSet are AutoCloseable and closed automatically. 
        try (Statement statement = connection.createStatement()) {
            try (
                ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM INSTRUCTORS"
                )
            ) {
                System.out.println("INSTRUCTORS:");
                System.out.println("I_ID\tI_NAME\t\tI_ROLE");
                while (resultSet.next()) {
                    System.out.println(
                        resultSet.getString("I_ID") + "\t"
                        + resultSet.getString("I_NAME") + "\t"
                        + resultSet.getString("I_ROLE")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: selection failed.");
            System.out.println(e);
        }
    }

    private static boolean validateUsername(String username) {
        return true;
    }

    // TODO: fix this
    // Load the initial data into the database
    public static void loadInitialData(Connection connection) throws SQLException {
        System.out.println("Loading initial data...");
        // Statement and ResultSet are AutoCloseable and closed automatically. 
        try (Statement statement = connection.createStatement()) {
            try (
                ResultSet resultSet = statement.executeQuery(
                    "INSERT INTO INSTRUCTORS VALUES (3, 'Momin Haider', 'TA')"
                )
            ) {}
        } catch (Exception e) {
            System.out.println("ERROR: insertion failed.");
            System.out.println(e);
        }
    }

}