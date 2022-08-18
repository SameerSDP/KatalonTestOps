package shopPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertTrue
import static org.junit.Assert.fail

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

public class utils {

	/**
	 * Asserts the total value is greater than subtotal
	 * @param TestObject with total order value 
	 * @param TestObject with subtotal order value 
	 * 
	 */

	@Keyword
	def verifyAmount(TestObject total, TestObject subtotal) {

		try {

			if (WebUI.getText(total)>WebUI.getText(subtotal)) {
				KeywordUtil.markPassed("Tax is added in order total")
			}else {

				KeywordUtil.markFailed("Total is smaller than subtotal")
			}
		} catch (Exception e) {
			e.printStackTrace()
			KeywordUtil.markFailed("Unable to verify Total amount")
		}
	}
}
