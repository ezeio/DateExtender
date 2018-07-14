Feature: extend the current date by the number provided


  Scenario Outline: a number is provided, and the current date is extended by the provided number
    Given I have a valid "<day>" "<month>" "<year>" that make up a date
    When I provide a "<number>" to extend the current date
    Then "<dayAfter>" "<monthAfter>" "<yearAfter>" should be valid

      #dayAfter, monthAfter and yearAfter are variables used to track the date after extension
    Examples:
      | day | month | year | number | dayAfter | monthAfter | yearAfter |
      | 1   | 1     | 2018 | 5      | 6        | 1          | 2018      |
      | 31  | 1     | 2018 | 1      | 1        | 2          | 2018      |
      | 25  | 2     | 2018 | 6      | 3        | 3          | 2018      |
      | 25  | 12    | 2018 | 7      | 1        | 1          | 2019      |
      | 30  | 6     | 2018 | 1      | 1        | 7          | 2018      |