package com.studentgest.foro_service.controller;

import com.studentgest.foro_service.dto.*;
import com.studentgest.foro_service.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foro/{id}/comentar")
public class MensajeForoController {

    @Autowired
    private ForoService foroService;

    @PostMapping
    public ResponseEntity<ForoResponse> agregarMensaje(
            @PathVariable Long id,
            @RequestBody MensajeRequest request) {
        return ResponseEntity.ok(foroService.agregarMensaje(id, request));
    }
}