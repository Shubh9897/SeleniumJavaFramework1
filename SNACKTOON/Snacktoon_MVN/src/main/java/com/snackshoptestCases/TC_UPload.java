package com.snackshoptestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.snackshop.pageObjects.HomePage;

public class TC_UPload extends BaseClass {

	@Test
	public void documentUploadTest() {
		// Write your test cases for document upload functionality here
		// Test Case 1: Verify Successful Document Upload
		HomePage uploadPage = new HomePage(driver);
		uploadPage.uploadFile("path_to_valid_document");
		Assert.assertEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after successful document upload");

		// Test Case 2: Verify Upload Document with Invalid File Type
		uploadPage.uploadFile("path_to_invalid_file_type");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with invalid file type");

		// Test Case 3: Verify Upload Empty Document
		uploadPage.uploadFile("path_to_empty_document");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with empty document");

		// Test Case 4: Verify Upload Large Document
		uploadPage.uploadFile("path_to_large_document");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with large document");

		// Test Case 5: Verify Upload Multiple Documents
		// Implement if supported by the application

		// Test Case 6: Verify Upload Document with Special Characters in Name
		uploadPage.uploadFile("path_to_document_with_special_characters");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with special characters in document name");

		// Test Case 7: Verify Upload Document with Long Name
		uploadPage.uploadFile("path_to_document_with_long_name");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with long document name");

		// Test Case 8: Verify Upload Document with Non-English Characters in Name
		uploadPage.uploadFile("path_to_document_with_non_english_characters");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with non-English characters in document name");

		// Test Case 9: Verify Upload Document with Restricted Characters in Name
		uploadPage.uploadFile("path_to_document_with_restricted_characters");

		Assert.assertNotEquals(driver.getCurrentUrl(), "expected_url_after_upload",
				"URL after upload with restricted characters in document name");

		// Add more test cases as needed...
	}

}
