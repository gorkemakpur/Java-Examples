package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql="DELETE FROM city where ID=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4081);

            int result=statement.executeUpdate();
            System.out.println("Kayıt Silindi "+result+" satır etkilendi");
        }

        catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


//---------------------------------------------------------------------------------------------------------
    public void updateData() throws SQLException
    {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql="UPDATE city set Population=3000000 where ID=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4083);

            int result=statement.executeUpdate();
            System.out.println("Kayıt Güncellendi "+result+" satır etkilendi");
        }

        catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
//---------------------------------------------------------------------------------------------------------
public static void insertData() throws SQLException
    {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql="insert into city(Name,CountryCode,District,Population) values (?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,"Sivas");
            statement.setString(2,"TUR");
            statement.setString(3,"TURKEY");
            statement.setInt(4,99999);
            int result=statement.executeUpdate();
            System.out.println("Kayıt Eklendi "+result+" satır etkilendi");
        }

        catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

//---------------------------------------------------------------------------------------------------------
    public static void selectDemo() throws SQLException
    {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries=new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")
                ));
            }
            System.out.println(countries.size());
        }

        catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }
}
