\# Portfolio Management Data Model



\## Project Overview



This project is a Spring Boot and JPA data modelling project based on the Wells Fargo Software Engineering job simulation from Forage.



The original starter project provided the base structure. I extended the domain model to represent a more complete financial advisory system, including advisors, customers, portfolios, investment products, holdings, transactions, appointments, financial goals, risk profiles and product recommendations.



The focus of this project is backend data modelling using Java, Spring Boot and JPA.



\## Business Problem



Financial advisors need systems that can manage customer relationships, investment portfolios, financial goals, risk profiles, appointments, recommendations and transaction history.



This project models the core database entities that could support such a system.



The model answers questions such as:



\- Which advisor manages which customers?

\- Which customers own which portfolios?

\- Which investment products are held in each portfolio?

\- What transactions have taken place for a portfolio?

\- What financial goals does a customer have?

\- What is the customer's risk profile?

\- What product recommendations has an advisor made?

\- What appointments have been scheduled between advisors and customers?



\## Tools and Technologies



\- Java

\- Spring Boot

\- Spring Data JPA

\- Maven

\- H2 Database

\- IntelliJ IDEA

\- Git and GitHub



\## Main Entities



\### Advisor



Represents a financial advisor who manages customers and provides investment recommendations.



\### Customer



Represents a customer receiving financial advice. A customer belongs to an advisor and can have portfolios, goals, risk profiles, recommendations and appointments.



\### Portfolio



Represents a customer's investment portfolio. A portfolio belongs to a customer and can contain investment holdings and transactions.



\### InvestmentProduct



Represents an investment product such as a fund, stock, bond or other financial product.



\### PortfolioHolding



Represents an investment product held inside a portfolio. It tracks quantity, purchase price, current value and purchase date.



\### PortfolioTransaction



Represents buying, selling or other transaction activity linked to a portfolio and investment product.



\### FinancialGoal



Represents a customer's financial objective, including goal type, target amount, target date, priority and status.



\### RiskProfile



Represents a customer's investment risk assessment, including risk level, experience, time horizon and liquidity needs.



\### Recommendation



Represents a product recommendation made by an advisor to a customer.



\### Appointment



Represents a meeting between an advisor and a customer.



\## Entity Relationships

A more detailed Mermaid ERD is available here:

[Entity Relationship Diagram](docs/entity-relationship-diagram.md)

The main relationships are:



```text

Advisor 1 -> many Customers

Customer 1 -> many Portfolios

Customer 1 -> many FinancialGoals

Customer 1 -> many RiskProfiles

Customer 1 -> many Appointments

Customer 1 -> many Recommendations



Portfolio 1 -> many PortfolioHoldings

Portfolio 1 -> many PortfolioTransactions



InvestmentProduct 1 -> many PortfolioHoldings

InvestmentProduct 1 -> many PortfolioTransactions

InvestmentProduct 1 -> many Recommendations



Advisor 1 -> many Appointments

Advisor 1 -> many Recommendations



## How to Run

Clone the repository:

```bash
git clone https://github.com/HelloMelo44/wells-fargo-task-2.git


## API Endpoints

After starting the application, the following read-only API endpoints are available:

```text
GET /api/advisors
GET /api/advisors/{id}

GET /api/customers
GET /api/customers/{id}
GET /api/customers/{id}/portfolios
GET /api/customers/{id}/financial-goals
GET /api/customers/{id}/risk-profiles

GET /api/portfolios
GET /api/portfolios/{id}
GET /api/portfolios/{id}/holdings
GET /api/portfolios/{id}/transactions

GET /api/investment-products
GET /api/investment-products/{id}

GET /api/appointments
GET /api/appointments/{id}

GET /api/recommendations
GET /api/recommendations/{id}

GET /api/financial-goals
GET /api/financial-goals/{id}

GET /api/risk-profiles
GET /api/risk-profiles/{id}