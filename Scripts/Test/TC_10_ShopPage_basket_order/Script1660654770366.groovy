import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.supercsv.cellprocessor.ParseInt as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Automation Practice Site/a_Shop (1)'), GlobalVariable.waitPresentTimeout)
WebUI.click(findTestObject('Object Repository/Page_Automation Practice Site/a_Shop (1)'))

WebUI.click(findTestObject('Object Repository/Page_Products  Automation Practice Site/a_Add to basket (1)'))


WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Products  Automation Practice Site/a_View Basket'), GlobalVariable.waitPresentTimeout)
WebUI.click(findTestObject('Object Repository/Page_Products  Automation Practice Site/a_View Basket'))

assert WebUI.getText(findTestObject('Object Repository/Page_Basket  Automation Practice Site/orderTotal')) > WebUI.getText(
    findTestObject('Object Repository/Page_Basket  Automation Practice Site/orderSubtotal'))

CustomKeywords.'shopPage.utils.verifyAmount'( findTestObject('Object Repository/Page_Basket  Automation Practice Site/orderTotal'),findTestObject('Object Repository/Page_Basket  Automation Practice Site/orderSubtotal'))

WebUI.click(findTestObject('Object Repository/Page_Basket  Automation Practice Site/a_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_first_name'), GlobalVariable.fName)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_last_name'), GlobalVariable.lName)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_email'), GlobalVariable.testEmail)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_address_1'), GlobalVariable.billAddress)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Automation Practice Site/input__billing_postcode'), GlobalVariable.postalCode)

WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/input_Check Payments_payment_method'))

WebUI.click(findTestObject('Pages/Checkout page/btnPlaceOrder'))

WebUI.waitForElementPresent(findTestObject('Pages/Checkout page/text_OrderReceived'), GlobalVariable.waitPresentTimeout)
WebUI.verifyElementPresent(findTestObject('Pages/Checkout page/text_OrderReceived'), 0)

WebUI.closeBrowser()

