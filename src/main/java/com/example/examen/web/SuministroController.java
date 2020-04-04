package com.example.examen.web;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.examen.domain.Suministro;
import com.example.examen.service.BodegaService;
import com.example.examen.service.SuministroService;

@Controller
public class SuministroController {
	
	@Autowired
	SuministroService suministroService;
	
	@Autowired
	BodegaService bodegaService;
	
	
	  @GetMapping("/")
	  public String main() throws ParseException{
	    return "index";
	  }
	
	  @GetMapping("/listado")
	  public String goToListadoSuministros(Model model) throws ParseException{
		model.addAttribute("suministroListado", suministroService.getAllSuministros());
		model.addAttribute("bodegaListado", bodegaService.getAllBodegas());
		model.addAttribute("suministro", new Suministro());
	    return "listado";
	  }
	  
	  @GetMapping("listasuministros")
		public String listaProductos(Model model, @ModelAttribute Suministro suministro) {
			List<Suministro> suministros = suministroService.getSuministrosByBodega(suministro.getBodega());
			model.addAttribute("bodegaListado", bodegaService.getAllBodegas());
			model.addAttribute("suministroListado", suministros);
			return "listado";
		}
	  
	  @GetMapping("/data")
	  public String goToListadoSuministros() throws ParseException{
	    return "data";
	  }
	
	  @GetMapping("/registro")
	  public String gotoRegistroSuministros(Model model){
		  model.addAttribute("suministro", new Suministro());
		  model.addAttribute("bodegaListado", bodegaService.getAllBodegas());
		  return "registro";
	  }
	  
	  @PostMapping("/registro")
	  public String suministroSubmit(@ModelAttribute Suministro suministro) {
		  suministroService.saveSuministro(suministro);
		  return "index";
	  }
	   
	   @ModelAttribute("calidadList")
	   public Map<String, String> getGradoCalidadList() {
	      Map<String, String> calidadList = new HashMap<String, String>();
	      calidadList.put("A", "Máxima");
	      calidadList.put("B", "Intermedia");
	      calidadList.put("C", "Mínima");
	      return calidadList;
	   }

}