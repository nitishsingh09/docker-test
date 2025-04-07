//package com.file.service;
//import com.file.entity.Assignment;
//import com.file.repository.AssignmentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//import org.springframework.web.multipart.MultipartFile;
//import java.io.IOException;
//@Service
//public class AssignmentService {
//    @Autowired
//    AssignmentRepository assignmentRepository;
//    public String uploadAssignment(MultipartFile request){
//        // extract file name
//        String fileName = StringUtils.cleanPath(request.getOriginalFilename());
//        try {
//            Assignment assignment = new Assignment();
//            assignment.setFileName(fileName);
//            assignment.setFileContent(request.getBytes());
//            assignmentRepository.save(assignment);
//            return "Assignment submitted successfully";
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//    }
//
//    /**
//     * This function retrieves the file content of an assignment based on the provided file name.
//     *
//     * @param fileName The name of the assignment file to be downloaded.
//     * @return A byte array containing the content of the requested assignment file.
//     *         If the file name does not match any existing assignment, this method will return null.
//     */
//    public byte[] downloadAssignment(String fileName){
//        Assignment assignment = assignmentRepository.readAssignmentByFileName(fileName);
//        return assignment.getFileContent();
//    }
//}