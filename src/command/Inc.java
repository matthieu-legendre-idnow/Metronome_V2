package command;

import controller.Controller;

/**
 * Created by tp15009314 on 09/11/16.
 */
public class Inc implements  Command {

    private Controller controller;

    public Inc(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.incMesure();
    }
}
