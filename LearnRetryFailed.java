package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnRetryFailed {

	@Test
	 public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
	}

	@Test
	 public void editLead() {
		System.out.println("Edit Lead");
	}
	 
	@Test
	 public void deleteLead() {
		System.out.println("Delete Lead");
	}
	@Test
	 public void mergeLead() {
		System.out.println("Merge Lead");
		throw new NoSuchElementException();
	}
	@Test
	 public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
}
