
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.CustomersEntity;
import entity.SuppliersEntity;

public class pocnorthwind {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("PersistenceUnit");

/*
SELECT 'new CustomersEntity("'+ [CustomerID] + '" , "' + [CompanyName] + '"  ,  "' + [ContactName] + '" , "'  + [ContactTitle] + '" , " '  +  [Address] + '" , "'   +  [City] + '" , "'   
+ CASE WHEN [Region] IS NULL THEN '' ELSE [Region] END + '" , "' 
+ CASE WHEN [PostalCode] IS NULL THEN '' ELSE [PostalCode] END + '" , "' 
+ [Country] + '" , "' + [Phone] + '" , "' 
+ CASE WHEN [Fax] IS NULL THEN ' ' ELSE [Fax] END + '" '  --SQL結尾
+');'
FROM [dbo].[Customers]
*/		
		CustomersEntity customer1 = new CustomersEntity("ALFKI" , "Alfreds Futterkiste"  ,  "Maria Anders" , "Sales Representative" , " Obere Str. 57" , "Berlin" , "" , "12209" , "Germany" , "030-0074321" , "030-0076545" );
		CustomersEntity customer2 = new CustomersEntity("ANATR" , "Ana Trujillo Emparedados y helados"  ,  "Ana Trujillo" , "Owner" , " Avda. de la Constitucion 2222" , "Mexico D.F." , "" , "05021" , "Mexico" , "(5) 555-4729" , "(5) 555-3745" );
		CustomersEntity customer3 = new CustomersEntity("ANTON" , "Antonio Moreno Taqueria"  ,  "Antonio Moreno" , "Owner" , " Mataderos  2312" , "Mexico D.F." , "" , "05023" , "Mexico" , "(5) 555-3932" , " " );
		CustomersEntity customer4 = new CustomersEntity("AROUT" , "Around the Horn"  ,  "Thomas Hardy" , "Sales Representative" , " 120 Hanover Sq." , "London" , "" , "WA1 1DP" , "UK" , "(171) 555-7788" , "(171) 555-6750" );
		CustomersEntity customer5 = new CustomersEntity("BERGS" , "Berglunds snabbkop"  ,  "Christina Berglund" , "Order Administrator" , " Berguvsvagen  8" , "Lulea" , "" , "S-958 22" , "Sweden" , "0921-12 34 65" , "0921-12 34 67" );		
		CustomersEntity customer6 = new CustomersEntity("BLAUS" , "Blauer See Delikatessen"  ,  "Hanna Moos" , "Sales Representative" , " Forsterstr. 57" , "Mannheim" , "" , "68306" , "Germany" , "0621-08460" , "0621-08924" );
		CustomersEntity customer7 = new CustomersEntity("BLONP" , "Blondesddsl pere et fils"  ,  "Frederique Citeaux" , "Marketing Manager" , " 24, place Kleber" , "Strasbourg" , "" , "67000" , "France" , "88.60.15.31" , "88.60.15.32" );
		CustomersEntity customer8 = new CustomersEntity("BOLID" , "Bolido Comidas preparadas"  ,  "Martin Sommer" , "Owner" , " C/ Araquil, 67" , "Madrid" , "" , "28023" , "Spain" , "(91) 555 22 82" , "(91) 555 91 99" );
		CustomersEntity customer9 =	new CustomersEntity("BONAP" , "Bon app'"  ,  "Laurence Lebihan" , "Owner" , " 12, rue des Bouchers" , "Marseille" , "" , "13008" , "France" , "91.24.45.40" , "91.24.45.41" );	
		CustomersEntity customer10 = new CustomersEntity("BOTTM" , "Bottom-Dollar Markets"  ,  "Elizabeth Lincoln" , "Accounting Manager" , " 23 Tsawassen Blvd." , "Tsawassen" , "BC" , "T2F 8M4" , "Canada" , "(604) 555-4729" , "(604) 555-3745" );
		CustomersEntity customer11 = new CustomersEntity("BSBEV" , "B's Beverages"  ,  "Victoria Ashworth" , "Sales Representative" , " Fauntleroy Circus" , "London" , "" , "EC2 5NT" , "UK" , "(171) 555-1212" , " " );
		CustomersEntity customer12 = new CustomersEntity("CACTU" , "Cactus Comidas para llevar"  ,  "Patricio Simpson" , "Sales Agent" , " Cerrito 333" , "Buenos Aires" , "" , "1010" , "Argentina" , "(1) 135-5555" , "(1) 135-4892" );
		CustomersEntity customer13 = new CustomersEntity("CENTC" , "Centro comercial Moctezuma"  ,  "Francisco Chang" , "Marketing Manager" , " Sierras de Granada 9993" , "Mexico D.F." , "" , "05022" , "Mexico" , "(5) 555-3392" , "(5) 555-7293" );	 
		CustomersEntity customer14 = new CustomersEntity("CHOPS" , "Chop-suey Chinese"  ,  "Yang Wang" , "Owner" , " Hauptstr. 29" , "Bern" , "" , "3012" , "Switzerland" , "0452-076545" , " " );
		CustomersEntity customer15 = new CustomersEntity("COMMI" , "Comercio Mineiro"  ,  "Pedro Afonso" , "Sales Associate" , " Av. dos Lusiadas, 23" , "Sao Paulo" , "SP" , "05432-043" , "Brazil" , "(11) 555-7647" , " " ); 
		
		
/*
SELECT  'new SuppliersEntity("'+ CAST([SupplierID]  as varchar(10)) + '" , "' +  [CompanyName] + '" , "' + [ContactName] + '" , "' + [ContactTitle]+ '" , "' + [Address]+ '" , "' + [City] + '" , "'
+ CASE WHEN [Region] IS NULL THEN '' ELSE [Region] END + '" , "' 
+ [PostalCode] + '" , "' + [Country] + '" , "' + [Phone] + '" , "' 
+ CASE WHEN [Fax] IS NULL THEN '' ELSE [Fax] END + '" , "' 
+ CASE WHEN [HomePage] IS NULL THEN ' ' ELSE CAST([HomePage] as NVARCHAR(max)) END + '" '  --SQL結尾
+');'
FROM [dbo].[Suppliers]
 */
		SuppliersEntity supplier1 = new SuppliersEntity("1" , "Exotic Liquids111" , "Charlotte Cooper" , "Purchasing Manager" , "49 Gilbert St." , "London" , "" , "EC1 4SD" , "UK" , "(171) 555-2222" , "(171) 555-2222" , "http://www.123.com/" );
		SuppliersEntity supplier2 = new SuppliersEntity("2" , "New Orleans Cajun Delights" , "Shelley Burke" , "Order Administrator" , "P.O. Box 78934" , "New Orleans" , "LA" , "70117" , "USA" , "(100) 555-4822" , "" , "#CAJUN.HTM#" );
		SuppliersEntity supplier3 = new SuppliersEntity("3" , "Grandma Kelly's Homestead" , "Regina Murphy" , "Sales Representative" , "707 Oxford Rd." , "Ann Arbor" , "MI" , "48104" , "USA" , "(313) 555-5735" , "(313) 555-3349" , " " );		
		SuppliersEntity supplier4 = new SuppliersEntity("4" , "Tokyo Traders" , "Yoshi Nagase" , "Marketing Manager" , "9-8 Sekimai Musashino-shi" , "Tokyo" , "" , "100" , "Japan" , "(03) 3555-5011" , "" , " " );	
		SuppliersEntity supplier5 = new SuppliersEntity("5" , "Cooperativa de Quesos 'Las Cabras'" , "Antonio del Valle Saavedra" , "Export Administrator" , "Calle del Rosal 4" , "Oviedo" , "Asturias" , "33007" , "Spain" , "(98) 598 76 54" , "" , " " );
		SuppliersEntity supplier6 = new SuppliersEntity("6" , "Mayumi's" , "Mayumi Ohno" , "Marketing Representative" , "92 Setsuko Chuo-ku" , "Osaka" , "" , "545" , "Japan" , "(06) 431-7877" , "" , "Mayumi's (on the World Wide Web)#http://www.microsoft.com/accessdev/sampleapps/mayumi.htm#" );
		SuppliersEntity supplier7 = new SuppliersEntity("7" , "Pavlova, Ltd." , "Ian Devling" , "Marketing Manager" , "74 Rose St. Moonie Ponds" , "Melbourne" , "Victoria" , "3058" , "Australia" , "(03) 444-2343" , "(03) 444-6588" , " " );		
		SuppliersEntity supplier8 = new SuppliersEntity("8" , "Specialty Biscuits, Ltd." , "Peter Wilson" , "Sales Representative" , "29 King's Way" , "Manchester" , "" , "M14 GSD" , "UK" , "(161) 555-4448" , "" , " " );	
		SuppliersEntity supplier9 = new SuppliersEntity("9" , "PB Knackebrod AB" , "Lars Peterson" , "Sales Agent" , "Kaloadagatan 13" , "Goteborg" , "" , "S-345 67" , "Sweden" , "031-987 65 43" , "031-987 65 91" , " " );
		SuppliersEntity supplier10 = new SuppliersEntity("10" , "Refrescos Americanas LTDA" , "Carlos Diaz" , "Marketing Manager" , "Av. das Americanas 12.890" , "Sao Paulo" , "" , "5442" , "Brazil" , "(11) 555 4640" , "" , " " );		
		
		
		//@BeforeClass
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(customer1);
		em.persist(customer2);
		em.persist(customer3);
		em.persist(customer4);
		em.persist(customer5);
		em.persist(customer6);
		em.persist(customer7);
		em.persist(customer8);
		em.persist(customer9);
		em.persist(customer10);
		em.persist(customer11);
		em.persist(customer12);
		em.persist(customer13);
		em.persist(customer14);
		em.persist(customer15);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.merge(supplier1);
		em.merge(supplier2);
		em.merge(supplier3);
		em.merge(supplier4);
		em.merge(supplier5);
		em.merge(supplier6);
		em.merge(supplier7);
		em.merge(supplier8);
		em.merge(supplier9);
		em.merge(supplier10);
		em.getTransaction().commit();
		
		
		
		
		//JPQL_SubQueryInHaving
		//EntityManager em = emf.createEntityManager();
		Query queryCustomers = em.createQuery(
			"SELECT c.customerId, c.companyName, c.contactName, c.contactTitle, c.address FROM CustomersEntity c");
		
		//會有錯誤訊息: java.lang.IllegalArgumentException: org.hibernate.hql.internal.ast.QuerySyntaxException: Customers is not mapped
//		Query query = em.createQuery(
//				"SELECT c.customerId,c.companyName FROM Customers c"); 
		
		List<Object[]> resultListCustomers = queryCustomers.getResultList();		
		List<String> stringListCustomers = resultListCustomers.stream()
						.map(o -> Arrays.toString(o))
						.collect(Collectors.toList());		
		
		System.out.println("------------- Customers 結果如下");
		stringListCustomers.forEach(System.out::println);
		
		
		Query querySuppliers = em.createQuery(
				"SELECT s.supplierId, s.companyName, s.contactName, s.contactTitle, s.address FROM SuppliersEntity s");
		
		List<Object[]> resultListSuppliers = querySuppliers.getResultList();		
		List<String> stringListSuppliers = resultListSuppliers.stream()
						.map(o -> Arrays.toString(o))
						.collect(Collectors.toList());		
			
		System.out.println("------------- Suppliers 結果如下");
		stringListSuppliers.forEach(System.out::println);
			
		//
		em.close();
		
		//@AfterClass
		emf.close();

	}

}
