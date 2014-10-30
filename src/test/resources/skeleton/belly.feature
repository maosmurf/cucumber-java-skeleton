@TT2
@GWSOfferWs
@Team3
Feature: Belly

    Scenario Outline: hungry
        When I eat "<food>"

    Examples:
        | food   |
        | cookie |
        | pizza  |
        | rotten tomatoes  |

    @XZA
    Scenario: I tag
        When I eat "veggies"
