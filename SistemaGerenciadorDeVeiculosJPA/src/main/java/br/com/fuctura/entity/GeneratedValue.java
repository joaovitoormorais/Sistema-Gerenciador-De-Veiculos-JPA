package br.com.fuctura.entity;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

	String generator();

}
