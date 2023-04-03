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

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/a_Account'))

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/a_Log in'))

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/b_Register'))

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Name'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Firstname'), 
    'test name')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Lastname'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Lastname'), 
    'test last name')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Email'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Email'), 
    'test1@test.com')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Address'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Address'), 
    'Chiang Mai')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Username'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_UserName'), 
    'test1')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Password'), 
    'UGzGApiBB8E=')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_ConfirmPassword'), 
    'UGzGApiBB8E=')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/span_Register'))

WebUI.click(findTestObject('Test_Register_Login/Page_Macarino  Pasta Paradise/label_Email_Login_Page'))

WebUI.setText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Login_Email'), 'test1@test.com')

WebUI.click(findTestObject('Test_Register_Login/Page_Macarino  Pasta Paradise/label_Password_Login_Page'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/input_Register_Password'), 
    'UGzGApiBB8E=')

WebUI.click(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Test_Register_Login/Page_Macarino  Pasta Paradise/a_result_Username'), 
    'test1')

WebUI.closeBrowser()

