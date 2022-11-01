package dev.iceey.pj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestPJ2 {

	public static void addOdjInKey(HashMap<String, ArrayList<Object>> dict) {

		Scanner kb = new Scanner(System.in);

		// System.out.print("ห้องหมายเลข = ");
		// String roomNum = kb.next();

		// System.out.print("กี่วัน = ");
		// int days = kb.nextInt();

		// System.out.print("ชื่อเจ้าของแมว = ");
		// String name = kb.next();

		OwnerInformation objOn = new OwnerInformation();
		CatInformation objCat = new CatInformation();
		VipRoom objRoom = new VipRoom();

		objOn.setFullName("daeng");
		objOn.setAge(14);
		objCat.setCatName("ice");
		objRoom.setRoomNumber("111");
		objRoom.setHowManyDaysToStay(3);

		dict.get("01").add("เลขห้อง = " + objRoom.getRoomNumber());
		dict.get("01").add("ชื่อเจ้าของแมว = " + objOn.getFullName());
		dict.get("01").add("ชื่อของแมว = " + objCat.getCatName());
		dict.get("01").add("ค่าห้องราคาทั้งหมด = " + objRoom.getRoomPrice());
		dict.get("01").add(objOn);
		dict.get("01").add(objCat);
		dict.get("01").add(objRoom);

		// System.out.println(bo);

		// bo.get("111").clear();
		// System.out.println(bo);

	}
	
	public static void clearData(HashMap<String, ArrayList<Object>> dict) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("ต้องการล้างข้อมูลห้องหมายเลขอะไร"+"\n"+"= ");
		String numbeRoom = kb.next();
		
		dict.get(numbeRoom).clear();
		System.out.print("\n");
		
	}

	public static void editData(HashMap<String, ArrayList<Object>> dict) {

		while(true)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลเจ้าของแมว"
					+ "\n" + "2.แก้ไขข้อมูลแมว" + "\n" + "3.แก้ไขข้อมูลห้อง"+"\n" +"0.หยุดการทำงานของการแก้ไขข้อมูล");
			System.out.print("= ");
			String key = kb.next();

			
			//แก้ไขข้อมูลเจ้าของแมว
			if (key.equals("1")) {
				System.out.print("เลขห้องที่คุณต้องการที่จะแก้ไขข้อมูล" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				while (true) {
					System.out.print(
							"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อเจ้าของแมว"
									+ "\n" + "2.แก้ไขข้อมูลอายุเจ้าของแมว" + "\n" + "3.แก้ไขข้อมูลเบอร์โทรติดต่อเจ้าของแมว" + "\n"
									+ "4.แก้ไขข้อมูลที่อยู่เจ้าของแมว" + "\n" + "5.แก้ไขข้อมูลเลขประชาชนเจ้าของแมว" + "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditOwner = kb.next();

					if (keyEditOwner.equals("1")) {
						System.out.print("กรุณากรอกชื่อเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String ownerName = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setFullName(ownerName);
						dict.get(numberRoom).set(1,"ชื่อเจ้าของแมว = " +ownerName);
						System.out.print("\n");

					} else if (keyEditOwner.equals("2")) {
						System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						int ownerAge = kb.nextInt();
						((OwnerInformation) dict.get(numberRoom).get(4)).setAge(ownerAge);
						System.out.print("\n");

					} else if (keyEditOwner.equals("3")) {
						System.out.print("กรุณากรอกเบอร์ติดต่อเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String ownerContactNumber = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setContactNumber(ownerContactNumber);
						System.out.print("\n");

					} else if (keyEditOwner.equals("4")) {
						System.out.print("กรุณากรอกที่อยู่เจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String ownerAddress = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setAddress(ownerAddress);
						System.out.print("\n");

					} else if (keyEditOwner.equals("5")) {
						System.out.print("กรุณากรอกเลขประชาชนเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String ownerIdCard = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setIdCard(ownerIdCard);
						System.out.print("\n");
					
					}else if(keyEditOwner.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
					
			//แก้ไขข้อมูลแมว
			} else if (key.equals("2")) {
				System.out.print("เลขห้องที่คุณต้องการที่จะแก้ไขข้อมูล" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				while (true) {
					System.out.print(
							"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อแมว"
									+ "\n" + "2.แก้ไขข้อมูลอายุเแมว" + "\n" + "3.แก้ไขข้อมูลน้ำหนักแมว" + "\n"
									+ "4.แก้ไขข้อมูลสายพันธุ์แมว" + "\n" + "5.แก้ไขข้อมูลสีขนแมว" + "\n" 
									+"6.แก้ไขข้อมูลโรคประจำตัวของแมว"+"\n"+"7.แก้ไขข้อมูลหนังสือวัคซีนแมว"+"\n"+"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("กรุณากรอกชื่อแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String catName = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCatName(catName);
						dict.get(numberRoom).set(1,"ชื่อของแมว = " +catName);
						System.out.print("\n");

					} else if (keyEditCat.equals("2")) {
						System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						int catAge = kb.nextInt();
						((CatInformation) dict.get(numberRoom).get(5)).setCatAge(catAge);
						System.out.print("\n");
						
					} else if (keyEditCat.equals("3")) {
						System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						double catWeight = kb.nextDouble();
						((CatInformation) dict.get(numberRoom).get(5)).setWeight(catWeight);
						System.out.print("\n");

					} else if (keyEditCat.equals("4")) {
						System.out.print("กรุณากรอกสายพันธุ์แมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String catBreed = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setBreed(catBreed);
						System.out.print("\n");

					} else if (keyEditCat.equals("5")) {
						System.out.print("กรุณากรอกสีขนแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String catFurColor = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setFurColor(catFurColor);
						System.out.print("\n");
					
					}else if (keyEditCat.equals("6")) {
						System.out.print("กรุณากรอกโรคประจำตัวของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String catCongenitalDisease = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCongenitalDisease(catCongenitalDisease);
						System.out.print("\n");
					
					}else if (keyEditCat.equals("7")) {
						System.out.print("กรุณากรอกหนังสือวัคซีนแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
						String catCatVaccineBook = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCatVaccineBook(catCatVaccineBook);
						System.out.print("\n");
					
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
				
			//แก้ไขข้อมูลห้อง
			} else if (key.equals("3")) {
				System.out.print("เลขห้องที่คุณต้องการที่จะแก้ไขข้อมูล" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				
				while (numberRoom.equals("01") || numberRoom.equals("02") || numberRoom.equals("03") || numberRoom.equals("04") ||
						numberRoom.equals("05") || numberRoom.equals("06") || numberRoom.equals("07") || numberRoom.equals("08") ||
						numberRoom.equals("09") || numberRoom.equals("10")) 
				{
					System.out.print(
							"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลเข้าพักกี่วัน"
									+ "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("กรุณากรอกจำนวนวันที่เข้าพักที่ต้องการจะแก้ไข" + "\n" + "= ");
						int days = kb.nextInt();
						((VipRoom) dict.get(numberRoom).get(6)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,"ค่าห้องราคาทั้งหมด = " +((VipRoom) dict.get(numberRoom).get(6)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
				
				while (numberRoom.equals("11") || numberRoom.equals("12") || numberRoom.equals("13") || numberRoom.equals("14") ||
						numberRoom.equals("15") || numberRoom.equals("16") || numberRoom.equals("17") || numberRoom.equals("18") ||
						numberRoom.equals("19") || numberRoom.equals("20")) 
				{
					System.out.print(
							"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลเลขห้อง"
									+ "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						
						System.out.print("กรุณากรอกจำนวนวันที่เข้าพักที่ต้องการจะแก้ไข" + "\n" + "= ");
						int days = kb.nextInt();
						((StandardRoom) dict.get(numberRoom).get(6)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,"ค่าห้องราคาทั้งหมด = " +((StandardRoom) dict.get(numberRoom).get(6)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
			
			//หยุดการทำงานของการแก้ไขข้อมูล
			} else if(key.equals("0")) 
			{
				System.out.print("\n");
				break;
				
			}else {
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
			}
		}

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		HashMap<String, ArrayList<Object>> bo = new HashMap<String, ArrayList<Object>>();
		bo.put("01", new ArrayList<Object>());
		bo.put("02", new ArrayList<Object>());
		bo.put("03", new ArrayList<Object>());
		bo.put("15", new ArrayList<Object>());

		addOdjInKey(bo);

		for (String i : bo.keySet()) {
			System.out.println("key: " + i + " value: " + bo.get(i));
		}
		System.out.println();
		editData(bo);
		clearData(bo);

		for (String i : bo.keySet()) {
			System.out.println("key: " + i + " value: " + bo.get(i));
		}

		// ((OwnerInformation) bo.get("111").get(4)).setFullName("sadw223");
		// System.out.println(((OwnerInformation) bo.get("111").get(4)).getFullName());

	}

}
