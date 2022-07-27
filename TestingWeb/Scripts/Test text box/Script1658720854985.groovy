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

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Full Name_userName'), 'Koswara')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail'), 'test@email.com')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Current Address_currentAddress'), 'Kuningan')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 'Kuningan')

WebUI.scrollToElement(findTestObject('Object Repository/Page_ToolsQA/btn_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/btn_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/p_NameKoswara'), 'Name:Koswara')

WebUI.verifyElementText(findTestObject('Object Repository/Page_ToolsQA/p_Emailtestemail.com'), 'Email:test@email.com')

WebUI.verifyElementText(findTestObject('Page_ToolsQA/p_Current Address kuningan'), 'Current Address :Kuningan')

WebUI.closeBrowser()

