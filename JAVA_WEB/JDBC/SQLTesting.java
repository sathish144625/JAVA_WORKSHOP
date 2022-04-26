import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTesting{


 // You need to close the resultSet
     

    public static void main(String [] args) throws Exception
    {
        try {
            // This will load the MySQL driver, each DB has its own driver

            Class.forName("com.mysql.cj.jdbc.Driver");
                        // Setup the connection with the DB
                        Connection  connect = DriverManager
                                .getConnection("jdbc:mysql://localhost/dept?"
                                        + "user=root&password=");

                        // Statements allow to issue SQL queries to the database
                        Statement statement = connect.createStatement();
                        // Result set get the result of the SQL query
                        ResultSet resultSet = statement.executeQuery("select * from employe");
                        while (resultSet.next()) {
                            // It is possible to get the columns via name
                            // also possible to get the columns via the column number
                            // which starts at 1
                            // e.g. resultSet.getSTring(2);
                           ResultSet resultSet1 = statement.executeQuery("select eid from employe");
                            
                           System.out.println("EMPLOYEE ID  :");
                           while (resultSet1.next())
                            {
                                String eid = resultSet1.getString("eid");
                                System.out.println(eid);
                            }
                         ResultSet resultSet2 = statement.executeQuery("select firstname from employe");
                            System.out.println("FIRSTNAME  :");
                             while (resultSet2.next())
                            {
                                String fname = resultSet2.getString("firstname");
                                System.out.println(fname);
                            }

                         ResultSet resultSet3 = statement.executeQuery("select lastname from employe");

                            
                            System.out.println("LASTNAME  :");
                             while (resultSet3.next())
                            {
                                String lname = resultSet3.getString("lastname");
                                System.out.println(lname);
                            }
                         ResultSet resultSet4 = statement.executeQuery("select did from employe");
                            System.out.println("DEPARTMENTS ID  :");
                             while (resultSet4.next())
                            {
                                String did = resultSet4.getString("did");
                                System.out.println(did);
                            }

                            
                            
                            
                      
                           
                    }



                    } catch (Exception e) {
                        throw e;
                    } finally {
                       
                    }

                }
    }


