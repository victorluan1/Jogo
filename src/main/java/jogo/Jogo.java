package jogo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Jogo {
	@Id
	@GeneratedValue
	public Integer id;
	@Column
	private Date dataCadastro =new Date();
	@Temporal(value = TemporalType.TIME)
	public Integer v1;

	public Integer v2;
	public Integer v3;
	public Integer v4;
	public Integer v5;

	private Integer getid() {
		return id;
	}

	private void setid(Integer id) {
		id = id;
	}

	private Date getdataCadastro() {
		return dataCadastro;
	}

	private void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	private Integer getV1() {
		return v1;
	}

	private void setV1(Integer v1) {
		this.v1 = v1;
	}

	private Integer getV2() {
		return v2;
	}

	private void setV2(Integer v2) {
		this.v2 = v2;
	}

	private Integer getV3() {
		return v3;
	}

	private void setV3(Integer v3) {
		this.v3 = v3;
	}

	private Integer getV4() {
		return v4;
	}

	private void setV4(Integer v4) {
		this.v4 = v4;
	}

	private Integer getV5() {
		return v5;
	}

	private void setV5(Integer v5) {
		this.v5 = v5;
	}
}
