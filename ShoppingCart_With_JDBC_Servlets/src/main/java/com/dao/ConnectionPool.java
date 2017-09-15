package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	volatile private static ConnectionPool connectionPool = null;
	private Vector<Connection> connections = new Vector<Connection>();

	private ConnectionPool() {

	}

	public static ConnectionPool getInstance() {
		if (connectionPool == null) {
			synchronized (connectionPool) {
				if (connectionPool == null) {
					connectionPool = new ConnectionPool();
				}
			}
		}
		return connectionPool;
	}

	public Connection getConnection() {
		if (connections.size() < 2) {
			initializeConnections();
		}

		return connections.remove(0);

	}

	private void initializeConnections() {

		for (int i = 0; i < 5; i++) {
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tekgroup", "root", "root");
				connections.addElement(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void returnConnection(Connection connection) {

		if (connection != null) {
			connections.addElement(connection);
		}
	}
}
