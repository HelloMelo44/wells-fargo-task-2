# Entity Relationship Diagram



This document describes the main entity relationships in the portfolio management data model.



The project models a financial advisory system where advisors manage customers, customers own portfolios, portfolios contain investment holdings and transactions, and advisors make recommendations based on customer goals and risk profiles.



## ERD



```mermaid

erDiagram

&#x20;   ADVISOR ||--o{ CUSTOMER : manages

&#x20;   ADVISOR ||--o{ APPOINTMENT : schedules

&#x20;   ADVISOR ||--o{ RECOMMENDATION : makes



&#x20;   CUSTOMER ||--o{ PORTFOLIO : owns

&#x20;   CUSTOMER ||--o{ FINANCIAL_GOAL : has

&#x20;   CUSTOMER ||--o{ RISK_PROFILE : has

&#x20;   CUSTOMER ||--o{ APPOINTMENT : attends

&#x20;   CUSTOMER ||--o{ RECOMMENDATION : receives



&#x20;   PORTFOLIO ||--o{ PORTFOLIO_HOLDING : contains

&#x20;   PORTFOLIO ||--o{ PORTFOLIO_TRANSACTION : records



&#x20;   INVESTMENT_PRODUCT ||--o{ PORTFOLIO_HOLDING : held_as

&#x20;   INVESTMENT_PRODUCT ||--o{ PORTFOLIO_TRANSACTION : traded_as

&#x20;   INVESTMENT_PRODUCT ||--o{ RECOMMENDATION : recommended_as



&#x20;   ADVISOR {

&#x20;       Long advisor_id PK

&#x20;       String first_name

&#x20;       String last_name

&#x20;       String email

&#x20;       String phone_number

&#x20;   }



&#x20;   CUSTOMER {

&#x20;       Long customer_id PK

&#x20;       String first_name

&#x20;       String last_name

&#x20;       LocalDate date_of_birth

&#x20;       String email

&#x20;       String phone_number

&#x20;       String address

&#x20;       String employment_status

&#x20;       BigDecimal annual_income

&#x20;       String customer_status

&#x20;       Long advisor_id FK

&#x20;   }



&#x20;   PORTFOLIO {

&#x20;       Long portfolio_id PK

&#x20;       String portfolio_name

&#x20;       String portfolio_type

&#x20;       LocalDate created_date

&#x20;       BigDecimal total_value

&#x20;       String portfolio_status

&#x20;       Long customer_id FK

&#x20;   }



&#x20;   INVESTMENT_PRODUCT {

&#x20;       Long product_id PK

&#x20;       String product_name

&#x20;       String product_type

&#x20;       String provider

&#x20;       String risk_rating

&#x20;       BigDecimal expected_return

&#x20;       BigDecimal minimum_investment

&#x20;       String product_status

&#x20;   }



&#x20;   PORTFOLIO_HOLDING {

&#x20;       Long holding_id PK

&#x20;       BigDecimal quantity

&#x20;       BigDecimal purchase_price

&#x20;       BigDecimal current_value

&#x20;       LocalDate purchase_date

&#x20;       Long portfolio_id FK

&#x20;       Long product_id FK

&#x20;   }



&#x20;   PORTFOLIO_TRANSACTION {

&#x20;       Long transaction_id PK

&#x20;       String transaction_type

&#x20;       LocalDate transaction_date

&#x20;       BigDecimal quantity

&#x20;       BigDecimal amount

&#x20;       String transaction_status

&#x20;       Long portfolio_id FK

&#x20;       Long product_id FK

&#x20;   }



&#x20;   FINANCIAL_GOAL {

&#x20;       Long goal_id PK

&#x20;       String goal_type

&#x20;       BigDecimal target_amount

&#x20;       LocalDate target_date

&#x20;       String priority

&#x20;       String goal_status

&#x20;       Long customer_id FK

&#x20;   }



&#x20;   RISK_PROFILE {

&#x20;       Long risk_profile_id PK

&#x20;       String risk_level

&#x20;       String investment_experience

&#x20;       String time_horizon

&#x20;       String liquidity_needs

&#x20;       LocalDate assessment_date

&#x20;       Long customer_id FK

&#x20;   }



&#x20;   RECOMMENDATION {

&#x20;       Long recommendation_id PK

&#x20;       LocalDate recommendation_date

&#x20;       String recommendation_reason

&#x20;       String recommendation_status

&#x20;       Long advisor_id FK

&#x20;       Long customer_id FK

&#x20;       Long product_id FK

&#x20;   }



&#x20;   APPOINTMENT {

&#x20;       Long appointment_id PK

&#x20;       LocalDateTime appointment_date

&#x20;       String meeting_type

&#x20;       String meeting_notes

&#x20;       String appointment_status

&#x20;       Long advisor_id FK

&#x20;       Long customer_id FK

&#x20;   }

