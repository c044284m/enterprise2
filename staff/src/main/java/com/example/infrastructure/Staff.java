package com.example.infrastructure;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = StaffConstants.TABLE_NAME) // Table to reference in our schema
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Staff {

    @Id
    @Column(name = StaffConstants.STAFF_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long staffId;

    @Column(name = StaffConstants.FULL_NAME)
    private String fullName;

    @Column(name = StaffConstants.EMAIL)
    private String email;

    @Column(name = StaffConstants.DEPARTMENT)
    private String department;

    @Column(name = StaffConstants.ROLE)
    private String role;

    @Column(name = StaffConstants.ANNUAL_LEAVE_ENTITLEMENT)
    private int annualLeaveEntitlement;

    @Column(name = StaffConstants.LEAVE_TAKEN)
    private int leaveTaken;

    @Column(name = StaffConstants.DATE_JOINED)
    private LocalDate dateJoined;

    @Column(name = StaffConstants.UPDATED_AT)
    private LocalDateTime updatedAt;
}
