package crud;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
class HandlingActionEvent1 implements ActionListener{  
JTextField tf3;
     JCheckBox cb2,cb3,cb4,cb5;  
    JButton b;  
    HandlingActionEvent1()
            {
    JFrame f=new JFrame("ActionListener Example");  
 tf3=new JTextField(10); 
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu submenu=new Menu("Sub Menu");  
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb); 
         JRadioButton r1=new JRadioButton("Yes");    
JRadioButton r2=new JRadioButton("No");     
        cb2=new JCheckBox("Insert Data");     
        cb3=new JCheckBox("Delete Data");  
         cb4=new JCheckBox("Update Data");  
          cb5=new JCheckBox("View Data");   
        b=new JButton("Proceed");     
        b.addActionListener(this);  
        f.add(r1);f.add(r2);f.add(cb2);f.add(cb3);f.add(cb4);f.add(cb5);f.add(b);f.add(tf3);
        String choice[]={"Insert","Delete","Update","View"};        
    JComboBox cb=new JComboBox(choice);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
    f.setSize(400,400);  
    f.setLayout(new FlowLayout(FlowLayout.CENTER,150,10));  
    f.setVisible(true);   
}   
public void actionPerformed(ActionEvent e){  
     try {  
        Main createTableExample = new Main();
        Main updateStatementExample = new Main();
        Main deleteStatementExample = new Main();
       Main selectStatementExample = new Main();     
        if(cb2.isSelected()){  
          createTableExample.insertRecord();
         tf3.setText("Successfull!!!");
        }  
        if(cb3.isSelected()){  
          deleteStatementExample.deleteRecord();
        tf3.setText("Successfull!!!"); 
        }  
         if(cb4.isSelected()){  
           updateStatementExample.updateRecord();
         tf3.setText("Successfull!!!");
         }
          if(cb5.isSelected()){  
           selectStatementExample.selectRecord();
          tf3.setText("Successfull!!!");
         }
         }
   catch(SQLException ex)
      {
        Logger.getLogger(HandlingActionEvent.class.getName()).log(Level.SEVERE, null, ex);
    }
} }  
public class Crud {
    private static final String INSERT_USERS_SQL = "INSERT INTO userregistration"
            + "  (id, name, email, address, password) VALUES "
            + " (?, ?, ?, ?, ?);";
    private static final String UPDATE_USERS_SQL = "update userregistration set name = ? where id = ?;";
    private static final String DELETE_USERS_SQL = "delete from userregistration where id = 5;";
    private static final String QUERY = "select id,name,email,address,password from userregistration where id =?";
    public void deleteRecord() throws SQLException {
        System.out.println(DELETE_USERS_SQL);
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "9808628769");
                Statement statement = connection.createStatement();) {
            int result = statement.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Deleted Successfully");
        } catch (SQLException e) {       
            printSQLException(e);
        }
    }
    public void insertRecord() throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "9808628769");
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "Arjun Shrestha");
            preparedStatement.setString(3, "arjun@gmail.com");
            preparedStatement.setString(4, "Ranitar");
            preparedStatement.setString(5, "password");
            System.out.println("Data Inserted Successfully");
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
public void updateRecord() throws SQLException {
            
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "9808628769");        
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, "Arman Shrestha");
            preparedStatement.setInt(2, 1);        
            preparedStatement.executeUpdate();
             System.out.println("Data Updated Successfully!!");
        } catch (SQLException e) {         
           printSQLException(e);
        }  
    }
    public void selectRecord() throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/registration?useSSL=false", "root", "9808628769");
                PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            preparedStatement.setInt(1, 1);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String password = rs.getString("password");
                System.out.println("Your Selected Data:"+id + "," + name + "," + email + "," + address + "," + password);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }     
    }
    public static void main(String[] args) throws SQLException {    
         new HandlingActionEvent1();
    }   
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
