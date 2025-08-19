package com.example.application;

import com.example.infrastructure.StaffRepository;
import com.example.infrastructure.Staff;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RequestMapping("/api/staff")
@AllArgsConstructor
@RestController
public class StaffRestController {

    private final StaffRepository staffRepository;

    @GetMapping("") // path of /staff
    public Iterable<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @GetMapping("/{id}") // optional /staff/id - may not find id
    public Optional<Staff> getStaffById(@PathVariable(value = "id") Long id) {
        Optional<Staff> result = staffRepository.findById(id);
        if (result.isPresent()) {
            return result;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Staff ID not found");
        }
    }
}
