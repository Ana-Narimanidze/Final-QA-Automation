package ge.skillwill.qatest.steps.contact;

import ge.skillwill.qatest.pages.contact.ContactPage;

public class ContactSteps {

    private final ContactPage contactPage =
            new ContactPage();

    public void fillContactForm(
            String name,
            String email,
            String phone,
            String comment) {

        contactPage.enterName(name);
        contactPage.enterEmail(email);
        contactPage.enterPhone(phone);
        contactPage.enterComment(comment);
    }

    public void submitForm() {
        contactPage.clickSubmitButton();
    }

    public String getServerErrorMessage() {
        return contactPage
                .getServerErrorMessage()
                .getText();
    }
}