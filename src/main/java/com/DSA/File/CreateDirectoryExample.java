package com.DSA.File;

import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String directoryPath = "D:/amol" + i;
            Thread thread = new Thread(new CreateDirectoryTask(directoryPath));
            thread.start();
        }
    }
}

class CreateDirectoryTask implements Runnable {
    private String directoryPath;

    public CreateDirectoryTask(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    @Override
    public void run() {
     final   File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean created = directory.mkdir();
            if (created) {
                System.out.println("Directory " + directoryPath + " created successfully.");
            } else {
                System.out.println("Failed to create directory " + directoryPath);
            }
        } else {
            System.out.println("Directory " + directoryPath + " already exists.");
        }
    }
}
