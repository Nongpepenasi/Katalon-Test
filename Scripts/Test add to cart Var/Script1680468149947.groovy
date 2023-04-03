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

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/a_Account'))

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/input_login_userEmail'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/input_Email_userPassword'), 
    'UGzGApiBB8E=')

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/button_Login'))

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/button_add-to-cart1'))

WebUI.click(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/button_add-to-cart2'))

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/a_Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_title1'), 
    title)

WebUI.verifyElementText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/span_result_description1'), 
    description)

WebUI.verifyElementText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_qty1'), 
    qty)

WebUI.verifyElementText(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_price1'), 
    price)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_title2'), title2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/span_result_description2'), description2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_qty2'), qty2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_price2'), price2)

WebUI.click(findTestObject('Object Repository/Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/a_Checkout'))

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_title_checkout_page1'), 
    title)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_qty_checkout_page1'), qty)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_price_checkout_page1'), 
    price)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_title_checkout_page2'), 
    title2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_qty_checkout_page2'), qty2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h5_result_price_checkout_page2'), 
    price2)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h4_result_total_price_checkout_page'), 
    total_price)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h4_result_total_price_checkout_page_delivery_div'), 
    total_price)

WebUI.verifyElementText(findTestObject('Test_Add_To_Cart_Function/Page_Macarino  Pasta Paradise/h3_result_final_total_price_checkout_page_delivery_div'), 
    total_price)

WebUI.closeBrowser()

