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

WebUI.comment('Open URL')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.comment('Click button Buat Akun Baru to go to Registration form')

WebUI.click(findTestObject('Page_Facebook - Masuk atau Daftar/button_Buat Akun Baru'))

WebUI.comment('Input registration form with valid data')

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_firstname'), firstname)

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_lastname'), lastname)

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_email'), email_notelp)

WebUI.setText(findTestObject('Page_Facebook - Masuk atau Daftar/input_email confirm'), email_notelp_confirmation)

WebUI.setEncryptedText(findTestObject('Page_Facebook - Masuk atau Daftar/input_password'), password)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_Tanggal'), day, true)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_Bulan'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Masuk atau Daftar/select_Tahun'), year, true)

WebUI.click(findTestObject('Page_Facebook - Masuk atau Daftar/input_Perempuan_sex'))

WebUI.click(findTestObject('Page_Facebook - Masuk atau Daftar/button_Daftar'))

WebUI.comment('Apabila emailnya diganti dengan email yg aktif maka scenario ini akan berhasil create fb account akan tetapi QA tidak memiliki email yg sedang aktif untuk didaftarkan di fb')

WebUI.verifyElementText(findTestObject('Page_Facebook/span_Akun Anda Telah Dinonaktifkan'), 'Akun Anda Telah Dinonaktifkan')

