package dao;

import database.ConnectionUtil;
import model.phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class phonedao {
    Connection connection = ConnectionUtil.getConnection();

    public List<phone> getListphone(int id) {
        List<phone> list = new ArrayList<>();
        String sql = "SELECT * FROM  user WHERE id= ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                phone p = new phone();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setBrand(rs.getString("brand"));
                p.setPrice(rs.getString("price"));
                p.setDescription(rs.getString("description"));

                list.add(p);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public String updatephone(phone p){
        String sql="UPDATE product SET name = ?,brand = ?, price = ?, description = ? WHERE id=?";
        try{
            PreparedStatement ps =  connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setString(2, p.getBrand());
            ps.setString(3, p.getPrice());
            ps.setString(4, p.getDescription());
            int isSuccess=ps.executeUpdate();
            if(isSuccess>0){
                return"Success";
            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return"Fail";
    }
    public String deletephone(int id){
        String sql="DELETE FROM product WHERE id=?";
        try{
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1, id);
            int isSuccess=ps.executeUpdate();
            if(isSuccess>0){
                return"Success";
            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return"Fail";
    }

    public String insertphone(phone p){
        String sql="INSERT INTO product(name,brand,price,description)VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getName());
            ps.setString(2, p.getBrand());
            ps.setString(3, p.getPrice());
            ps.setString(4, p.getDescription());
            int isSuccess = ps.executeUpdate();
            if(isSuccess > 0){
                return "Success";
            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return"Fail";
    }
}
