package com.my;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import data.WorkJob;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        List<WorkJob> list = new ArrayList<>();
        list.add(new WorkJob());
        list.add(new WorkJob());

        list.get(0).setAuthor("123");
        list.get(1).setAuthor("789");

        for (WorkJob w:list) {
            logger.info(w.toString());
        }

        logger.info("Работа завершена.");
    }
}   
}
