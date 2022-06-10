Feature: Search and place the order for products

Scenario: Search experience for product search in both home and offers page

Given User is on Greenkart landing page
When user searched with shortname "Tom" and extracted actual name of product
Then user searched for "Tom" shortname in offers page to check if product exist with same name
And Validate productname matches with Landing page
