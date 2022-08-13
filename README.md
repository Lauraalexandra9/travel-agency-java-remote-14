**## Travel agency
- Technology stack
  - Angular -UI
  - Spring Boot - backend

#### Project business features - initial list
- **Registration of user/admin etc.**
  - two roles: users and administrators
  - normal user
  - sign up
- **Admin**
  - defined in application - starting approach

- **Provide all available trips**
  - travel date/time -start and end
  - destination
    - country
    - city
- **Cost**
  - per person
  - family/group discounts
- **Transport type:**
  - bus, train, plane, ferry
- **Security rules**
  - travel restrictions
  - insurance
- **Payment type**
- direct payment
- installment payment

- **Meal type**
  - Breakfast
  - Lunch
  - Dinner
  - Snacks
  - Drinks
  - HB
  - All inclusive
- **Hotel facilities**
  - apartment facilities
  - attractions 

- **Searching**
  - country selection
  - city
  - number of people
  - dates boundaries (starting/ending/no dates)
  - type of transportation

- **Map of destination**
  - possibility to select from map destination and later see available trips

- **Booking trips**
  - contact of the person who pays the trip
  - email, phone
- **Contact information**
  - name
  - surname
  - birth date
  - participants
  - nationality
  - email 
  - contact
  - gender
  - passport number


### TODO
- last/first minute offers
- reviews section
- online chat
- customer travel history + possibility to add places which you already visited
- vip/premium  customers

### Additional features
- type of the trip (business/family)
- think about more searching options (future)
  - budget
  - from where and to where in city

### Technical stories
- provide all available trips (user)
  - backend
    - create trip entity
      - tripStartDate
      - tripEndDate
      - destination (clas)
        - country
        - city
      - price
        - cost (BigDecimal)
        - currency
      - transport type (Enum)
        - bus, train, plane, ferry
      - security rules (class)
        - travel restrictions
        - Insurance
      - payment type (Enum)
        - MONEY, CARD, TRANSFER, APPLE PAY, Google Pay, Paypal, installment payment
      - meal types (Enum)
        - Breakfasts
        - Lunches
        - Dinners
        - Snacks
        - Drinks
        - HB
        - All inclusive
      - hotel facilities
        - attractions (list)
        - apartment facilities (list)
      - list of photos urls
    - trip dto
    - create TripController (REST)
      - read all trips - paging by default (default size: 10)
      - read one trip - by id
    - create TripService
    - create TripRepository
    - handle photos urls (TODO)

  - frontend
    - cards with trips
    - some photos













- last/first minute offers
- reviews section
- online chat
- customer history
- vip/premium customers
- search travel and its different parts, destination, calender, nr of people
- options for the first step when booking : family trip, solo trip , trips for seniors