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

WebUI.navigateToUrl('https://oss-workflow.netlify.app/')

WebUI.click(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/td_Absence Request'))

WebUI.click(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/button_1Timers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_Timer Key'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_Repetitions'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_Due Date'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_Element'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_Element Instance Key'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Timers/Page_OSS Workflow Engine/th_State'), 0)

