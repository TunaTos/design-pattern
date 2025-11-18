package behavioral.template.exercise;

abstract  class Beverage {
    
    // 공통 메서드
    private void boilWater() {
        System.out.println("Boiling water!!");
    }

    private void pourInCup() {
        System.out.println("pourInCup!!");
    }
    
    // 추상 메서드 - 서브클래스에 구현 필수
    protected abstract void brew();
    protected abstract void addCondiments();
    
    // 훅(Hook) 메서드 - 선택적 오버라이드
    protected boolean wantsCondiments() {
        return true;
    }

    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) {
            addCondiments();
        }
    }
}

class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add sugar and milk in coffee");
    }
}

class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("brewing tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add remon");
    }

    @Override
    protected  boolean wantsCondiments() {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("*******Making Coffee**********");
        Beverage coffee = new Coffee();
        coffee.prepare();


        System.out.println("*******Making Coffee**********");
        Beverage tea = new Tea();
        tea.prepare();
    }
}
