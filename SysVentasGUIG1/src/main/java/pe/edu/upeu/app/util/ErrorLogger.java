/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class ErrorLogger {

    protected static final Logger logger = Logger.getLogger("MYLOG");
    private static String classs = "";

    public ErrorLogger(String classs) {
        this.classs = classs;
        configure();
    }

    private static void configure() {
        try {
            String logsDirectoryFolder = "logs";
            Files.createDirectories(Paths.get(logsDirectoryFolder));
            FileHandler fileHandler = new FileHandler(logsDirectoryFolder + File.separator + getCurrentTimeString() + ".log", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException exception) {
// exception.printStackTrace();
            System.err.println("configure:" + exception.toString());
        }
        addCloseHandlersShutdownHook();
    }

    private static void addCloseHandlersShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(()
                -> {
            for (Handler handler : logger.getHandlers()) {
                handler.close();
            }
        }));
    }

    private static String getCurrentTimeString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }

    public static void log(Level level, String me, Exception exception) {
        if (classs.equals("")) {
            configure();
            logger.log(level, me, exception);
        } else {
            logger.log(level, classs + "." + me, exception);
        }
    }
}
