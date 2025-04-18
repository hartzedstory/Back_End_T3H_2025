
// Thread

import Model.Production;
import com.sun.source.tree.CaseTree;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

/*
Mục tiêu: Lấy duoc danh sachh sản pham tu duoi database, len java

B1- Tao connection
B2- Tao ra cau SQL (select * from production)
B3- Gui cau SQL den Database , query lay ra du lieu
B4- Nhan ve du lieu dang ResultSet --> convert du lieu thanh class Java
B5- Hien thi du lieu tu class Java
 */
public class Main {
    public static void main(String[] args) {
        /* B1- tao connection
            input req:
               username
               password
               database
               driver name
               url
         */

        String url = "jdbc:mysql://localhost:3306/antino";
        String username = "root";
        String password = "Anhduc1234";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username, password);

            //B2- Tao cau SQL select * from production
            String sql = "select * from production";
            PreparedStatement statement = connection.prepareStatement(sql);

            //B3- Gửi câu query và nhận về ResultSet
            ResultSet resultSet = statement.executeQuery(sql);

            //B4- Convert du lieu tu resultset sang java class
            int count = 1;
            List<Production> productionsResult = new ArrayList<Production>();
            while (resultSet.next()) { //resultSet.next() van con ban ghi tiep theo --> doc du lieu
                System.out.println("Doc ban ghi thu "+count);
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Float price = resultSet.getFloat("price");
                String description = resultSet.getString("description");
                Integer total = resultSet.getInt("total");

                //Set du lieu vao class
                Production production = new Production();
                production.setId(id);
                production.setName(name);
                production.setPrice(price);
                production.setDescription(description);
                production.setTotal(total);

                //Luu du lieu vao danh sach ket qua
                productionsResult.add(production);
                count++;
            }


            // B5:  Hien thi du lieu vua doc duoc
            productionsResult.forEach(System.out::println);


            //Additional: Lay thong tin detail cua san pham
            List<Integer> idProduction = productionsResult.stream().map(Production::getId).collect(Collectors.toList());
            String sqlDetail = "";
            PreparedStatement prepareStatement = connection.prepareStatement(sqlDetail);
            for (int i = 1; i < idProduction.size(); i++) {
                prepareStatement.setInt(i, idProduction.get(i));
            }
            ResultSet resultSetDetail = prepareStatement.executeQuery();
            while (resultSetDetail.next()) {

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}