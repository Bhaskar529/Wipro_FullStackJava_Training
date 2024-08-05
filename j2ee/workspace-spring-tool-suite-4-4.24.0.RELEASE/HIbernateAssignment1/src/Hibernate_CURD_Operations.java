
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Hibernate_CURD_Operations {
		
	private static SessionFactory factory;
	
	//obtains the session factory
	public static void getSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder()
					.applySettings(conf.getProperties());
			factory=conf.buildSessionFactory(builder.build());
		}
		catch(Throwable ex) {
			System.out.println("Exception is: "+ex);
		}
	}
	
	public static void main(String args[]) {
		getSessionFactory();
		Hibernate_CURD_Operations Obj=new Hibernate_CURD_Operations();
		Student stu1=new Student(101,"charan","mpc",500);
		Student stu2=new Student(102,"Varun","bipc",550);
		Student stu3=new Student(103,"Saurabh","mpc",560);
		Obj.insertIntoDatabase(stu1);
		Obj.insertIntoDatabase(stu2);
		Obj.insertIntoDatabase(stu3);
		
		Obj.displayRecords();
		
	}
	
	public void insertIntoDatabase(Student stu) {
		try {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(stu);
			tx.commit();
			System.out.println("Given record is inserted in the Database successfully.");
			session.close();
			
		}
		catch(HibernateException ex) {
			System.out.println("Exception is : "+ex);
		}
	}
	
	public void displayRecords() {
		try {
			Session sessionObj=factory.openSession();
			List<Student> stuList=sessionObj.createQuery("FROM Student").list();
			System.out.println("List of records in the db are :");
			for(Student stu:stuList)
				System.out.println(stu);
			sessionObj.close();
		}catch(HibernateException ex) {
			System.out.println(ex);
		}
	}
	
	//Display the records with Native sql
	public void displayRecords_NativeSQL() {
		try {
			Session sessionObj=factory.openSession();
			String str="SELECT * hibernate_create_insert_update_delete wehre marks=500";
			SQLQuery query=sessionObj.createSQLQuery(str);
			query.addEntity(Student.class);
			List<Student> stuList=query.list();
			System.out.println("List of records : ");
			for(Student stu:stuList)
				System.out.println(stu);
			sessionObj.close();
		}catch(HibernateException ex) {
			System.out.println(ex);
		}
	}
	
	public void updateRecord(int id,int salary) {
		try {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Student stu=(Student)session.get(Student.class, id);
			stu.setMarks(salary);
			session.update(stu);
			tx.commit();
			System.out.println("Given record is updated in the db successfully");
			session.close();
		}catch(HibernateException hx) {
			System.out.println(hx);
		}
	}
	
	public void deleteRecord(int id) {
		try {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Student emp=(Student)session.get(Student.class, id);
			session.delete(emp);
			tx.commit();
			System.out.println("Given record is deleted in the db successfully...");
			session.close();
		}catch(HibernateException ex) {
			System.out.println(ex);
		}
	}
	
	
}
