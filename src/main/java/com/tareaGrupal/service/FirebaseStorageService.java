package com.tareaGrupal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "techshop-92cb9.firebasestorage.app";

    final String rutaSuperiorStorage = "techshop/grupo5";

    final String rutaJsonFile = "firebase";

    final String archivoJsonFile = "techshop-92cb9-firebase-adminsdk-fbsvc-68009f0cd6.json";
}
