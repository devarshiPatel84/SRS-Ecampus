package com.enext.edu.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import com.enext.edu.registration.service.BulkRegistrationService;

@Controller
public class BulkRegistrationController {
    @Autowired
    private BulkRegistrationService bulkRegistrationService;

    @GetMapping("/bulkRegistration")
    public String showUploadPage() {
        return "edu/registration/BulkRegistrationUpload";
    }

    @PostMapping("/bulkRegistration")
    public String handleFileUpload(MultipartFile file, Model model) {
        try {
            bulkRegistrationService.processBulkRegistration(file);
            model.addAttribute("message", "File processed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "Error processing file: " + e.getMessage());
        }
        return "edu/registration/BulkRegistrationUpload";
    }
}
