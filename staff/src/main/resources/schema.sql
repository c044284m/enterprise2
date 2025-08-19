CREATE TABLE staff (
    staff_id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(50),
    role VARCHAR(20) CHECK (role IN ('staff', 'manager', 'admin')) NOT NULL,
    annual_leave_entitlement INT DEFAULT 28,
    leave_taken INT DEFAULT 0,
    date_joined DATE,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);