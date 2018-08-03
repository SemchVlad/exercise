package ru.argustelecom.vsemchenko.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * |Имя	                |Тип	|Откуда данные|
 * ---------------------------------------------------------
 * |Название команды	|Текст	|
 * |Проект в Jira	    |текст	|Key-word проекта, в котором работает команда|
 * |Компонент в Jira	|текст	|Список компонентов Jira проекта команды не связанных с существующими командами|
 * |Продукты	        |список	|Список продуктов, которыми владеет команда|
 *
 * отсебятина
 * |Используемые СП 	|список |
 *
 * v.semchenko
 */
@Entity
@Table(name = "developer_team")
public class DeveloperTeam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "team_name_in_jira", nullable = false)
	private String name;

	@Column
	private String nameProjectInJira;

	@Column
	private String componentInJira;

	@Column
	private String modules;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<ApplicationServer> useAppServer;
}
