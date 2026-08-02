\# Entity Relationship Diagram



This document describes the main entity relationships in the portfolio management data model.



The project models a financial advisory system where advisors manage customers, customers own portfolios, portfolios contain investment holdings and transactions, and advisors make recommendations based on customer goals and risk profiles.



\## ERD



```mermaid

erDiagram

&#x20;   ADVISOR ||--o{ CUSTOMER : manages

&#x20;   ADVISOR ||--o{ APPOINTMENT : schedules

&#x20;   ADVISOR ||--o{ RECOMMENDATION : makes



&#x20;   CUSTOMER ||--o{ PORTFOLIO : owns

&#x20;   CUSTOMER ||--o{ FINANCIAL\_GOAL : has

&#x20;   CUSTOMER ||--o{ RISK\_PROFILE : has

&#x20;   CUSTOMER ||--o{ APPOINTMENT : attends

&#x20;   CUSTOMER ||--o{ RECOMMENDATION : receives



&#x20;   PORTFOLIO ||--o{ PORTFOLIO\_HOLDING : contains

&#x20;   PORTFOLIO ||--o{ PORTFOLIO\_TRANSACTION : records



&#x20;   INVESTMENT\_PRODUCT ||--o{ PORTFOLIO\_HOLDING : held\_as

&#x20;   INVESTMENT\_PRODUCT ||--o{ PORTFOLIO\_TRANSACTION : traded\_as

&#x20;   INVESTMENT\_PRODUCT ||--o{ RECOMMENDATION : recommended\_as



&#x20;   ADVISOR {

&#x20;       Long advisor\_id PK

&#x20;       String first\_name

&#x20;       String last\_name

&#x20;       String email

&#x20;       String phone\_number

&#x20;   }



&#x20;   CUSTOMER {

&#x20;       Long customer\_id PK

&#x20;       String first\_name

&#x20;       String last\_name

&#x20;       LocalDate date\_of\_birth

&#x20;       String email

&#x20;       String phone\_number

&#x20;       String address

&#x20;       String employment\_status

&#x20;       BigDecimal annual\_income

&#x20;       String customer\_status

&#x20;       Long advisor\_id FK

&#x20;   }



&#x20;   PORTFOLIO {

&#x20;       Long portfolio\_id PK

&#x20;       String portfolio\_name

&#x20;       String portfolio\_type

&#x20;       LocalDate created\_date

&#x20;       BigDecimal total\_value

&#x20;       String portfolio\_status

&#x20;       Long customer\_id FK

&#x20;   }



&#x20;   INVESTMENT\_PRODUCT {

&#x20;       Long product\_id PK

&#x20;       String product\_name

&#x20;       String product\_type

&#x20;       String provider

&#x20;       String risk\_rating

&#x20;       BigDecimal expected\_return

&#x20;       BigDecimal minimum\_investment

&#x20;       String product\_status

&#x20;   }



&#x20;   PORTFOLIO\_HOLDING {

&#x20;       Long holding\_id PK

&#x20;       BigDecimal quantity

&#x20;       BigDecimal purchase\_price

&#x20;       BigDecimal current\_value

&#x20;       LocalDate purchase\_date

&#x20;       Long portfolio\_id FK

&#x20;       Long product\_id FK

&#x20;   }



&#x20;   PORTFOLIO\_TRANSACTION {

&#x20;       Long transaction\_id PK

&#x20;       String transaction\_type

&#x20;       LocalDate transaction\_date

&#x20;       BigDecimal quantity

&#x20;       BigDecimal amount

&#x20;       String transaction\_status

&#x20;       Long portfolio\_id FK

&#x20;       Long product\_id FK

&#x20;   }



&#x20;   FINANCIAL\_GOAL {

&#x20;       Long goal\_id PK

&#x20;       String goal\_type

&#x20;       BigDecimal target\_amount

&#x20;       LocalDate target\_date

&#x20;       String priority

&#x20;       String goal\_status

&#x20;       Long customer\_id FK

&#x20;   }



&#x20;   RISK\_PROFILE {

&#x20;       Long risk\_profile\_id PK

&#x20;       String risk\_level

&#x20;       String investment\_experience

&#x20;       String time\_horizon

&#x20;       String liquidity\_needs

&#x20;       LocalDate assessment\_date

&#x20;       Long customer\_id FK

&#x20;   }



&#x20;   RECOMMENDATION {

&#x20;       Long recommendation\_id PK

&#x20;       LocalDate recommendation\_date

&#x20;       String recommendation\_reason

&#x20;       String recommendation\_status

&#x20;       Long advisor\_id FK

&#x20;       Long customer\_id FK

&#x20;       Long product\_id FK

&#x20;   }



&#x20;   APPOINTMENT {

&#x20;       Long appointment\_id PK

&#x20;       LocalDateTime appointment\_date

&#x20;       String meeting\_type

&#x20;       String meeting\_notes

&#x20;       String appointment\_status

&#x20;       Long advisor\_id FK

&#x20;       Long customer\_id FK

&#x20;   }

