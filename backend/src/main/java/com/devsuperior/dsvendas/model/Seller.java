package com.devsuperior.dsvendas.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "TB_SELLERS")
@SequenceGenerator(allocationSize = 1, name = "seller", sequenceName = "TB_SQ_SELLER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Sale> sales = new ArrayList<>();
	
}
