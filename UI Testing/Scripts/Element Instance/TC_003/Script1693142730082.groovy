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

WebUI.click(findTestObject('Object Repository/Page_OSS Workflow Engine/Selected Projects'))

WebUI.click(findTestObject('Object Repository/Page_OSS Workflow Engine/Button Element Instance'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Link To Project'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Column Element'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Column Element Instance Key'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Column Scope Key'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Column State'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OSS Workflow Engine/Column Start Time'), 0)

WebUI.click(findTestObject('Object Repository/Page_OSS Workflow Engine/Column End Time'))

WebUI.closeBrowser()
