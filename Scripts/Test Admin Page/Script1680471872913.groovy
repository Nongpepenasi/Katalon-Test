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

WebUI.navigateToUrl('http://3.215.189.148:3000/')

WebUI.click(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/a_Account'))

WebUI.click(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/a_Log in'))

WebUI.click(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/b_click'))

WebUI.setText(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/input_login_email'), 
    'macarino@admin.camt')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/input_login_pass'), 
    'mXyJ2IiqxDRA2k6n2mj5RQ==')

WebUI.click(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/button_Login'))

WebUI.click(findTestObject('Object Repository/Test_Admin_Page/Page_Macarino  Pasta Paradise/td_result_username1'))

WebUI.closeBrowser()

