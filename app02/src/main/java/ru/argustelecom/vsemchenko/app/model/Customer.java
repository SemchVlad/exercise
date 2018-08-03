package ru.argustelecom.vsemchenko.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * |Имя	            |Тип	|Обяз?	|Откуда данные|
 * ---------------------------------------------------------
 * |Имя	            |Текст	|ДА	    |
 * |Имя в Jira	    |Текст	|ДА	    |
 * |Проект в Jira	|Текст	|НЕТ	|
 * |Продукты	    |список	|НЕТ	|Справочник продуктов|
 *
 * v.semchenko
 */

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "customer_name_in_jira", nullable = false)
	private String nameInJira;

	@Column
	private String nameProjectInJira;

	//private List<String> modules;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameInJira() {
		return nameInJira;
	}

	public void setNameInJira(String nameInJira) {
		this.nameInJira = nameInJira;
	}

	public String getNameProjectInJira() {
		return nameProjectInJira;
	}

	public void setNameProjectInJira(String nameProjectInJira) {
		this.nameProjectInJira = nameProjectInJira;
	}

	/*public List<String> getModules() {
		return modules;
	}

	public void setModules(List<String> modules) {
		this.modules = modules;
	}*/
}