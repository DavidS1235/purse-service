package com.nttdata.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yanki")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
/**
 * Esta clase es la encargada de exponer las funcionalidades
 */
public class ClientController {
}
