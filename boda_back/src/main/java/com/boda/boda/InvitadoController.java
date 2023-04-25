// InvitadoController.java

package com.example.boda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvitadoController {

    @Autowired
    private InvitadoRepository invitadoRepository;

    @PostMapping("/invitados")
    public Invitado agregarInvitado(@RequestBody Invitado invitado) {
        return invitadoRepository.save(invitado);
    }
}
