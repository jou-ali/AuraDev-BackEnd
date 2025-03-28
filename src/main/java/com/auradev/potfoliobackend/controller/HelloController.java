package com.auradev.potfoliobackend.controller;

import
org.springframework.web.bind.annotation.GetMapping;
import
org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
 @GetMapping("/hello")
 public String hello() {
 return "Hello, World!";
 }

 @GetMapping("/home")
 public String home() {
 return "Home Page";
 }
}
