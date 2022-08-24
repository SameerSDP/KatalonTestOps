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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/mobile-phones-big-saving-days-aug-22-t4r4d43-store?fm=neo%2Fmerchandising&iid=M_f2e8f0a1-6c0f-4787-9542-ad901e824b06_1_GH3WMENHG9IB_MC.H6NQY3GNQMSC&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Mobiles_H6NQY3GNQMSC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=H6NQY3GNQMSC')

WebUI.mouseOver(findTestObject('flipkart/Page_Mobile Phones Big Saving Days Aug 22 T4r4d43 Store Online - Buy Mobile Phones Big Saving Days Aug 22 T4r4d43 Online at Best Price in India  Flipkart.com/span_Electronics'))

WebUI.click(findTestObject('Page_Mobile Phones Big Saving Days Aug 22 T4r4d43 Store Online - Buy Mobile Phones Big Saving Days Aug 22 T4r4d43 Online at Best Price in India  Flipkart.com/a_Realme'))

WebUI.dragAndDropToObject(findTestObject(null), findTestObject(null))

WebUI.verifyOptionSelectedByValue(findTestObject(null), '', false, 0)

WebUI.setText(findTestObject(null), '')

