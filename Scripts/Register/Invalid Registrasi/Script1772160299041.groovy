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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/Register Page/Page_Register/input_Login_signatory_first_name'), 'Dwi')

WebUI.setText(findTestObject('Object Repository/Register Page/Page_Register/input_Login_signatory_last_name'), 'Sasmita')

WebUI.comment('menginputkan invalid email')

WebUI.setText(findTestObject('Register Page/Page_Register/input_Login_email'), 'dwitest3@gmail')

WebUI.setEncryptedText(findTestObject('Object Repository/Register Page/Page_Register/input_Login_password'), 'DwTTIjmC6TIqI0nNVwH37A==')

WebUI.setText(findTestObject('Object Repository/Register Page/Page_Register/input_Login_name'), 'Pranala Ragam Karya')

WebUI.setText(findTestObject('Object Repository/Register Page/Page_Register/input_land Islands_form-control btn-log bor_48151b'), 
    '821123345612')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register Page/Page_Register/select_Your country                        _da403c'), 
    '9', true)

WebUI.setText(findTestObject('Object Repository/Register Page/Page_Register/input_land Islands_state'), 'Yogyakarta')

WebUI.click(findTestObject('Object Repository/Register Page/Page_Register/input_By clicking this box, I accept the,an_f76ab8'))

WebUI.comment('Menampilkan validasi Invalid Email')

WebUI.verifyElementPresent(findTestObject('Register Page/Invalid Data/div_Invalid email format (1)'), 0)

WebUI.takeFullPageScreenshot('')

WebUI.closeBrowser()

