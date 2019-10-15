package com.isg.soa.soap.web.services.tp.soapwebservicestp.student;

import com.isg.soa.soap.students.GetStudentDetailsRequest;
import com.isg.soa.soap.students.GetStudentDetailsResponse;
import com.isg.soa.soap.students.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {
    @PayloadRoot(namespace = "http://soap.soa.isg.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) throws Exception {
        GetStudentDetailsResponse response = new GetStudentDetailsResponse();
        StudentDetails studentDetails = new StudentDetails();

        studentDetails.setId(1);
        studentDetails.setName("Chaouki");
        studentDetails.setPassportNumber("TN12345678");
        if(request.getId()==studentDetails.getId())
            response.setStudentDetails(studentDetails);
        else
            throw new Exception("Student not found");

        return response;
    }


}