
package all_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class database_con {
    static public Connection db_check()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/fruits", "root", "");
        }catch(Exception e)
        {
            System.out.print(e);
        }
        return con;   
    }  
    static public int process_value(String ss)
    {
        int p=0;
        try {
            Connection con=db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(8);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    static public int get_others(String ss)
    {
        int p=0;
        try {
            Connection con=db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(9);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    static public int get_welcome()
    {
        int p=0;
//        try {
//            Connection con=db_check();
//            String sql="Select * from info where name='extra' ";
//            PreparedStatement st=con.prepareStatement(sql);
//            ResultSet rs=st.executeQuery();
//            if(rs.next())
//            {
//                p=rs.getInt(2);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return p;
    }
    static public void update_welcome()
    {
        try {
            Connection con=database_con.db_check();
            String sql="Select * from info where name='extra' ";
            PreparedStatement st=con.prepareStatement(sql);
            sql="UPDATE info SET totalplay= "+1+" WHERE name='extra' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();        
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void update_score(String ss,int score)
    {
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(6);
            }
            if(score>p)
            {
            sql="UPDATE info SET bsc= "+score+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();
            }           
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void update_time(String ss,int k)
    {
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(7);
            }
            if(k>p)
            {
            sql="UPDATE info SET mt= "+k+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();
            }           
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void Play_count(String ss)
    {
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(2);
                
            }
            sql="UPDATE info SET totalplay= "+(p+1)+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();        
            //System.out.print("total palay: "+p);
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void Won_count(String ss)
    {
        Play_count(ss);
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(3);
            }
            sql="UPDATE info SET totalwon= "+(p+1)+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();        
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void Loss_count(String ss)
    {
        Play_count(ss);
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(4);
            }
            sql="UPDATE info SET totalloss= "+(p+1)+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();        
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static public void Abandon_count(String ss)
    {
        Play_count(ss);
        try {
            int p = 0;
            Connection con=database_con.db_check();
            String sql="Select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                p=rs.getInt(5);
                System.out.print(p);
            }
            sql="UPDATE info SET abandon= "+(p+1)+" WHERE name='"+ss+"' ";            
            st=con.prepareStatement(sql);
            st.executeUpdate();        
        } catch (SQLException ex) {
            Logger.getLogger(database_con.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
