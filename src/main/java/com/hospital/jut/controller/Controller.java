package com.hospital.jut.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.jut.model.Model;
import com.hospital.jut.repository.Repository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")


public class Controller {

	@Autowired
	Repository repo;

	@GetMapping("/reportes")
	public ResponseEntity<List<Model>> getAllReportes(@RequestParam(required = false) String nombre) {
		try {
			List<Model> reportes = new ArrayList<Model>();

			if (nombre == null)
				repo.findAll().forEach(reportes::add);
			else
				repo.findByResponsable(nombre).forEach(reportes::add);

			if (reportes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} 

			return new ResponseEntity<>(reportes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/reportes/{id}")
	public ResponseEntity<Model> getReporteById(@PathVariable("id") long id_reporte) {

		Optional<Model> Data = repo.findById(id_reporte);

		if (Data.isPresent()) {
			return new ResponseEntity<>(Data.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/reportes")
	public ResponseEntity<Model> createReporte(@RequestBody Model model) {
		try {
			Model _model = repo.save(new Model(
					model.getResponsable(),
					model.getTipo_cargo(),
					model.getTipo_servicio(),
					model.getNo_hoja(),
					model.getFecha_hoja(),
					model.getNo_orden(),
					model.getDia_consulta(),
					model.getPrimer_nombre(),
					model.getSegundo_nombre(),
					model.getPrimer_apellido(),
					model.getSegundo_apellido(),
					model.getCui(),
					model.getNacionalidad(),
					model.getDepartamento_nac(),
					model.getMunicipio_nac(),
					model.getFecha_nac(),
					model.getLugar_poblado(),
					model.getSexo(),
					model.getOrientacion_sexual(),
					model.getIdentidad_genero(),
					model.getEstado_civil(), 
					model.getEscolaridad(),
					model.getPueblo(),
					model.getComunidad_len(),
					model.getCondicion_riesgo(),
					model.getMotivo_orientacion(),
					model.getControl_prenatal(),
					model.getSemana_gestacion(),
					model.getOrientacion_preprueba(),
					model.getResultados_tamizaje(),
					model.getResultados_prueba_vih(),
					model.getPrueba_treponemica(),
					model.getPrueba_no_treponemica(),
					model.getResultado_difucion(),
					model.getReferencia(),
					model.getUai_ref(),
					model.getObservaciones(),
					model.getDatetime()));
			return new ResponseEntity<>(_model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	

	@PutMapping("/reportes/{id}")
	public ResponseEntity<Model> updateReporte(@PathVariable("id") long id_reporte, @RequestBody Model model) {
		Optional<Model> data = repo.findById(id_reporte);

		if (data.isPresent()) {
			Model _model = data.get();
			_model.setResponsable(model.getResponsable());
			_model.setTipo_cargo(model.getTipo_cargo());
			_model.setTipo_servicio(model.getTipo_servicio());
			_model.setNo_hoja(model.getNo_hoja());
			_model.setFecha_hoja(model.getFecha_hoja());
			_model.setNo_orden(model.getNo_orden());
			_model.setDia_consulta(model.getDia_consulta());
			_model.setPrimer_nombre(model.getPrimer_nombre());
			_model.setSegundo_nombre(model.getSegundo_nombre());
			_model.setPrimer_apellido(model.getPrimer_apellido());
			_model.setSegundo_apellido(model.getSegundo_apellido());
			_model.setCui(model.getCui());
			_model.setNacionalidad(model.getNacionalidad());
			_model.setDepartamento_nac(model.getDepartamento_nac());
			_model.setMunicipio_nac(model.getMunicipio_nac());
			_model.setFecha_nac(model.getFecha_nac());
			_model.setLugar_poblado(model.getLugar_poblado());
			_model.setSexo(model.getSexo());
			_model.setOrientacion_sexual(model.getOrientacion_sexual());
			_model.setIdentidad_genero(model.getIdentidad_genero());
			_model.setEstado_civil(model.getEstado_civil());
			_model.setEscolaridad(model.getEscolaridad());
			_model.setPueblo(model.getPueblo());
			_model.setComunidad_len(model.getComunidad_len());
			_model.setCondicion_riesgo(model.getCondicion_riesgo());
			_model.setMotivo_orientacion(model.getMotivo_orientacion());
			_model.setControl_prenatal(model.getControl_prenatal());
			_model.setSemana_gestacion(model.getSemana_gestacion());
			_model.setOrientacion_preprueba(model.getOrientacion_preprueba());
			_model.setResultados_tamizaje(model.getResultados_tamizaje());
			_model.setResultados_prueba_vih(model.getResultados_prueba_vih());
			_model.setPrueba_treponemica(model.getPrueba_treponemica());
			_model.setPrueba_no_treponemica(model.getPrueba_no_treponemica());
			_model.setResultado_difucion(model.getResultado_difucion());
			_model.setReferencia(model.getReferencia());
			_model.setUai_ref(model.getUai_ref());
			_model.setObservaciones(model.getObservaciones());
			_model.setDatetime(model.getDatetime());
			return new ResponseEntity<>(repo.save(_model), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/reportes/{id}")
	public ResponseEntity<HttpStatus> deleteReporte(@PathVariable("id") long id_reporte) {
		try {
			repo.deleteById(id_reporte);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}



}