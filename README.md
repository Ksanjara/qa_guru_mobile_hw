# Automated mobile tests for [Wikipedia](https://www.wikipedia.org/) mobile app
<p align="center">
<a href="https://ru.wikipedia.org/"><img title="https://ru.wikipedia.org/" src="media/screens/wikipedia.jpg"></a>
</p>
## :page_with_curl: Content:

- <a href="#tools"> Instruments used</a>
- <a href="#checking"> Test cases</a>
- <a href="#console"> How to run tests using command line</a>
- <a href="#jenkins"> Jenkins build</a>
- <a href="#report"> Allure report</a>
- <a href="#testops"> Integration with AllureTestOps</a>
- <a href="#tg"> Telegram notifications using chat bot</a>
- <a href="#browserstack"> Test run video</a>
---

<a id="tools"></a>
## 🔨 Instruments used:


| Java                                                                                                    | IntelliJ  <br>  Idea                                                                                                      | GitHub                                                                                                     | JUnit 5                                                                                                          | Gradle                                                                                                    | Allure <br> Report                                                                                                                | Appium                                                                                                   | Browserstack                                                                                                                                       | Jenkins                                                                                                         | Telegram                                                                                                         |                                                                                               Allure <br> TestOps |
|:--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  | <a href="https://github.com/allure-framework"><img src="media/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>  | <a href="https://appium.io//"><img src="media/logo/Appium.png" width="50" height="50" alt="Appium"/></a> | <a href="https://www.browserstack.com/"> <center> <img src="media/logo/Browserstack.svg" width="50" height="50" alt="Browserstack"/></a> </center> | <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/></a> | <a href="https://qameta.io/"><img src="media/logo/AllureTestOps.svg" width="50" height="50" alt="Allure_TO"/></a> |

Autotests are created using `Java` programming language with plugins: `JUnit 5`, `Selenide`, `Appium`. Project builder - `Gradle`. For remote build job in `Jenkins` created with creating `Allure Report` at the end of the testing run.
After all tests when Allure Report is ready there are `Telegram notifications` using chat bot realized.
Autotests may be launched locally using `Android Studio` or remotely using `Browserstack` service.


---

<a id="checking"></a>
## :male_detective:: Test Cases

**Local test cases**:
- ✓ Check Onboarding screens
- ✓ Save article
- ✓ Testing of search

**Remote test cases**:
- ✓ Check that query response is not empty
- ✓ Open first result of query
- ✓ Check article short description

<a id="console"></a>
### :compass: How to run tests using command line
**Local launch:**

`gradle clean local_test`

**Remote launch:**

`gradle clean remote_test -DdeviceHost=browserstack
-Dlogin=${BROWSERSTACK_LOGIN}
-Dpassword=${BROWSERSTACK_KEY}`

Where:
- ${BROWSERSTACK_LOGIN} - browserstack username
- ${BROWSERSTACK_KEY} - browserstack integration key

Not required parameters:
- `-DdeviceModel=${DEVICE}` - model of emulated device (default value is "Google Pixel 7")
- `-DosVersion=${OS_VERSION}` - os version of device (default value is "13.0")


---

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> <a target="_blank" href="https://jenkins.autotests.cloud/job/C31-ksanjara-java_20_bs_mobile/"> Jenkins</a> build
To run this test through Jenkins, please use this [job](https://jenkins.autotests.cloud/job/C31-ksanjara-java_20_bs_mobile/), specially created for this project.
To run it please use `Build with Parameters` button, default credentials are set.
You can see the results via Allure Reports by clicking on Allure icon near build.

<p align="center">
<img src="media/screens/Jenkins.png" alt="Allure report" >
</p>

---

<a id="report"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/> [Allure](https://jenkins.autotests.cloud/job/C31-ksanjara-java_23_diploma-api-tests/) Report

### 🖨️ Report main page

<p align="center">
<img src="media/screens/Allure_report_main.png" alt="Allure report">
</p>

### 📄 Test cases page

<p align="center">
<img src="media/screens/Allure_report_cases.png" alt="Test Case">
</p>

---

<a id="tg"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/> Telegram notifications



### Notification example in telegram channel

<p align="center">
<img src="media/screens/Telegram_notif.png" alt="Telegram notification">
</p>


#### Telegram notification contains:

- :heavy_check_mark: Environment
- :heavy_check_mark: Comment
- :heavy_check_mark: Duration
- :heavy_check_mark: Total scenarios
- :heavy_check_mark: Total passed tests
- :heavy_check_mark: Total failed tests
- :heavy_check_mark: Total broken tests
- :heavy_check_mark: Allure Report link

---

<a id="testops"></a>
## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/logo/AllureTestOps.svg"> [Allure TestOps](https://allure.autotests.cloud/project/4624/test-cases/36473?treeId=0) integration

### Dashboard
<p align="center">
<img src="media/screens/Allure_testops_dasboard.png">
</p>

### Test cases
<p align="center">
<img src="media/screens/Allure_testops_tests.png">
</p>

### Create automated run from Allure TestOps
<p align="center">
<img src="media/screens/Allure_testops_run.png">
</p>

<a id="browserstack"></a>
## <img alt="Browserstack" height="25" src="media/logo/Browserstack.svg" width="25"/></a> Video example from Browserstack

For every test in Allure Report video is attached.
<p align="center">
  <img title="Selenoid Video" src="media/screens/video.gif">
</p>
