package device_management;

import behaviours.IInput;
import behaviours.IOutput;

public class Computer {
    private String dataStream;
    private int ram;
    private int hddSize;
    private IInput inputDevice;
    private IOutput outputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public IInput getInputDevice() {
        return this.inputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

    public void setInputDevice(IInput inputDevice) {
        this.inputDevice = inputDevice;
    }

    public String getData() {
        this.dataStream = this.inputDevice.sendData(); //I'm sending data
                return this.dataStream;
    }
}
