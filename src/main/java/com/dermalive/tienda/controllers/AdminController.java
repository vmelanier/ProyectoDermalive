package com.dermalive.tienda.controllers;

import java.util.List;

import javax.validation.Valid;

import com.dermalive.tienda.models.Catalogo;
import com.dermalive.tienda.panel.Catalogo.StoreCatalogoForm;
import com.dermalive.tienda.panel.Catalogo.UpdateCatalogoForm;
import com.dermalive.tienda.services.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/admin/panel")
public class AdminController {
    @Autowired
    CatalogoService catalogoService;

    @GetMapping(value="")
    public String index(ModelMap model){
        List<Catalogo> catalogo = catalogoService.all();
        model.addAttribute("catalogo", catalogo);
        return "administradores/index";
    }

    @GetMapping(value="/crear")
    public String create(){
        return "administradores/create";
    }

    @PostMapping(value = "")
    public String store(
        @Valid StoreCatalogoForm catalogoForm,
        BindingResult bindingResult,
        RedirectAttributes attributes
    ){

        if (bindingResult.hasErrors()) {
            attributes.addFlashAttribute("org.springframework.validation.BindingResult.productoForm",bindingResult);
            return "redirect:/admin/panel/crear";
            
        }

        Catalogo catalogo = new Catalogo(
        catalogoForm.getNombreProducto(),
        catalogoForm.getPrecio(),
        catalogoForm.getSucursal(),
        catalogoForm.getImagenUrl()
        );
        catalogoService.save(catalogo);

        attributes.addFlashAttribute("successMessage", "Producto creado exitosamente");

        return "redirect:/admin/panel";
}
    

    @GetMapping(value = "/{catalogoId}")
    public String edit(@PathVariable Long catalogoId, Model model) {
        
        Catalogo catalogo = catalogoService.find(catalogoId);
        model.addAttribute("catalogo", catalogo);
        return "administradores/edit";
    }

    @PostMapping(value = "/{catalogoId}")
    public String update(
        @PathVariable Long catalogoId,
        @Valid UpdateCatalogoForm catalogoForm,
        BindingResult bindingResult,
        RedirectAttributes attributes
        ){
            
            if (bindingResult.hasErrors()) {
                attributes.addFlashAttribute("org.springframework.validation.BindingResult.productoForm",bindingResult);
            return "redirect:/admin/panel/" + catalogoId;
             }
             
            Catalogo catalogo = catalogoService.find(catalogoId);
            catalogoForm.getNombreProducto();
            catalogoForm.getPrecio();
            catalogoForm.getSucursal();
            
        
            catalogoService.save(catalogo);
        
        attributes.addFlashAttribute("successMessage", "Producto actualizado exitosamente");
        return "redirect:/admin/panel";
    }
    
    @PostMapping(value = "/{catalogoId}/delete")
    public String delete(
        @PathVariable Long catalogoId,
        RedirectAttributes attributes
    ) {
        Catalogo catalogo = catalogoService.find(catalogoId);
        catalogoService.delete(catalogo);
        attributes.addFlashAttribute("successMessage", "El artículo se eliminó correctamente.");
        return "redirect:/admin/dashboard";
    }  
    }
    
    
    
    

    


