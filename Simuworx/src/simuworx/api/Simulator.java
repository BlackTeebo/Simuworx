/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuworx.api;

import simuworx.annotations.Version;

import java.util.ArrayList;

/**
 *
 * @author michael
 */
@Version(major = 0,minor = 1,build = 0)
public abstract class Simulator extends Thread{

    private ArrayList<SimulatorModule> moudules;

    public  Simulator(){
        moudules = new ArrayList<>();
    }

    @Override
    public abstract void run();

    public synchronized ArrayList<SimulatorModule> getMoudules() {
        return moudules;
    }
}
