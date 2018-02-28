package org.asapin.ds.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
@RestController
@RequestMapping("/cgi-bin")
public class CgiBin {

    /**
     * Announce message format is: [0x01, 0xF4, 0x02, 0x00, 0x00, 0x01, 0x01, announce text, 0x00]
     */
    @PostMapping("/login.spd")
    public String postRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.warn("cgi-bin");
        final InputStream stream = getClass().getClassLoader().getResourceAsStream("announce.bin");
        final byte[] bytes = IOUtils.toByteArray(stream);

        return Base64Utils.encodeToString(bytes) + "\n";
    }
}
