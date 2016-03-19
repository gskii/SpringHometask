package ru.ncedu.model;

import java.util.List;

/**
 * Created by Gorbatovskiy on 19.03.2016.
 */
public class Watch {
    private List queue;

    public Watch() {
        System.out.println("Watch.Watch");
    }

    public void setQueue(List queue) {
        System.out.println("Watch.setQueue");
        this.queue = queue;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "queue=" + queue +
                '}';
    }
}
