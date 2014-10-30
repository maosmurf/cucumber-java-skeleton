package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdefs
{
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable
    {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I eat (.*)$")
    public void iEatFood(String food) throws Throwable
    {
        if (food.contains("rotten"))
        {
            throw new AssertionError("Won't eat this: " + food);
        }

        System.out.println(String.format("I eat %s", food));
    }

    @When("^I \"([^\"]*)\" a button$")
    public void I_a_button(String action) throws Throwable
    {
        System.out.println(String.format("I %s a button", action));
    }
}
