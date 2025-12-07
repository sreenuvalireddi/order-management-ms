# Spring Boot Order Management Microservice

Spring Boot REST API microservice for order management with full CRUD operations.

## Quick Start

```bash
cd /workspaces/order-management-ms
mvn clean install
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/orders` | Get all orders |
| GET | `/api/orders/{id}` | Get order by ID |
| GET | `/api/orders/active/list` | Get active orders |
| GET | `/api/orders/search?customer=keyword` | Search orders |
| POST | `/api/orders` | Create order |
| PUT | `/api/orders/{id}` | Update order |
| DELETE | `/api/orders/{id}` | Delete order |

Service runs on `http://localhost:8084`
H2 Console: `http://localhost:8084/h2-console`
