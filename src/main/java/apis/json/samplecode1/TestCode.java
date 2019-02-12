package apis.json.samplecode1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class TestCode {

	public static Service readDataHardCoded() {
		// Initialize POJOs
		
		// set 1
		OfficeA officeA = new OfficeA();
		officeA.setName("Xebia");
		officeA.setClient("Grnd");
		officeA.setTeamsize("2");

		OfficeB officeB = new OfficeB();
		officeB.setName("EPAM");
		officeB.setClient("MC");
		officeB.setTeamsize("10");

		Office office = new Office();
		office.setOfficeA(officeA);
		office.setOfficeB(officeB);

		AddressGeo addressGeo = new AddressGeo();
		addressGeo.setLattitude("400");
		addressGeo.setLongitude("500");

		Address address = new Address();
		address.setHno("101");
		address.setBlock("A2");
		address.setArea("Kharadi");
		address.setState("Maharashtra");
		address.setAddressGeo(addressGeo);

		Employee employee1 = new Employee();
		employee1.setName("Sheetal");
		employee1.setSurname("Singh");
		employee1.setAge("34");
		employee1.setAddress(address);
		employee1.setOffice(office);

		
		
		// set2 
		OfficeA officeANew = new OfficeA();
		officeANew.setName("Barclays");
		officeANew.setClient("VISA");
		officeANew.setTeamsize("10");

		OfficeB officeBNew = new OfficeB();
		officeBNew.setName("Quartz");
		officeBNew.setClient("FK");
		officeBNew.setTeamsize("20");

		Office officeNew = new Office();
		officeNew.setOfficeA(officeANew);
		officeNew.setOfficeB(officeBNew);

		AddressGeo addressGeoNew = new AddressGeo();
		addressGeoNew.setLattitude("1000");
		addressGeoNew.setLongitude("2000");

		Address addressNew = new Address();
		addressNew.setHno("102");
		addressNew.setBlock("B2");
		addressNew.setArea("VN");
		addressNew.setState("Delhi");
		addressNew.setAddressGeo(addressGeoNew);

		Employee employee2 = new Employee();
		employee2.setName("John");
		employee2.setSurname("Brown");
		employee2.setAge("35");
		employee2.setAddress(addressNew);
		employee2.setOffice(officeNew);
		
		
		//create single data object
		List<Employee> lsEmp = new ArrayList<>();
		lsEmp.add(employee1);
		lsEmp.add(employee2);

		Service serivce = new Service();
		serivce.setEmployee(lsEmp);

		return serivce;
	}
	

	public static void main(String[] args) {
		//Java Object
		Service serivce = TestCode.readDataHardCoded();
		
			
		// file writer
		String file = ".\\src\\main\\java\\apis\\json\\samplecode1\\emp.json";
		FileWriter fw = null;
		
		Gson gson = new Gson();
		try {
			fw = new FileWriter(file);
			gson.toJson(serivce, fw);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Json file 'emp.json' created succesfully from 'inputdata.csv'");
	}

}
