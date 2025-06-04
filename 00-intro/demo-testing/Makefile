HOST ?= http://localhost:8080

# Create a test loan
.PHONY: create-loan
create-loan:
	curl -X POST $(HOST)/api/loans \
	  -H "Content-Type: application/json" \
	  -d '{"loanId": "L001", "applicantName": "John Doe", "loanAmount": 10000.00, "loanTerm": 12, "interestRate": 5.5, "status": "PENDING"}'

# Get all loans
.PHONY: get-loans
get-loans:
	curl -X GET $(HOST)/api/loans

# Get loan by ID (replace with actual loanId after creating)
.PHONY: get-loan
get-loan:
	curl -X GET $(HOST)/api/loans/1

# Filter loans by name
.PHONY: filter-name
filter-name:
	curl -X GET "$(HOST)/api/loans?name=John"

# Filter loans by amount
.PHONY: filter-amount
filter-amount:
	curl -X GET "$(HOST)/api/loans?amount=10000"

# Filter loans by term
.PHONY: filter-term
filter-term:
	curl -X GET "$(HOST)/api/loans?term=12"

# Filter loans by status
.PHONY: filter-status
filter-status:
	curl -X GET "$(HOST)/api/loans?status=PENDING"

# Filter loans by multiple parameters
.PHONY: filter-all
filter-all:
	curl -X GET "$(HOST)/api/loans?name=John&amount=10000&term=12&status=PENDING"

# Update loan (replace with actual loanId after creating)
.PHONY: update-loan
update-loan:
	curl -X PUT $(HOST)/api/loans/1 \
	  -H "Content-Type: application/json" \
	  -d '{"loanId": "L001", "applicantName": "John Doe", "loanAmount": 15000.00, "loanTerm": 24, "interestRate": 5.5, "status": "APPROVED"}'

# Partial update loan (replace with actual loanId after creating)
.PHONY: patch-loan
patch-loan:
	curl -X PATCH $(HOST)/api/loans/1 \
	  -H "Content-Type: application/json" \
	  -d '{"status": "APPROVED"}'

# Delete loan (replace with actual loanId after creating)
.PHONY: delete-loan
delete-loan:
	curl -X DELETE $(HOST)/api/loans/1

# Run all tests
.PHONY: test-all
test-all: create-loan get-loans get-loan filter-name filter-amount filter-term filter-status filter-all update-loan patch-loan delete-loan
