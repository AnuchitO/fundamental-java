## Goals to build Exchanges API
    
    Sure, here's a more detailed description of each API endpoint, including payload and response body structures:
    
    **Exchanges Rate API:**
    
    **Base URL:** `https://api.example.com/exchanges`
    
    **Authentication:** API key required for all requests.
    
    1. **Get Real-time Exchanges Rates:**
        
        **Requirement:** This endpoint allows users to retrieve the latest exchanges rates for a base currency against multiple target currencies.
        
        **Method:** `GET`**URL:** `/rates`

        **Response:**
        
        **JSON**
        
        ```
        {
            "base": "USD",
            "rates": {
                "EUR": 0.95,
                "GBP": 0.85,
                "JPY": 135.00,
								"THB": 36.46
            }
        }
        
        ```
        
        **Error Codes:**
        
        - 401: Unauthorized (invalid API key)
        - 500: Internal server error
    2. **Get Historical exchanges Rates:**
        
        **Requirement:** This endpoint allows users to retrieve historical exchanges rates for a specific currency pair over a specified date range.
        
        **Method:** `GET`**URL:** `/ratess/historical`**Query Parameters:**
        
        `from: Source currency code
        to: Target currency code
        start_date: Start date in YYYY-MM-DD format
        end_date: End date in YYYY-MM-DD format`
        
        **Response:**
        
        **JSON**
        
        ```
        {
            "base": "USD",
            "rates": {
                "2023-01-01": {
                    "EUR": 0.90,
                    "GBP": 0.80,
                    "JPY": 120.00
                },
                "2023-01-02": {
                    "EUR": 0.92,
                    "GBP": 0.82,
                    "JPY": 125.00
                },
                ...
            }
        }
        
        ```
        
        **Error Codes:**
        
        - 400: Bad request (invalid query parameters)
        - 401: Unauthorized (invalid API key)
        - 500: Internal server error
    3. **Convert Currency:**
        
        **Requirement:** This endpoint allows users to convert an amount from one currency to another using the latest exchanges rates.
        
        **Method:** `POST`**URL:** `/ratess/convert`**Request Body:**
        
        **JSON**
        
        ```
        {
            "from": "Source currency code",
            "to": "Target currency code",
            "amount": "Amount to convert"
        }
        
        ```
        
        **Response:**
        
        **JSON**
        
        ```
        {
            "from": "USD",
            "to": "EUR",
            "amount": 100.00,
            "converted_amount": 95.00
        }
        
        ```
        
        **Error Codes:**
        
        - 400: Bad request (invalid request body)
        - 401: Unauthorized (invalid API key)
        - 500: Internal server error