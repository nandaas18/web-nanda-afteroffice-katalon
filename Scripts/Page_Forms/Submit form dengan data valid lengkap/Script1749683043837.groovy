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
import com.kms.katalon.core.testobject.ObjectRepository as OR
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('https://demoqa.com/')

WebUI.scrollToElement(findTestObject('Page_Forms/select_Forms'), 0)

WebUI.click(findTestObject('Page_Forms/select_Forms'))

WebUI.click(findTestObject('Page_Forms/select_Practice Form'))

WebUI.verifyElementVisible(findTestObject('Page_Forms/lbl_practiceForm'))

WebUI.setText(findTestObject('Page_Forms/input_firstName'), 'Nanda')

WebUI.setText(findTestObject('Page_Forms/input_lastName'), 'Al Fatihah')

WebUI.scrollToElement(findTestObject('Page_Forms/input_Email'), 0)

WebUI.setText(findTestObject('Page_Forms/input_Email'), 'nandaalfatihahsusanto@gmail.com')

WebUI.click(findTestObject('Page_Forms/radio_Female'))

WebUI.setText(findTestObject('Page_Forms/input_Mobile'), '0852170735')

WebUI.click(findTestObject('Page_Forms/input_dateOfBirthInput'))

WebUI.click(findTestObject('Page_Forms/select_2001'))

WebUI.click(findTestObject('Page_Forms/select_Juni'))

WebUI.scrollToElement(findTestObject('Page_Forms/input_dateOfBirthInput'), 0)

WebUI.click(findTestObject('Page_Forms/select_tgl18'))

WebUI.sendKeys(findTestObject('Page_Forms/select_Subjects'), 'Computer Science')

WebUI.sendKeys(findTestObject('Page_Forms/select_Subjects'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Forms/chk_Sports'))

String filePath = RunConfiguration.getProjectDir() + '/Include/files/profile.jpg'

WebUI.uploadFile(findTestObject('Page_Forms/input_Picture'), filePath)

WebUI.setText(findTestObject('Page_Forms/input_currentAddress'), 'Jl. Braga No. 12 Bandung Jawa Barat 41111')

WebUI.scrollToElement(findTestObject('Page_Forms/dropdown_State'), 0)

WebUI.sendKeys(findTestObject('Page_Forms/dropdown_State'), 'ncr')

WebUI.sendKeys(findTestObject('Page_Forms/dropdown_State'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Page_Forms/dropdown_City'), 0)

WebUI.sendKeys(findTestObject('Page_Forms/dropdown_City'), 'delhi')

WebUI.sendKeys(findTestObject('Page_Forms/dropdown_City'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Forms/btn_Submit'))

WebUI.verifyElementVisible(findTestObject('Page_Forms/lbl_formSubmit'))

WebUI.scrollToElement(findTestObject('Page_Forms/btn_closeFormSubmit'), 0)

//WebUI.executeJavaScript("""
//  document.querySelectorAll('iframe[src*="googlesyndication"]').forEach(el => el.remove());
//""", null)
// Hapus semua elemen iklan dari Google Ads
WebUI.executeJavaScript('\n//   Hapus iframe iklan\n  document.querySelectorAll(\'iframe[src*="googlesyndication"]\').forEach(el => el.remove());\n\n  // Hapus container div dari iklan\n  document.querySelectorAll(\'div[id*="google_ads_iframe"]\').forEach(el => el.remove());\n', 
    null)

WebUI.click(findTestObject('Page_Forms/btn_closeFormSubmit'))

WebUI.closeBrowser()

