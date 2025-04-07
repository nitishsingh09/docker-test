package com.file.controller;
import com.file.dto.Book;
//import com.file.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/files")
public class AssignmentController {

//    @Autowired
//    private AssignmentService assignmentService;
//
//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadAssignment(@RequestParam("assignment") MultipartFile assignment){
//        String response = assignmentService.uploadAssignment(assignment);
//        return ResponseEntity.status(HttpStatus.OK).body(response);
//
//    }
//
//    @GetMapping("/download/{fileName}")
//    public ResponseEntity downloadAssignment(@PathVariable String fileName) {
//
//        byte[] response = assignmentService.downloadAssignment(fileName);
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType("application/pdf"))
//                .header(
//                        HttpHeaders.CONTENT_DISPOSITION,
//                        "attachment; filename=\"" + fileName + "\""
//                )
//                .body(response);
//    }
//    @CrossOrigin("http://localhost:4200")
//    @GetMapping("/find")
//    public List<Book> getBooks(){
//        return Stream.of(new Book(1,"java",55),
//                        new Book(2,"python",66), new Book(3,"jjj", 77))
//                .collect(Collectors.toList());
//    }

    @GetMapping
    public String msg(){
         return "hello world";
    }
}
