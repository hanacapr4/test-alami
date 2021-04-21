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

WebUI.comment('User Open URL')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.comment('Click Buat Akun Baru button to go to Create Account Form')

WebUI.click(findTestObject('Page_Facebook - Masuk atau Daftar/button_Buat Akun Baru'))

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_firstname'), 
    'Barbie')

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_lastname'), 
    'James')

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_email'), 
    'barbiejames@gmail.com')

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_email confirm'), 
    'barbiejames@gmail.com')

WebUI.comment('Input unsecure password')

WebUI.setEncryptedText(findTestObject('Page_Facebook - Masuk atau Daftar/input_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_day'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_month'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_year'), 
    '1998', true)

WebUI.click(findTestObject('Page_Facebook - Masuk atau Daftar/input_Perempuan_sex'))

WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/button_Daftar'))

