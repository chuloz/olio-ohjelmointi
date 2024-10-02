package dao;

import etnity.Currency;
import java.sql.*;
import datacource.MariaDBConnection;
import java.util.*;

public class CurrencyDao {
    public List<Currency> getAllCurrencies() {
        Connection conn = MariaDBConnection.getConnection();
        String sql = "SELECT id, abbreviation, name, rate FROM Currency.current";
        List<Currency> currencies = new ArrayList<Currency>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Currency currency = new Currency(rs.getString("abbreviation"), rs.getString("name"), rs.getDouble("rate"));
                currencies.add(currency);
            }
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
        return currencies;
    }

    public double getExchangeRate(String abbreviation) {
        Connection conn = MariaDBConnection.getConnection();
        String sql = "SELECT rate FROM Currency.current WHERE abbreviation=?";
        double rate = 0.0;

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, abbreviation);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                rate = rs.getDouble("rate");
            }
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();

        }
        return rate;
    }
}