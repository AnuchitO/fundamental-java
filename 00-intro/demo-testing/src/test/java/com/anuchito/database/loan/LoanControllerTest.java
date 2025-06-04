package com.anuchito.database.loan;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.MockitoAnnotations.openMocks;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class LoanControllerTest {

    private MockMvc mockMvc;

    @Mock
    private LoanService loanService;

    private LoanController loanController;

    private Loan testLoan;

    @BeforeEach
    void setUp() {
        openMocks(this);

        testLoan = new Loan();
        testLoan.setId(1L);
        testLoan.setLoanId("L001");
        testLoan.setApplicantName("John Doe");
        testLoan.setLoanAmount(10000.00);
        testLoan.setLoanTerm(12);
        testLoan.setInterestRate(5.5);
        testLoan.setStatus("PENDING");

        loanController = new LoanController(loanService);
        mockMvc = MockMvcBuilders.standaloneSetup(loanController).build();
    }

    @Test
    void testGetAllLoans() throws Exception {
        when(loanService.getAllLoans()).thenReturn(java.util.List.of(testLoan));

        mockMvc.perform(get("/api/loans"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("[0].id").value(testLoan.getId()))
                .andExpect(jsonPath("[0].applicantName").value(testLoan.getApplicantName()));
    }

    @Test
    void testGetLoanById_ExistingLoan() throws Exception {
        when(loanService.getLoanById(anyLong())).thenReturn(Optional.of(testLoan));

        mockMvc.perform(get("/api/loans/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("id").value(testLoan.getId()))
                .andExpect(jsonPath("applicantName").value(testLoan.getApplicantName()));
    }

    @Test
    void testGetLoanById_NonExistingLoan() throws Exception {
        when(loanService.getLoanById(anyLong())).thenReturn(Optional.empty());

        mockMvc.perform(get("/api/loans/999"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testCreateLoan() throws Exception {
        when(loanService.saveLoan(any(Loan.class))).thenReturn(testLoan);

        mockMvc.perform(post("/api/loans")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"applicantName\":\"John Doe\",\"loanAmount\":10000.00,\"loanTerm\":12,\"interestRate\":5.5,\"status\":\"PENDING\"}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("applicantName").value(testLoan.getApplicantName()));
    }

    @Test
    void testUpdateLoan() throws Exception {
        // Create a copy of testLoan with updated values
        Loan updatedLoan = new Loan();
        updatedLoan.setId(1L);
        updatedLoan.setLoanId("L001");
        updatedLoan.setApplicantName("John Doe");
        updatedLoan.setLoanAmount(15000.00);
        updatedLoan.setLoanTerm(24);
        updatedLoan.setInterestRate(5.5);
        updatedLoan.setStatus("APPROVED");

        when(loanService.getLoanById(anyLong())).thenReturn(Optional.of(testLoan));
        when(loanService.saveLoan(any(Loan.class))).thenReturn(updatedLoan);

        mockMvc.perform(put("/api/loans/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"applicantName\":\"John Doe\",\"loanAmount\":15000.00,\"loanTerm\":24,\"interestRate\":5.5,\"status\":\"APPROVED\"}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("status").value("APPROVED"));
    }

    @Test
    void testUpdateLoan_NonExistingLoan() throws Exception {
        when(loanService.getLoanById(anyLong())).thenReturn(Optional.empty());

        mockMvc.perform(put("/api/loans/999")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"applicantName\":\"John Doe\",\"loanAmount\":15000.00,\"loanTerm\":24,\"interestRate\":5.5,\"status\":\"APPROVED\"}")
            )
            .andExpect(status().isNotFound());
    }

    @Test
    void testPartialUpdateLoan() throws Exception {
        when(loanService.getLoanById(anyLong())).thenReturn(Optional.of(testLoan));
        when(loanService.saveLoan(any(Loan.class))).thenReturn(testLoan);

        mockMvc.perform(patch("/api/loans/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"status\":\"APPROVED\"}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("status").value("APPROVED"));
    }

    @Test
    void testPartialUpdateLoan_NonExistingLoan() throws Exception {
        when(loanService.getLoanById(anyLong())).thenReturn(Optional.empty());

        mockMvc.perform(patch("/api/loans/999")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"status\":\"APPROVED\"}")
            )
            .andExpect(status().isNotFound());
    }
}
