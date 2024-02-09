// package com.bug;

// import static org.testng.Assert.assertEquals;
// import static org.testng.Assert.assertSame;

// import java.util.ArrayList;
// import java.util.List;

// import org.junit.jupiter.api.TestMethodOrder;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.bug.bean.Bug;
// import com.bug.bean.Response;
// import com.bug.bean.User;
// import com.bug.service.BugService;
// import com.bug.service.LoginService;
// import com.bug.service.UserService;

// @SpringBootTest
// class SbBugTrackingApplicationTests {

// 	@Autowired
// 	UserService service;

// 	@Autowired
// 	LoginService logService;

// 	@Autowired
// 	BugService bugService;

// 	// This object is used to register user and log in as user
// 	User user1 = new User("Jeyandhan", "12345");
	
// 	// This object is used to log as as Admin
// 	User user2 = new User("aravinds", "12345");

// 	// This object is used to check the invalid user.
// 	User user3 = new User("domnic", "7896jd");
	
// 	// used to insert a bug
// 	Bug insBug = new Bug("index out of bound", "siva", "while running array program");

// 	// used to update bug
// 	Bug upBug = new Bug(5,"index out of bound","aravind","while running array program","close","Your program accessing the out of bound element");

// 	@Test
// 	@Order(1)
// 	void registerUser() {

// 		String expect = "inserted";
// 		String result = service.registerUser(user1);
// 		assertEquals(expect, result);

// 	}

// 	@Test
// 	@Order(2)
// 	void loginUser() {

// 		Response r1 = new Response("User Success");
// 		Response r2 = logService.verifyUser(user1);
// 		r1.equals(r2);

// 	}

// 	@Test
// 	@Order(3)
// 	void AdminUser() {

// 		Response r1 = new Response("Admin Success");
// 		Response r2 = logService.verifyUser(user2);
// 		r1.equals(r2);

// 	}

// 	@Test
// 	@Order(4)
// 	void invalidUser() {

// 		Response r1 = new Response("Login Fail");
// 		Response r2 = logService.verifyUser(user3);
// 		r1.equals(r2);

// 	}

	
// 	@Test
// 	@Order(5)
// 	void registerBug() {
// 		String expect = "inserted";
// 		String result = bugService.registerBug(insBug);
// 		assertEquals(expect, result);

// 	}

// 	@Test
// 	@Order(6)
// 	void updateBug() {
// 		String expect = "updated";
// 		String result = bugService.updateBug(upBug);
// 		assertEquals(expect, result);

// 	}

// 	List<Bug> list1 = new ArrayList<Bug>();

// 	Bug bugcheck = new Bug(8, "angular", "dom", "while running the app", "open", "waiting for debug");

// 	@Test
// 	@Order(7)
// 	void getBug() {
// 		list1.add(bugcheck);
// 		List<Bug> list = bugService.getBug("dom");
// 		list1.equals(list);

// 	}

// }
