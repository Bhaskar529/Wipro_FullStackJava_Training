package com.wipro.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wipro.model.GenderTyp;
import com.wipro.model.Person;
import com.wipro.util.OracleConnection;
public class PersonDaoImpl implements PersonDAO{
	@Override
	public String addPerson(Person person) throws SQLException {
		
		try(
				Connection connection = OracleConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareCall(QueryMapper.ADD_PERSON);
				
				){
			preparedStatement.setLong(1, person.getAdharCard());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getGender().toString());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(4,  java.sql.Date.valueOf(person.getBirthdate()));
			preparedStatement.setString(5, person.getAddress());
			preparedStatement.setLong(6,person.getMobile());
			
			int n = preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable to add person");
			}
			return "ADDED PERSON TO DATABASE";
			
		}catch(SQLException e) {
			throw e;
		}


	}




	@Override
	public String updatePerson(Person person) throws SQLException {
		
		try(
				Connection connection = OracleConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareCall(QueryMapper.UPDATE_PERSON);
				
				){
			preparedStatement.setString(1, person.getName());
			preparedStatement.setString(2, person.getGender().toString());
			//convert java.time.LocalDate to java.sql.Date
			preparedStatement.setDate(3, java.sql.Date.valueOf(person.getBirthdate()));
			preparedStatement.setString(4, person.getAddress());
			preparedStatement.setLong(5, person.getMobile());
			preparedStatement.setLong(6, person.getAdharCard());
			
			int n = preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Unable be up update the person data");
			}
			return "PERSON:"+person.getAdharCard()+ " UPDATED TO DATABASE";
			
		}catch(SQLException e) {
			throw e;
		}
	}




	@Override
	public String deletePerson(Long adharCard) throws SQLException {
		
		try(
				Connection connection = OracleConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareCall(QueryMapper.DELETE_PERSON);
				
				){
			preparedStatement.setLong(1, adharCard);
			Person person=new Person();
			int n = preparedStatement.executeUpdate();
			if(n==0) {
				throw new SQLException("Invalid AdharCard");
			}
			return "PERSON:"+person.getAdharCard()+ " DELETED FROM DATABASE";
			
		}catch(SQLException e) {
			throw e;
		}
	}






	@Override
	public Person getPersonById(Long adharCard) throws SQLException {
		
		try(
				Connection connection = OracleConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareCall(QueryMapper.GET_PERSON_BY_ID);
				
				){
			preparedStatement.setLong(1, adharCard);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				Person person = new Person();
				populate(person,resultSet);
				return person;
			}else {
				throw new SQLException("Invalid AdharCard Number");
			}
			
		}catch(SQLException e) {
			throw e;
		}
	}




	@Override
	public List<Person> getAllPersons() throws SQLException {
		
		try(
				Connection connection = OracleConnection.getConnection();
				Statement statement = connection.createStatement();
				
				){
			ResultSet resultSet = statement.executeQuery(QueryMapper.GET_ALL_PERSONS);
			List<Person> personList = new ArrayList<>();
			while(resultSet.next()) {
				Person person = new Person();
				//copy contents of the current row of the resultSet object into person object
				populate(person,resultSet);
				//add person object to the list
				personList.add(person);
			}
			return personList;
		}catch(SQLException e) {
			throw e;
		}


	}


private void populate(Person person, ResultSet resultSet) throws SQLException {
		person.setAdharCard(resultSet.getLong("ADHARCARD"));
		person.setName(resultSet.getString("NAME"));
		//convert String -> GenderTyp
		person.setGender(GenderTyp.valueOf(resultSet.getString("GENDER")));
		//convert java.sql.Date to java.time.LocalDate
		person.setBirthdate(resultSet.getDate("BIRTHDATE").toLocalDate());
		person.setAddress(resultSet.getString("ADDRESS"));
		person.setMobile(resultSet.getLong("MOBILE"));
	
		
	}
}