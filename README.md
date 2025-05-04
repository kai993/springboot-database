# Spring Boot + PostgreSQL

```bash
# Database
db1=# select * from tbl1;
 id | name
----+-------
  1 | test1
  2 | test2
  3 | test3
(3 行)

# Application
❯ curl -s http://localhost:8080/api/data | jq .
[
  {
    "id": 1,
    "name": "test1"
  },
  {
    "id": 2,
    "name": "test2"
  },
  {
    "id": 3,
    "name": "test3"
  }
]
```

