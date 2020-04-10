package com.eloisapaz.csvpoc.api;

import com.eloisapaz.csvpoc.dto.FrutaResponse;
import com.eloisapaz.csvpoc.service.CsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class CsvController {

    @Autowired
    private CsvService csvService;

    @PostMapping(value = "/poc-csv")
    public ResponseEntity<List<FrutaResponse>> uploadCSV(@RequestParam("csv") MultipartFile multipartFile) throws Exception {
        List<FrutaResponse> frutaResponseList = csvService.readCsv(multipartFile);

        return new ResponseEntity<List<FrutaResponse>>(frutaResponseList, HttpStatus.OK);
    }
}
