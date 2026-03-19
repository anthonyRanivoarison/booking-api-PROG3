# Booking API — PROG3

A Spring Boot REST API project built as part of the PROG3 course,
implementing a hotel room reservation system.

---
## Endpoints

| Method | Route | Description |
|---|---|---|
| GET | `/booking` | Retrieve all reservations stored in memory |
| POST | `/booking` | Create a new reservation |

## How to run
```bash
./mvnw spring-boot:run
```

---

## Test with cURL

**Get all bookings:**
```bash
curl http://localhost:8080/booking
```

**Create a booking:**
```bash
curl -X POST http://localhost:8080/booking \
  -H "Content-Type: application/json" \
  -d "{\"clientName\": \"Jean Dupont\", \"phoneNumber\": \"0612345678\", \"email\": \"jean@gmail.com\", \"roomNumber\": 3, \"roomDescription\": \"Chambre vue mer\", \"bookingDate\": \"2025-09-05\"}"
```
