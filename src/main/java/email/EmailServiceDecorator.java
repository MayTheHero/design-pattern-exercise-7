package email;

import employee.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class EmailServiceDecorator implements EmailService {
    private LocalDateTime timeOfSending;


    @Override
    public boolean send( Employee from, List<Employee> recipient, String title, String content) {
         timeOfSending = LocalDateTime.now();
         StringBuilder dataToWriteInFile = new StringBuilder();
         dataToWriteInFile.append("Time of sending: ").append(timeOfSending).append(" Sender: ")
                 .append(from).append(" Recipients: ").append(recipient).append(" Title: ")
                 .append(title).append(" Content: ").append(content);
         FileWriter.writeToFile(dataToWriteInFile.toString());
        return false;
    }
}
