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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/input_All_field-keywords'), 
    'imac')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/div_imac 27 inch'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com  imac 27 inch/img_Featured_s-image'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com New Apple iMac with Retina _4191f7/span_256GB'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com New Apple iMac with Retina _4191f7/i_Skip to main content_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com New Apple iMac with Retina _4191f7/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Registration/input_Your name_customerName'), 'nayem')

WebUI.setText(findTestObject('Object Repository/Page_Amazon Registration/input_Email_email'), 'mti.nayem94@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Amazon Registration/input_Your name_customerName'), 'Tarikul nayem')

WebUI.click(findTestObject('Object Repository/Page_Amazon Registration/input_Your name_customerName'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Registration/input_Your name_customerName'), 'Tarikul Nayem')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Registration/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Registration/input_Re-enter password_passwordCheck'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Amazon Registration/input_Passwords must match_continue'))

WebUI.click(findTestObject('Object Repository/Page_Amazon Registration/i_Please Enable Cookies to Continue_a-icon _df4009'))

