package simuworx.api;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Teebo
 * Date: 08.11.13
 * Time: 22:18
 * To change this template use File | Settings | File Templates.
 */
public abstract class SimulatorModule extends Thread{
    private String moduleName;
    private Logger moduleLogger;

    protected SimulatorModule(String name) {
        this.moduleName = name;
        moduleLogger = Logger.getLogger(getClass().getSimpleName()+"_"+name);
    }


    public abstract void run();

    public Logger getModuleLogger() {
        return moduleLogger;
    }

    public String getModuleName() {
        return moduleName;
    }
}
