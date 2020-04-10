package com.eloisapaz.csvpoc.service;

import com.eloisapaz.csvpoc.dto.FrutaResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

@Service
public class CsvService {

    public List<FrutaResponse> readCsv(MultipartFile multipartFile) throws IOException {
        List<FrutaResponse> frutaResponseList = new LinkedList<>();
        Reader reader = new InputStreamReader(multipartFile.getInputStream());
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .withIgnoreHeaderCase()
                .withTrim());

        for (CSVRecord csvRecord : csvParser) {
            FrutaResponse fruta = new FrutaResponse();
            // Accessing values by Header names
            fruta.setNome(csvRecord.get("nome"));
            fruta.setQuantidade(Integer.parseInt(csvRecord.get("quantidade")));
            fruta.setCalorias(csvRecord.get("calorias"));
            fruta.setCarboidratos(csvRecord.get("carboidratos"));
            fruta.setProteinas(csvRecord.get("proteinas"));
            fruta.setGordurasTotais(csvRecord.get("gordurasTotais"));
            fruta.setGordurasSaturadas(csvRecord.get("gordurasSaturadas"));
            fruta.setFibraAlimentar(csvRecord.get("fibraAlimentar"));
            fruta.setSodio(csvRecord.get("sodio"));

            frutaResponseList.add(fruta);
        }

        return frutaResponseList;
    }
}
