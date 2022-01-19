/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.APP;

/**
 *
 * @author Gaston
 */
class Examen {
  public String geringoso(String palabra) {
      String resultado = palabra;
      resultado = resultado.replaceAll("a","apa").replaceAll("e","epe").replaceAll("i","ipi").replaceAll("o","opo").replaceAll("u","upu");


      return resultado;

  }
}