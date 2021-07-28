# mac-app-todo

## Database 

### Start PostgreSQL
```shell script
docker run --name mac-postgres -p 5432:5432 -e POSTGRES_PASSWORD=password -d postgres
```

### Create Database
```sql
CREATE DATABASE mac_todo;
```
