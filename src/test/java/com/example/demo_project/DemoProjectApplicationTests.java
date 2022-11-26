package com.example.demo_project;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



//@SpringBootTest
class DemoProjectApplicationTests {
	
	
	
	@Test
	public void twoSumTest() {
		int[] intArray = {2,7,11,15};
//		int target = 9;
//		for(int x = 0; x < nums.length; x++ ) {
//			for(int y = x + 1; y < nums.length; y++) {
//				if(nums[x] + nums[y] == target) {
//					int[] a = {x, y};
//				}
//			}
//		}
		
		int[] result = twoSum(intArray, 9);
		for(int item : result) {
			System.out.println(item);
		}
	}
	
	public int[] twoSum1(int[] nums, int target) {
		int count = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			int num1 = nums[i];
			for(int j = i + 1; j < nums.length; j++) {
				count++;
				int num2 = nums[j];
				if(num1 + num2 == target) {
					System.out.println(count);
					return new int[] {i, j};
				}
			}
	}
		return null;
}
	//================
	public int[] twoSum(int[] nums, int target) {
		//<Key, value>
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			count++;
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				System.out.println(count);
				return new int[] {map.get(complement), i};
		}
			map.put(nums[i], i);
	}
		return null;
}
	
//	@Autowired
//	private PersonDao personDao;
//	
//	@Test
//	public void collectionTest() {
//		List<Person> result = personDao.findByCity("Taipei");
//		System.out.println(result.size());
//	}

//	@Autowired
//	private BankService bankService;
	
//	@Autowired
//	private BankController bankController;
	
//	@Test
//	public void contextLoads() {
//		Bank bank = new Bank();
//	    bankService.getAmount(bank);
//	    bankService.deposit(bank, 10);
//	    bankService.withdraw(bank, 600000);
//	}
	
//
//	@Test
//	public void bankControllerTest(){
//		BankReq req = new BankReq();
//		req.setAccount("");
//		BankRes res = bankController.getAmount(req);
//		System.out.println(res.getBank().getAccount());
//		System.out.println(res.getBank().getAmount());
//		System.out.println(res.getMessage()); 
//	}
//	
	
}