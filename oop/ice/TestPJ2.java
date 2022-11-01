package dev.iceey.pj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestPJ2 {

	public static void addOdjInKey(HashMap<String, ArrayList<Object>> dict) {

		Scanner kb = new Scanner(System.in);

		// System.out.print("��ͧ�����Ţ = ");
		// String roomNum = kb.next();

		// System.out.print("����ѹ = ");
		// int days = kb.nextInt();

		// System.out.print("������Ңͧ��� = ");
		// String name = kb.next();

		OwnerInformation objOn = new OwnerInformation();
		CatInformation objCat = new CatInformation();
		VipRoom objRoom = new VipRoom();

		objOn.setFullName("daeng");
		objOn.setAge(14);
		objCat.setCatName("ice");
		objRoom.setRoomNumber("111");
		objRoom.setHowManyDaysToStay(3);

		dict.get("01").add("�Ţ��ͧ = " + objRoom.getRoomNumber());
		dict.get("01").add("������Ңͧ��� = " + objOn.getFullName());
		dict.get("01").add("���ͧ͢��� = " + objCat.getCatName());
		dict.get("01").add("�����ͧ�Ҥҷ����� = " + objRoom.getRoomPrice());
		dict.get("01").add(objOn);
		dict.get("01").add(objCat);
		dict.get("01").add(objRoom);

		// System.out.println(bo);

		// bo.get("111").clear();
		// System.out.println(bo);

	}
	
	public static void clearData(HashMap<String, ArrayList<Object>> dict) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("��ͧ�����ҧ��������ͧ�����Ţ����"+"\n"+"= ");
		String numbeRoom = kb.next();
		
		dict.get(numbeRoom).clear();
		System.out.print("\n");
		
	}

	public static void editData(HashMap<String, ArrayList<Object>> dict) {

		while(true)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢�������Ңͧ���"
					+ "\n" + "2.��䢢��������" + "\n" + "3.��䢢�������ͧ"+"\n" +"0.��ش��÷ӧҹ�ͧ�����䢢�����");
			System.out.print("= ");
			String key = kb.next();

			
			//��䢢�������Ңͧ���
			if (key.equals("1")) {
				System.out.print("�Ţ��ͧ���س��ͧ��÷�����䢢�����" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				while (true) {
					System.out.print(
							"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū�����Ңͧ���"
									+ "\n" + "2.��䢢�����������Ңͧ���" + "\n" + "3.��䢢����������õԴ�����Ңͧ���" + "\n"
									+ "4.��䢢����ŷ��������Ңͧ���" + "\n" + "5.��䢢������Ţ��ЪҪ���Ңͧ���" + "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditOwner = kb.next();

					if (keyEditOwner.equals("1")) {
						System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						String ownerName = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setFullName(ownerName);
						dict.get(numberRoom).set(1,"������Ңͧ��� = " +ownerName);
						System.out.print("\n");

					} else if (keyEditOwner.equals("2")) {
						System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						int ownerAge = kb.nextInt();
						((OwnerInformation) dict.get(numberRoom).get(4)).setAge(ownerAge);
						System.out.print("\n");

					} else if (keyEditOwner.equals("3")) {
						System.out.print("��سҡ�͡����Դ�����Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						String ownerContactNumber = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setContactNumber(ownerContactNumber);
						System.out.print("\n");

					} else if (keyEditOwner.equals("4")) {
						System.out.print("��سҡ�͡���������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						String ownerAddress = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setAddress(ownerAddress);
						System.out.print("\n");

					} else if (keyEditOwner.equals("5")) {
						System.out.print("��سҡ�͡�Ţ��ЪҪ���Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						String ownerIdCard = kb.next();
						((OwnerInformation) dict.get(numberRoom).get(4)).setIdCard(ownerIdCard);
						System.out.print("\n");
					
					}else if(keyEditOwner.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
					
			//��䢢��������
			} else if (key.equals("2")) {
				System.out.print("�Ţ��ͧ���س��ͧ��÷�����䢢�����" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				while (true) {
					System.out.print(
							"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū������"
									+ "\n" + "2.��䢢�������������" + "\n" + "3.��䢢����Ź��˹ѡ���" + "\n"
									+ "4.��䢢�������¾ѹ������" + "\n" + "5.��䢢������բ����" + "\n" 
									+"6.��䢢������ä��Шӵ�Ǣͧ���"+"\n"+"7.��䢢�����˹ѧ����Ѥ�չ���"+"\n"+"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("��سҡ�͡������Ƿ���ͧ��è����" + "\n" + "= ");
						String catName = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCatName(catName);
						dict.get(numberRoom).set(1,"���ͧ͢��� = " +catName);
						System.out.print("\n");

					} else if (keyEditCat.equals("2")) {
						System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						int catAge = kb.nextInt();
						((CatInformation) dict.get(numberRoom).get(5)).setCatAge(catAge);
						System.out.print("\n");
						
					} else if (keyEditCat.equals("3")) {
						System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						double catWeight = kb.nextDouble();
						((CatInformation) dict.get(numberRoom).get(5)).setWeight(catWeight);
						System.out.print("\n");

					} else if (keyEditCat.equals("4")) {
						System.out.print("��سҡ�͡��¾ѹ�����Ƿ���ͧ��è����" + "\n" + "= ");
						String catBreed = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setBreed(catBreed);
						System.out.print("\n");

					} else if (keyEditCat.equals("5")) {
						System.out.print("��سҡ�͡�բ���Ƿ���ͧ��è����" + "\n" + "= ");
						String catFurColor = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setFurColor(catFurColor);
						System.out.print("\n");
					
					}else if (keyEditCat.equals("6")) {
						System.out.print("��سҡ�͡�ä��Шӵ�Ǣͧ��Ƿ���ͧ��è����" + "\n" + "= ");
						String catCongenitalDisease = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCongenitalDisease(catCongenitalDisease);
						System.out.print("\n");
					
					}else if (keyEditCat.equals("7")) {
						System.out.print("��سҡ�͡˹ѧ����Ѥ�չ��Ƿ���ͧ��è����" + "\n" + "= ");
						String catCatVaccineBook = kb.next();
						((CatInformation) dict.get(numberRoom).get(5)).setCatVaccineBook(catCatVaccineBook);
						System.out.print("\n");
					
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
				
			//��䢢�������ͧ
			} else if (key.equals("3")) {
				System.out.print("�Ţ��ͧ���س��ͧ��÷�����䢢�����" + "\n" + "= ");
				String numberRoom = kb.next();
				System.out.print("\n");
				
				while (numberRoom.equals("01") || numberRoom.equals("02") || numberRoom.equals("03") || numberRoom.equals("04") ||
						numberRoom.equals("05") || numberRoom.equals("06") || numberRoom.equals("07") || numberRoom.equals("08") ||
						numberRoom.equals("09") || numberRoom.equals("10")) 
				{
					System.out.print(
							"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢�������Ҿѡ����ѹ"
									+ "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("��سҡ�͡�ӹǹ�ѹ�����Ҿѡ����ͧ��è����" + "\n" + "= ");
						int days = kb.nextInt();
						((VipRoom) dict.get(numberRoom).get(6)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,"�����ͧ�Ҥҷ����� = " +((VipRoom) dict.get(numberRoom).get(6)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
				
				while (numberRoom.equals("11") || numberRoom.equals("12") || numberRoom.equals("13") || numberRoom.equals("14") ||
						numberRoom.equals("15") || numberRoom.equals("16") || numberRoom.equals("17") || numberRoom.equals("18") ||
						numberRoom.equals("19") || numberRoom.equals("20")) 
				{
					System.out.print(
							"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢������Ţ��ͧ"
									+ "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						
						System.out.print("��سҡ�͡�ӹǹ�ѹ�����Ҿѡ����ͧ��è����" + "\n" + "= ");
						int days = kb.nextInt();
						((StandardRoom) dict.get(numberRoom).get(6)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,"�����ͧ�Ҥҷ����� = " +((StandardRoom) dict.get(numberRoom).get(6)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
			
			//��ش��÷ӧҹ�ͧ�����䢢�����
			} else if(key.equals("0")) 
			{
				System.out.print("\n");
				break;
				
			}else {
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
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
