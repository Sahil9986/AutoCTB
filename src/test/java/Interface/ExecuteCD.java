package Interface;

public class ExecuteCD implements InterB {

    @Override
    public void customer() {
        System.out.println("NEW customer onboarded");
    }

    @Override
    public void merchant() {
        System.out.println("NEW merchant onboarded");
    }

    @Override
    public void trader() {
        System.out.println("NEW trader onboarded");
    }

    @Override
    public void user() {
        System.out.println("NEW user onboarded");
    }

    @Override
    public void security() {
        System.out.println("NEW security onboarded");
    }

    @Override
    public void GUI() {
        System.out.println("NEW GUI onboarded");
    }

    @Override
    public void Application() {
        System.out.println("NEW Application onboarded");
    }

    @Override
    public void payment() {
        System.out.println("NEW payment onboarded");
    }
}
