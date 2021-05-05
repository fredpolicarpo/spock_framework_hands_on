# Hands On Spock Framework
Seed project to practice BDD and TDD using Spock Framework

# UBBabysitter
Find a babysitter and have a couple of hours of peace.

## Acceptance Tests

### Scenario 1: One Babysitter was found, and she's immediately available to the full-time service

**User Story Style**
> **As a** father/mother
> 
> **I want** to find a babysitter immediately to look after my children
> 
> **So that**, I can do other tasks in my house

**BDD Style**

> **Given** a mother seeking for a babysitter to look after her 2 children
>
> **And** she has R$ 500,00 in her wallet
> 
> **And** The children are 3 and 1 years old
> 
> **And** She needs the service for 4 hours
> 
> **And** There is a babysitter that accepts up to 3 children between 6 months and 4 years old available for 4 hours of service
> 
> **And** the service costs R$ 150,00
> 
> **When** The parents request a babysitter 
>
> **Then** The system matches the request with the available babysitter
> 
> **And** The value is discounted of the customer account
> 
> **And** The parents receive a confirmation with the details (the babysitter, the cost, and the service period)

### Scenario 2: One Babysitter was found, and she's immediately available but for part-time service

`TODO`

### Scenario 3: One Babysitter was found, and she'll be available in 2 hours for full-time service

`TODO`

### Scenario 4: One Babysitter was found, and she'll be available in 2 hours but for part-time service

`TODO`

### Scenario 3: No Babysitter was found

`TODO`

### Scenario 4: More the one babysitter were found with immediate availability and full-time service

`TODO`
