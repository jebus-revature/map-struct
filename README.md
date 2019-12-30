# Getting Started

1. mvn clean install
 --To generate the MapStruct classes for DTO to entity and entity to DTO transformation.

2. Create database -- "update"

3. Run the project

4. [Swagger](http://localhost:7070/swagger-ui.html)

---

# Migration Sql

```sql 
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sur_name` varchar(255) DEFAULT NULL,
  `manager_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfemnv0llvsjg4adl4xl1m0cxv` (`manager_id`),
  CONSTRAINT `FKfemnv0llvsjg4adl4xl1m0cxv` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`)
) ENGINE=InnoDB
```

```sql 
CREATE TABLE `manager` (
  `id` bigint(20) NOT NULL,
  `level` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB
```