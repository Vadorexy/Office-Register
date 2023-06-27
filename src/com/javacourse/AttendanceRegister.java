package com.javacourse;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class AttendanceRegister {
    private static Map<String, LocalDateTime> attendance = new HashMap<>();

    public static void recordAttendance(String employeeName) {
        LocalDateTime currentTime = LocalDateTime.now();
        attendance.put(employeeName, currentTime);
    }
    public static void viewAttendance() {
        for (Map.Entry<String, LocalDateTime> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        recordAttendance("Nelly");
        recordAttendance("Smart");
        viewAttendance();
    }
}