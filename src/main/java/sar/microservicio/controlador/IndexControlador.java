package sar.microservicio.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sar.microservicio.entry.McEntry;
import sar.microservicio.servicio.McService;


@Controller
public class IndexControlador {
    String dataTransf ="";
    @Autowired
    McService serviceMc;


    @GetMapping("/return")
    public String viewForm(Model model)throws InterruptedException {
        McEntry resultObt = new McEntry();
        model.addAttribute("entryResult", dataTransf);
        return "index";
    }

    @PostMapping("/text")
    public String processForm(@ModelAttribute McEntry entry) {
        dataTransf = serviceMc.processText(entry.getNombre());
        return "redirect:/return";
    }
}
