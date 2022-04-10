package com.hospital.jut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reportes")

public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_reporte;

	/**
	 * 
	 * Datos generales del reporte
	 * 
	 */
	@Column(name = "responsable", length = 50, nullable = false)
	private String responsable;

	@Column(name = "tipo_cargo", length = 50, nullable = false)
	private String tipo_cargo;

	@Column(name = "tipo_servicio", length = 50, nullable = false)
	private String tipo_servicio;

	@Column(name = "no_hoja", length = 50, nullable = false)
	private String no_hoja;

	@Column(name = "date", length = 50, nullable = false)
	private String date;

	/**
	 * 
	 * Datos de la persona a ingresar
	 * 
	 */

	@Column(name = "no_orden", length = 50, nullable = false)
	private String no_orden;

	@Column(name = "dia_consulta", length = 50, nullable = false)
	private String dia_consulta;

	@Column(name = "primer_nombre", length = 50, nullable = false)
	private String primer_nombre;
	@Column(name = "segundo_nombre", length = 50)
	private String segundo_nombre;

	@Column(name = "primer_apellido", length = 50, nullable = false)
	private String primer_apellido;
	@Column(name = "segundo_apellido")
	private String segundo_apellido;

	@Column(name = "cui", length = 13, nullable = false)
	private String cui;

	@Column(name = "nacionalidad", length = 50, nullable = false)
	private String nacionalidad;

	@Column(name = "departamento_nac", length = 50)
	private String departamento_nac;
	@Column(name = "municipio_nac", length = 50)
	private String municipio_nac;
	@Column(name = "fecha_nac", length = 50)
	private String fecha_nac;

	@Column(name = "lugar_poblado", length = 50, nullable = false)
	private String lugar_poblado;

	@Column(name = "sexo", length = 50, nullable = false)
	private String sexo;

	/**
	 * 
	 * Pruebas realizadas
	 * 
	 */

	@Column(name = "orientacion_sexual", length = 50, nullable = false)
	private String orientacion_sexual;

	@Column(name = "identidad_genero", length = 50, nullable = false)
	private String identidad_genero;

	@Column(name = "estado_civil", length = 50, nullable = false)
	private String estado_civil;

	@Column(name = "escolaridad", length = 50, nullable = false)
	private String escolaridad;

	@Column(name = "pueblo", length = 50, nullable = false)
	private String pueblo;

	@Column(name = "comunidad_len", length = 50, nullable = false)
	private String comunidad_len;

	@Column(name = "condicion_riesgo", length = 50, nullable = false)
	private String condicion_riesgo;
	@Column(name = "motivo_orientacion", length = 50, nullable = false)
	private String motivo_orientacion;
	@Column(name = "control_prenatal", length = 50, nullable = false)
	private String control_prenatal;
	@Column(name = "semana_gestacion", length = 50, nullable = false)
	private String semana_gestacion;
	@Column(name = "orientacion_preprueba", length = 50, nullable = false)
	private String orientacion_preprueba;
	@Column(name = "resultados_tamizaje", length = 50, nullable = false)
	private String resultados_tamizaje;
	@Column(name = "resultados_prueba_vih", length = 50, nullable = false)
	private String resultados_prueba_vih;
	@Column(name = "prueba_treponemica", length = 50, nullable = false)
	private String prueba_treponemica;
	@Column(name = "prueba_no_treponemica", length = 50, nullable = false)
	private String prueba_no_treponemica;
	@Column(name = "resultado_difucion", length = 50, nullable = false)
	private String resultado_difucion;
	@Column(name = "referencia", length = 50, nullable = false)
	private String referencia;
	@Column(name = "uai_ref", length = 50, nullable = false)
	private String uai_ref;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "datetime")
	private String datetime;
	
	public Model(String responsable, String tipo_cargo, String tipo_servicio, String no_hoja, String date,
			String no_orden, String dia_consulta, String primer_nombre, String segundo_nombre, String primer_apellido,
			String segundo_apellido, String cui, String nacionalidad, String departamento_nac, String municipio_nac,
			String fecha_nac, String lugar_poblado, String sexo, String orientacion_sexual, String identidad_genero,
			String estado_civil, String escolaridad, String pueblo, String comunidad_len, String condicion_riesgo,
			String motivo_orientacion, String control_prenatal, String semana_gestacion, String orientacion_preprueba,
			String resultados_tamizaje, String resultados_prueba_vih, String prueba_treponemica,
			String prueba_no_treponemica, String resultado_difucion, String referencia, String uai_ref,
			String observaciones, String datetime) {
		super();
		this.responsable = responsable;
		this.tipo_cargo = tipo_cargo;
		this.tipo_servicio = tipo_servicio;
		this.no_hoja = no_hoja;
		this.date = date;
		this.no_orden = no_orden;
		this.dia_consulta = dia_consulta;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.cui = cui;
		this.nacionalidad = nacionalidad;
		this.departamento_nac = departamento_nac;
		this.municipio_nac = municipio_nac;
		this.fecha_nac = fecha_nac;
		this.lugar_poblado = lugar_poblado;
		this.sexo = sexo;
		this.orientacion_sexual = orientacion_sexual;
		this.identidad_genero = identidad_genero;
		this.estado_civil = estado_civil;
		this.escolaridad = escolaridad;
		this.pueblo = pueblo;
		this.comunidad_len = comunidad_len;
		this.condicion_riesgo = condicion_riesgo;
		this.motivo_orientacion = motivo_orientacion;
		this.control_prenatal = control_prenatal;
		this.semana_gestacion = semana_gestacion;
		this.orientacion_preprueba = orientacion_preprueba;
		this.resultados_tamizaje = resultados_tamizaje;
		this.resultados_prueba_vih = resultados_prueba_vih;
		this.prueba_treponemica = prueba_treponemica;
		this.prueba_no_treponemica = prueba_no_treponemica;
		this.resultado_difucion = resultado_difucion;
		this.referencia = referencia;
		this.uai_ref = uai_ref;
		this.observaciones = observaciones;
		this.datetime = datetime;
	}

	public long getId_reporte() {
		return id_reporte;
	}

	public void setId_reporte(long id_reporte) {
		this.id_reporte = id_reporte;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getTipo_cargo() {
		return tipo_cargo;
	}

	public void setTipo_cargo(String tipo_cargo) {
		this.tipo_cargo = tipo_cargo;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public String getNo_hoja() {
		return no_hoja;
	}

	public void setNo_hoja(String no_hoja) {
		this.no_hoja = no_hoja;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNo_orden() {
		return no_orden;
	}

	public void setNo_orden(String no_orden) {
		this.no_orden = no_orden;
	}

	public String getDia_consulta() {
		return dia_consulta;
	}

	public void setDia_consulta(String dia_consulta) {
		this.dia_consulta = dia_consulta;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDepartamento_nac() {
		return departamento_nac;
	}

	public void setDepartamento_nac(String departamento_nac) {
		this.departamento_nac = departamento_nac;
	}

	public String getMunicipio_nac() {
		return municipio_nac;
	}

	public void setMunicipio_nac(String municipio_nac) {
		this.municipio_nac = municipio_nac;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getLugar_poblado() {
		return lugar_poblado;
	}

	public void setLugar_poblado(String lugar_poblado) {
		this.lugar_poblado = lugar_poblado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOrientacion_sexual() {
		return orientacion_sexual;
	}

	public void setOrientacion_sexual(String orientacion_sexual) {
		this.orientacion_sexual = orientacion_sexual;
	}

	public String getIdentidad_genero() {
		return identidad_genero;
	}

	public void setIdentidad_genero(String identidad_genero) {
		this.identidad_genero = identidad_genero;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}

	public String getPueblo() {
		return pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public String getComunidad_len() {
		return comunidad_len;
	}

	public void setComunidad_len(String comunidad_len) {
		this.comunidad_len = comunidad_len;
	}

	public String getCondicion_riesgo() {
		return condicion_riesgo;
	}

	public void setCondicion_riesgo(String condicion_riesgo) {
		this.condicion_riesgo = condicion_riesgo;
	}

	public String getMotivo_orientacion() {
		return motivo_orientacion;
	}

	public void setMotivo_orientacion(String motivo_orientacion) {
		this.motivo_orientacion = motivo_orientacion;
	}

	public String getControl_prenatal() {
		return control_prenatal;
	}

	public void setControl_prenatal(String control_prenatal) {
		this.control_prenatal = control_prenatal;
	}

	public String getSemana_gestacion() {
		return semana_gestacion;
	}

	public void setSemana_gestacion(String semana_gestacion) {
		this.semana_gestacion = semana_gestacion;
	}

	public String getOrientacion_preprueba() {
		return orientacion_preprueba;
	}

	public void setOrientacion_preprueba(String orientacion_preprueba) {
		this.orientacion_preprueba = orientacion_preprueba;
	}

	public String getResultados_tamizaje() {
		return resultados_tamizaje;
	}

	public void setResultados_tamizaje(String resultados_tamizaje) {
		this.resultados_tamizaje = resultados_tamizaje;
	}

	public String getResultados_prueba_vih() {
		return resultados_prueba_vih;
	}

	public void setResultados_prueba_vih(String resultados_prueba_vih) {
		this.resultados_prueba_vih = resultados_prueba_vih;
	}

	public String getPrueba_treponemica() {
		return prueba_treponemica;
	}

	public void setPrueba_treponemica(String prueba_treponemica) {
		this.prueba_treponemica = prueba_treponemica;
	}

	public String getPrueba_no_treponemica() {
		return prueba_no_treponemica;
	}

	public void setPrueba_no_treponemica(String prueba_no_treponemica) {
		this.prueba_no_treponemica = prueba_no_treponemica;
	}

	public String getResultado_difucion() {
		return resultado_difucion;
	}

	public void setResultado_difucion(String resultado_difucion) {
		this.resultado_difucion = resultado_difucion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getUai_ref() {
		return uai_ref;
	}

	public void setUai_ref(String uai_ref) {
		this.uai_ref = uai_ref;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Model [id_reporte=" + id_reporte + ", responsable=" + responsable + ", tipo_cargo=" + tipo_cargo
				+ ", tipo_servicio=" + tipo_servicio + ", no_hoja=" + no_hoja + ", date=" + date
				+ ", no_orden=" + no_orden + ", dia_consulta=" + dia_consulta + ", primer_nombre=" + primer_nombre
				+ ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido="
				+ segundo_apellido + ", cui=" + cui + ", nacionalidad=" + nacionalidad + ", departamento_nac="
				+ departamento_nac + ", municipio_nac=" + municipio_nac + ", fecha_nac=" + fecha_nac
				+ ", lugar_poblado=" + lugar_poblado + ", sexo=" + sexo + ", orientacion_sexual=" + orientacion_sexual
				+ ", identidad_genero=" + identidad_genero + ", estado_civil=" + estado_civil + ", escolaridad="
				+ escolaridad + ", pueblo=" + pueblo + ", comunidad_len=" + comunidad_len + ", condicion_riesgo="
				+ condicion_riesgo + ", motivo_orientacion=" + motivo_orientacion + ", control_prenatal="
				+ control_prenatal + ", semana_gestacion=" + semana_gestacion + ", orientacion_preprueba="
				+ orientacion_preprueba + ", resultados_tamizaje=" + resultados_tamizaje + ", resultados_prueba_vih="
				+ resultados_prueba_vih + ", prueba_treponemica=" + prueba_treponemica + ", prueba_no_treponemica="
				+ prueba_no_treponemica + ", resultado_difucion=" + resultado_difucion + ", referencia=" + referencia
				+ ", uai_ref=" + uai_ref + ", observaciones=" + observaciones + ", datetime=" + datetime + "]";
	}

	public Model() {
		super();
	}

	
	
}
