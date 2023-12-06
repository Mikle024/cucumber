package ru.netology.qa.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.qa.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private SelenideElement codeField = $("[data-test-id='code'] input");
    private SelenideElement codeButton = $("[data-test-id='action-verify'] .button__text");

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    public DashboardPage validVerify(DataHelper.VerificationCode verificationCode) {
        codeField.setValue(verificationCode.getCode());
        codeButton.click();
        return new DashboardPage();
    }
}
