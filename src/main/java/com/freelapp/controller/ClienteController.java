package it.provaTask.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;

import jakarta.validation.Valid;

import it.provaTask.repository.ClienteRepository;
import it.provaTask.model.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository repositoryCliente;
	
	
	 @GetMapping("/index")
	 public String listaClienti(Model model) {
	
		List<Cliente> listaClienti = repositoryCliente.findAll();
		model.addAttribute("list", listaClienti);
		return "index";
	}
	 
	 @GetMapping("/cliente-search")
	 public String clienteByPartitaIva(Model model, @RequestParam(name = "partitaIva", required = false) String partitaIva) {
         
		    if (partitaIva == null || partitaIva.isBlank()) {
		          return "redirect:/index";
		       }
		    else { 
		    	 
		    	   List<Cliente> listaClienti = repositoryCliente.findByPartitaIva(partitaIva);
		    	   
		    	  
		           if (listaClienti.isEmpty()) 
		    			         return "redirect:/index";     
		           else  {  
		        	   		model.addAttribute("list", listaClienti);
			    	  		return "redirect:/index/" + listaClienti.get(0).getId(); 
			                }   
		          } 
	  }	
	
	@GetMapping("/index/{id}")
	public String descrizioneCliente(@PathVariable("id") int clienteId, Model model) {
		
		model.addAttribute("cliente", repositoryCliente.getReferenceById(clienteId));
	
		return "descrizioneCliente";
	  }
	
	
	@GetMapping("/index/insert")
	public String aggiungiCliente(Model model) {
	    
	    model.addAttribute("formCliente", new Cliente());
	    
	    return "insert"; 
	}
	
	
	@PostMapping("/index/insert")
	public String storeCliente(@Valid @ModelAttribute("formCliente") Cliente formCliente, BindingResult bindingResult, Model model){
		
	   if(bindingResult.hasErrors()) {
	      return "insert";
	   }

	   repositoryCliente.save(formCliente);
	  

	   return "redirect:/index";
	}
	
	@GetMapping("/index/edit/{id}")
	public String edit(@PathVariable("id") Integer id, Model model) {
				
		model.addAttribute("formCliente", repositoryCliente.findById(id).get());
		
		return "edit";
	}
	
	
	@PostMapping("/index/edit/{id}")
	public String updateCliente (@Valid @ModelAttribute("formCliente") Cliente formCliente, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "edit";
		}
		
		repositoryCliente.save(formCliente);
		
		return "redirect:/index";
	}
	
	
	@PostMapping("/index/delete/{id}")
	public String deleteClienti(@PathVariable("id") Integer id) {
		
		repositoryCliente.deleteById(id);
		
		return "redirect:/index";
	  }
}
	

