package cs4050.bookstore.persistlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAccessImpl  {
	
	protected static Connection con = null;
	protected static Statement stmt = null;
	protected static PreparedStatement pstmt = null;
	protected static ResultSet result = null;
	
	/**
	 * Starts a connection to the database.
	 * @return connection object used to create queries. 
	 */
	public static Connection connect() {
		try {
			Class.forName(DbAccessConfiguration.DB_DRIVE_NAME);
			con = DriverManager.getConnection(DbAccessConfiguration.DB_CONNECTION_URL, DbAccessConfiguration.DB_CONNECTION_USERNAME, DbAccessConfiguration.DB_CONNECTION_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // try-catch
		return con;
	} // connect

	/**
	 * Close a connection to the database.
	 * @param con is the connection to be disconnected.
	 */
	public static void disconnect() {
		try {
			if(con != null){
				con.close();
			}if(stmt != null){
				stmt.close();
			}if(pstmt != null){
				pstmt.close();
			}if(result != null){
				result.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // try-catch
	} // disconnect
	
	/**
	 * Returns the result from the given query
	 * @param query is typically a select statement
	 * @return the result set
	 */
	public static ResultSet retrieve (String query) {
		ResultSet result = null;
		try {
			con = connect();	
			Statement stmt = con.createStatement();
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} // try-catch
		return result;
	} // retrieve
	
	/**
	 * Adds an item to the database.
	 * @param query should typically be an insert statement.
	 * @return the amount of rows affected by this query.
	 */
	public static int create (String query) {
		int rows = 0;
		try {
			con = connect();
			pstmt = con.prepareStatement(query);
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} // try-catch
		return rows;
	} // create
	
	/**
	 * Updates an item within the database.
	 * @param query should be a replace or update statement.
	 * @return the amount of rows affected by this query.
	 */
	public static int update (String query) {
		int rows = 0;
		try {
			con = connect();
			pstmt = con.prepareStatement(query);
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} // try-catch
		return rows;
	} // update
	
	/**
	 * Deletes an item from the database.
	 * @param query should be a delete statement.
	 * @return the amount of rows affected by this query.
	 */
	public static int delete (String query) {
		int rows = 0;
		try {
			con = connect();	
			pstmt = con.prepareStatement(query);
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} // try-catch
		return rows;
	} // delete
	
} // DbAccessInterface
