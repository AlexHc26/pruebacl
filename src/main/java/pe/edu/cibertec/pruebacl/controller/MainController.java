package pe.edu.cibertec.pruebacl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calcularSalario")
    public String calcularSalario(@RequestParam("horas") int horas, Model model) {
        double salario = 0;
        if (horas <= 40) {
            salario = horas * 16;
        } else {
            salario = 40 * 16 + (horas - 40) * 20;
        }
        model.addAttribute("salario", salario);
        return "salario";
    }

    @PostMapping("/calcularPromedio")
    public String calcularPromedio(@RequestParam("nota1") double nota1,
                                   @RequestParam("nota2") double nota2,
                                   @RequestParam("nota3") double nota3,
                                   @RequestParam("nota4") double nota4,
                                   Model model) {
        double[] notas = {nota1, nota2, nota3, nota4};
        Arrays.sort(notas);
        double promedio = (notas[1] + notas[2] + notas[3]) / 3;
        model.addAttribute("notaEliminada", notas[0]);
        model.addAttribute("promedio", promedio);
        return "promedio";
    }

    @PostMapping("/convertirSegundos")
    public String convertirSegundos(@RequestParam("segundos") int segundos, Model model) {
        int minutos = segundos / 60;
        model.addAttribute("minutos", minutos);
        return "segundos";
    }

    @PostMapping("/sumaSerie")
    public String sumaSerie(@RequestParam("limite") int limite, Model model) {
        int suma = 0;
        for (int i = 1; i <= limite; i++) {
            suma += i;
        }
        model.addAttribute("suma", suma);
        return "serie";
    }

    @GetMapping("/cuadradoMitad")
    public String cuadradoMitad(Model model) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 15; i <= 70; i++) {
            double cuadrado = Math.pow(i, 2);
            double mitad = i / 2.0;
            resultado.append("Número: ").append(i)
                    .append(" | Cuadrado: ").append(cuadrado)
                    .append(" | Mitad: ").append(mitad)
                    .append("<br>");
        }
        model.addAttribute("resultado", resultado.toString());
        return "cuadradoMitad";
    }
}
