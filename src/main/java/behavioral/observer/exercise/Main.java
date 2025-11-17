package behavioral.observer.exercise;

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;
import java.util.List;

// Observer interface
// Object that receives state change notifications
interface Observer {
    void update(String message);
}

// Subject interface
// Object that is being observed
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

class NewsAgency implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers(); // Notify all subscribers when news changes
    }
}

// Concrete Observer classes
class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " got news: " + message);
    }
}

class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + appName + " Alert] " + message);
    }
}


public class Main {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("KBS");
        Observer channel2 = new NewsChannel("MBC");
        Observer app = new MobileApp("NewsApp");

        agency.attach(channel1);
        agency.attach(channel2);
        agency.attach(app);

        agency.setNews("Breaking News: Important update!");

        agency.detach(channel2);

        agency.setNews("Weather: It will be sunny tomorrow.");
    }
}