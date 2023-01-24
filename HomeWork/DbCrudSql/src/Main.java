import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MyHomeDb", "root", "Tdutbq21@sql")) {
                System.out.println("Sql select");

                Statement statement = connection.createStatement();
                //INSERT
                String sqlBuyers = "insert INTO Buyers (firstname, lastname, email, country_id, citie_id) values ('Andrey','Egorov','EgorovA@mail.ru',1,1);";
                int resBuyers =  statement.executeUpdate(sqlBuyers);
                System.out.println("Inserted Buyers "+resBuyers + " rows");

                String one = "Igor";
                String two = "Cergeev";
                String three = "IgorCergeev@mail.ru";
                int four = 1;
                int five = 1;
                String sqlScript = "insert INTO Buyers (firstname, lastname, email, country_id, citie_id) values (?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlScript);
                preparedStatement.setString(1,one);
                preparedStatement.setString(2,two);
                preparedStatement.setString(3,three);
                preparedStatement.setInt(4,four);
                preparedStatement.setInt(5,five);
                int result =   preparedStatement.executeUpdate();
                System.out.println("Inserted "+result + " rows");

                String sqlCountries = "insert INTO Countries (title, population, area) values ('USA',332278200,9826675);";
                int resCountries =  statement.executeUpdate(sqlCountries);
                System.out.println("Insert сountries "+resCountries + " rows");

                String sqlCities = "insert INTO Cities (title, population, country_id) values ('Novosibirsk',1620162,1);";
                int resCities =  statement.executeUpdate(sqlCities);
                System.out.println("Insert сities "+resCities + " rows");

                String sqlSections = "insert INTO Sections (title, quantity_products) values ('Furniture', 440), ('Clothes', 782), ('Shoes', 950);";
                int resSections =  statement.executeUpdate(sqlSections);
                System.out.println("Insert sections "+resSections + " rows");

                String sqlDiscount_products = "insert INTO Discount_products (title, price, discount, sections_id) values ('Jeans', 1700, 30, 4);";
                int resDiscount_products =  statement.executeUpdate(sqlDiscount_products);
                System.out.println("Insert Discount_products "+resDiscount_products + " rows");

                //UPDATE
                String sqlUpdateBuyers = "update Buyers set email='Evgeniy83@mail.ru' where lastname ='Pilipenko'";
                int UpdateBuyers =  statement.executeUpdate(sqlUpdateBuyers);
                System.out.println("Updated buyers "+UpdateBuyers + " rows");

                String sqlUpdateCountries = "update Countries set population=46433698 where title ='Argentina'";
                int UpdateCountries =  statement.executeUpdate(sqlUpdateCountries);
                System.out.println("Updated countries "+UpdateCountries + " rows");

                String sqlUpdateCities = "update Cities set population=5377503 where title ='Saint Petersburg'";
                int UpdateCities =  statement.executeUpdate(sqlUpdateCities);
                System.out.println("Updated cities "+UpdateCities + " rows");

                String sqlUpdateSections = "update Sections set quantity_products=920 where title ='Electronics'";
                int UpdateSections =  statement.executeUpdate(sqlUpdateSections);
                System.out.println("Updated Sections "+UpdateSections + " rows");

                String sqlUpdateDiscount_products = "update Discount_products set discount=30 where title ='computer'";
                int UpdateDiscount_products =  statement.executeUpdate(sqlUpdateDiscount_products);
                System.out.println("Updated Discount_products "+UpdateDiscount_products + " rows");

                System.out.println("-----------------------------------------------------");

                //DELETE
                String sqldeleteBuyers = "delete from Buyers where lastname ='Ivanov'";
                int deleteBuyers =  statement.executeUpdate(sqldeleteBuyers);
                System.out.println("Delete buyers "+deleteBuyers + " rows");

                String sqldeleteCities = "delete from Cities where population < 1000000 ";
                int deleteCities =  statement.executeUpdate(sqldeleteCities);
                System.out.println("Delete cities "+deleteCities + " rows");

                String sqldeleteCountries = "delete from Countries where title ='Latvia'";
                int deleteCountries =  statement.executeUpdate(sqldeleteCountries);
                System.out.println("Delete countries "+deleteCountries + " rows");

                String sqldeleteSections = "delete from Sections where quantity_products < 500";
                int deleteSections =  statement.executeUpdate(sqldeleteSections);
                System.out.println("Delete sections "+deleteSections + " rows");

                String sqldeleteDiscount_products = "delete from Discount_products where discount > 30";
                int deleteDiscount_products =  statement.executeUpdate(sqldeleteDiscount_products);
                System.out.println("Delete discount_products "+deleteDiscount_products + " rows");

                /*String sqldelete = "delete from Cities";
                int delete =  statement.executeUpdate(sqldelete);
                System.out.println("Delete "+delete + " rows");*/

                System.out.println("-----------------------------------------------------");

                //SELECT
                ResultSet resSetBuyers =  statement.executeQuery("SELECT * FROM Buyers");

                while (resSetBuyers.next()){
                    System.out.print(resSetBuyers.getInt(1)+ "  ");
                    System.out.print(resSetBuyers.getString(2)+ "  ");
                    System.out.print(resSetBuyers.getString(3)+ "  ");
                    System.out.print(resSetBuyers.getString(4)+ "  ");
                    System.out.print(resSetBuyers.getInt(5)+ "  ");
                    System.out.println(resSetBuyers.getInt(6));
                }

                System.out.println("-----------------------------------------------------");

                ResultSet resSetEmail =  statement.executeQuery("SELECT * FROM Buyers");

                while (resSetEmail.next()){
                    System.out.print(resSetEmail.getInt(1)+ "  ");
                    System.out.print(resSetEmail.getString(2)+ "  ");
                    System.out.print(resSetEmail.getString(3)+ "  ");
                    System.out.println(resSetEmail.getString("email")+ "  ");
                }

                System.out.println("-----------------------------------------------------");

                ResultSet resSetSections =  statement.executeQuery("SELECT * FROM Sections");

                while (resSetSections.next()){
                    System.out.print(resSetSections.getInt(1)+ "  ");
                    System.out.print(resSetSections.getString(2)+ "  ");
                    System.out.println(resSetSections.getInt(3)+ "  ");
                }

                System.out.println("-----------------------------------------------------");

                ResultSet resSetDiscount_products =  statement.executeQuery("SELECT * FROM Discount_products");

                while (resSetDiscount_products.next()){
                    System.out.print(resSetDiscount_products.getInt(1)+ "  ");
                    System.out.print(resSetDiscount_products.getString(2)+ "  ");
                    System.out.print(resSetDiscount_products.getInt(3)+ "  ");
                    System.out.print(resSetDiscount_products.getInt(4)+ "  ");
                    System.out.println(resSetDiscount_products.getInt(5)+ "  ");
                }

                System.out.println("-----------------------------------------------------");

                ResultSet resSetCountries =  statement.executeQuery("SELECT * FROM Countries");
                System.out.print(resSetCountries.getMetaData().getColumnLabel(1)+ "  ");
                System.out.print(resSetCountries.getMetaData().getColumnLabel(2)+ "  ");
                System.out.print(resSetCountries.getMetaData().getColumnLabel(3)+ "  ");
                System.out.println(resSetCountries.getMetaData().getColumnLabel(4));

                while (resSetCountries.next()){
                    System.out.print(resSetCountries.getInt(1)+ "  ");
                    System.out.print(resSetCountries.getString(2)+ "  ");
                    System.out.print(resSetCountries.getInt(3)+ "  ");
                    System.out.println(resSetCountries.getInt(4)+ "  ");
                }

                System.out.println("-----------------------------------------------------");

                ResultSet resSetCities =  statement.executeQuery("SELECT * FROM Cities");
                System.out.print(resSetCities.getMetaData().getColumnLabel(1)+ "  ");
                System.out.print(resSetCities.getMetaData().getColumnLabel(2)+ "  ");
                System.out.print(resSetCities.getMetaData().getColumnLabel(3)+ "  ");
                System.out.println(resSetCities.getMetaData().getColumnLabel(4));

                while (resSetCities.next()){
                    System.out.print(resSetCities.getInt(1)+ "  ");
                    System.out.print(resSetCities.getString(2)+ "  ");
                    System.out.print(resSetCities.getInt(3)+ "  ");
                    System.out.println(resSetCities.getInt(4)+ "  ");
                }

                System.out.println("-----------------------------------------------------");

                ResultSet RussiaBuyers =  statement.executeQuery("SELECT * FROM Buyers join Cities on Buyers.citie_id = Cities.id where Cities.title = 'Saint Petersburg';");

                while (RussiaBuyers.next()){
                    System.out.print(RussiaBuyers.getInt(1)+ "  ");
                    System.out.print(RussiaBuyers.getString(2)+ "  ");
                    System.out.print(RussiaBuyers.getString(3)+ "  ");
                    System.out.print(RussiaBuyers.getString(4)+ "  ");
                    System.out.print(RussiaBuyers.getInt(5)+ "  ");
                    System.out.println(RussiaBuyers.getInt(6));
                }

                System.out.println("-----------------------------------------------------");

                ResultSet CitiesBuyers =  statement.executeQuery("SELECT * FROM Buyers join Countries on Buyers.country_id = Countries.id where Countries.title = 'Russia';");

                while (CitiesBuyers.next()){
                    System.out.print(CitiesBuyers.getInt(1)+ "  ");
                    System.out.print(CitiesBuyers.getString(2)+ "  ");
                    System.out.print(CitiesBuyers.getString(3)+ "  ");
                    System.out.print(CitiesBuyers.getString(4)+ "  ");
                    System.out.print(CitiesBuyers.getInt(5)+ "  ");
                    System.out.println(CitiesBuyers.getInt(6));
                }

                System.out.println("-----------------------------------------------------");

                ResultSet CountriesCities =  statement.executeQuery("SELECT * FROM Cities join Countries on Cities.country_id = Countries.id where Countries.title = 'Russia';");

                while (CountriesCities.next()){
                    System.out.print(CountriesCities.getInt(1)+ "  ");
                    System.out.print(CountriesCities.getString(2)+ "  ");
                    System.out.print(CountriesCities.getInt(3)+ "  ");
                    System.out.println(CountriesCities.getInt(4));
                }

                System.out.println("-----------------------------------------------------");

                ResultSet BuyersSections =  statement.executeQuery("SELECT * FROM Sections_buyers join Sections on Sections_buyers.sections_id = Sections.id join Buyers on Sections_buyers.buyer_id = Buyers.id where Buyers.lastname = 'Blanco';");

                while (BuyersSections.next()){
                    System.out.println(BuyersSections.getString("Sections.title"));
                }


                System.out.println("-----------------------------------------------------");

                ResultSet DiscountProducts =  statement.executeQuery("SELECT * FROM Discount_products join Sections on Discount_products.sections_id = Sections.id where Sections.title = 'Electronics';");

                while (DiscountProducts.next()){
                    System.out.print(DiscountProducts.getInt(1)+ "  ");
                    System.out.print(DiscountProducts.getString(2)+ "  ");
                    System.out.print(DiscountProducts.getInt(3)+ "  ");
                    System.out.print(DiscountProducts.getInt(4)+ "  ");
                    System.out.println(DiscountProducts.getInt(5));
                }

            }
        }catch (Exception e) {
            System.out.println("Connection failed + " + e.getMessage());
        }
    }
}