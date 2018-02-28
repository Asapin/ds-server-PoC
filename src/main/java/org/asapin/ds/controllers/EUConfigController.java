package org.asapin.ds.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("/demons-souls-eu")
public class EUConfigController {

    @PostMapping(value = "ss.info", produces = "text/plain")
    public String info(HttpServletRequest request, HttpServletResponse response) {
        String info = "<ss>0</ss>\n" +
                "<lang2></lang2>\n" +
                "<lang5></lang5>\n" +
                "<lang6></lang6>\n" +
                "<lang7></lang7>\n" +
                "<lang8></lang8>\n" +
                "<gameurl2>http://ns1.scej-online.jp:18000/cgi-bin/</gameurl2>\n" +
                "<gameurl5>http://ns1.scej-online.jp:18000/cgi-bin/</gameurl5>\n" +
                "<gameurl6>http://ns1.scej-online.jp:18000/cgi-bin/</gameurl6>\n" +
                "<gameurl7>http://ns1.scej-online.jp:18000/cgi-bin/</gameurl7>\n" +
                "<gameurl8>http://ns1.scej-online.jp:18000/cgi-bin/</gameurl8>\n" +
                "<interval2>120</interval2>\n" +
                "<interval5>120</interval5>\n" +
                "<interval6>120</interval6>\n" +
                "<interval7>120</interval7>\n" +
                "<interval8>120</interval8>\n" +
                "<getWanderingGhostInterval>20</getWanderingGhostInterval>\n" +
                "<setWanderingGhostInterval>20</setWanderingGhostInterval>\n" +
                "<getBloodMessageNum>80</getBloodMessageNum>\n" +
                "<getReplayListNum>80</getReplayListNum>\n" +
                "<enableWanderingGhost>1</enableWanderingGhost>\n";
        return Base64Utils.encodeToString(info.getBytes());
    }
}
