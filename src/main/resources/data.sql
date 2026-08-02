INSERT INTO advisor (advisor_id, first_name, last_name, email, phone, address)
VALUES
(1, 'Maya', 'Patel', 'maya.patel@example.com', '+1-416-555-0101', 'Toronto, Canada'),
(2, 'Daniel', 'Brooks', 'daniel.brooks@example.com', '+1-416-555-0102', 'Mississauga, Canada');

INSERT INTO customers (
    customer_id,
    first_name,
    last_name,
    date_of_birth,
    email,
    phone_number,
    address,
    employment_status,
    annual_income,
    customer_status,
    advisor_id
)
VALUES
(1, 'Aisha', 'Khan', '1988-04-12', 'aisha.khan@example.com', '+1-416-555-0201', 'Toronto, Canada', 'Employed', 95000.00, 'Active', 1),
(2, 'Liam', 'Chen', '1992-09-30', 'liam.chen@example.com', '+1-416-555-0202', 'Markham, Canada', 'Self-employed', 120000.00, 'Active', 1),
(3, 'Noah', 'Williams', '1979-02-18', 'noah.williams@example.com', '+1-416-555-0203', 'Brampton, Canada', 'Employed', 135000.00, 'Active', 2);

INSERT INTO investment_products (
    product_id,
    product_name,
    product_type,
    provider,
    risk_rating,
    expected_return,
    minimum_investment,
    product_status
)
VALUES
(1, 'Balanced Growth Fund', 'Mutual Fund', 'NorthBridge Investments', 'Medium', 6.50, 1000.00, 'Active'),
(2, 'Canadian Equity ETF', 'ETF', 'Maple Asset Management', 'High', 8.20, 500.00, 'Active'),
(3, 'Government Bond Fund', 'Bond Fund', 'Crown Fixed Income', 'Low', 3.40, 1000.00, 'Active');

INSERT INTO portfolios (
    portfolio_id,
    portfolio_name,
    portfolio_type,
    created_date,
    total_value,
    portfolio_status,
    customer_id
)
VALUES
(1, 'Aisha Retirement Portfolio', 'Retirement', '2024-01-15', 85000.00, 'Active', 1),
(2, 'Liam Growth Portfolio', 'Growth', '2024-03-10', 125000.00, 'Active', 2),
(3, 'Noah Income Portfolio', 'Income', '2023-11-05', 210000.00, 'Active', 3);

INSERT INTO portfolio_holdings (
    holding_id,
    quantity,
    purchase_price,
    current_value,
    purchase_date,
    portfolio_id,
    product_id
)
VALUES
(1, 120.00, 50.00, 7800.00, '2024-02-01', 1, 1),
(2, 80.00, 75.00, 9200.00, '2024-04-12', 2, 2),
(3, 150.00, 40.00, 6900.00, '2023-12-01', 3, 3);

INSERT INTO portfolio_transactions (
    transaction_id,
    transaction_type,
    transaction_date,
    quantity,
    amount,
    transaction_status,
    portfolio_id,
    product_id
)
VALUES
(1, 'BUY', '2024-02-01', 120.00, 6000.00, 'Completed', 1, 1),
(2, 'BUY', '2024-04-12', 80.00, 6000.00, 'Completed', 2, 2),
(3, 'BUY', '2023-12-01', 150.00, 6000.00, 'Completed', 3, 3);

INSERT INTO financial_goals (
    goal_id,
    goal_type,
    target_amount,
    target_date,
    priority,
    goal_status,
    customer_id
)
VALUES
(1, 'Retirement', 750000.00, '2045-12-31', 'High', 'In Progress', 1),
(2, 'Home Purchase', 150000.00, '2030-06-30', 'Medium', 'In Progress', 2),
(3, 'Passive Income', 500000.00, '2038-12-31', 'High', 'In Progress', 3);

INSERT INTO risk_profiles (
    risk_profile_id,
    risk_level,
    investment_experience,
    time_horizon,
    liquidity_needs,
    assessment_date,
    customer_id
)
VALUES
(1, 'Medium', 'Intermediate', 'Long term', 'Moderate', '2024-01-20', 1),
(2, 'High', 'Advanced', 'Long term', 'Low', '2024-03-15', 2),
(3, 'Low', 'Intermediate', 'Medium term', 'High', '2023-11-10', 3);

INSERT INTO recommendations (
    recommendation_id,
    recommendation_date,
    recommendation_reason,
    recommendation_status,
    advisor_id,
    customer_id,
    product_id
)
VALUES
(1, '2024-02-10', 'Balanced fund recommended to support long-term retirement planning.', 'Accepted', 1, 1, 1),
(2, '2024-04-20', 'Equity ETF recommended for growth-oriented investment strategy.', 'Accepted', 1, 2, 2),
(3, '2023-12-12', 'Bond fund recommended to support income stability and lower risk exposure.', 'Accepted', 2, 3, 3);

INSERT INTO appointments (
    appointment_id,
    appointment_date,
    meeting_type,
    meeting_notes,
    appointment_status,
    advisor_id,
    customer_id
)
VALUES
(1, '2024-02-15 10:00:00', 'Portfolio Review', 'Reviewed retirement goals and contribution strategy.', 'Completed', 1, 1),
(2, '2024-04-25 14:30:00', 'Investment Planning', 'Discussed growth portfolio allocation.', 'Completed', 1, 2),
(3, '2024-01-10 09:00:00', 'Risk Review', 'Reviewed income needs and risk profile.', 'Completed', 2, 3);