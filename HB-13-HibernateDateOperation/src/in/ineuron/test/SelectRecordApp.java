package in.ineuron.test;

import org.hibernate.HibernateException;

import org.hibernate.Session;

import in.ineuron.model.PersonInfo;
import in.ineuron.util.HibernateUtil;

public class SelectRecordApp {

	public static void main(String[] args) throws Exception {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				int id=1;
				PersonInfo pn=session.get(PersonInfo.class, id);
				
				if (pn != null) {
					System.out.println(pn);
				}else {
					System.out.println("Record not available for the given id:: "+id);
				}
				
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}
