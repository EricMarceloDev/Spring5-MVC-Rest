package dev.ericmarcelo.mvc.rest.api.v1.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListDTO {

	List<CustomerDTO> customerDTOS;
}
