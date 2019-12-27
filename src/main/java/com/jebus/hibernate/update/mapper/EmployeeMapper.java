package com.jebus.hibernate.update.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.jebus.hibernate.update.dto.EmployeeDto;
import com.jebus.hibernate.update.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	@Mappings({ @Mapping(target = "employeeId", source = "entity.id"),
			@Mapping(target = "managerId", source = "entity.manager.id"),
			@Mapping(target = "managerName", source = "entity.manager.name"),
			@Mapping(target = "managerLevel", source = "entity.manager.level") })
	EmployeeDto employeeToEmployeeDTO(Employee entity);

	@Mappings({ @Mapping(target = "id", source = "dto.employeeId"),
	@Mapping(target = "manager.id", source = "dto.managerId"),
			@Mapping(target = "manager.name", source = "dto.managerName"),
			@Mapping(target = "manager.level", source = "dto.managerLevel") })
	Employee employeeDTOtoEmployee(EmployeeDto dto);
}
