\## Backend API and Testing Improvements



\### Added

\- Added JPA repository interfaces for all portfolio management entities.

\- Added H2 in-memory database configuration.

\- Added sample seed data for advisors, customers, portfolios, investment products, holdings, transactions, goals, risk profiles, recommendations, and appointments.

\- Added read-only REST API controllers.

\- Added DTO response classes to return cleaner API responses.

\- Added Spring Boot application context test.

\- Added repository seed data test.

\- Added MockMvc controller tests for advisor and portfolio endpoints.



\### Changed

\- Updated the project from a static data model into a runnable Spring Boot backend API.

\- Updated API responses to avoid exposing deeply nested JPA entity graphs.

\- Updated README with setup, H2 console, API, DTO, and testing documentation.



\### Fixed

\- Fixed H2 shutdown warning by updating the database connection URL.

