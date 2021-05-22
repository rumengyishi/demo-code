package com.demo.design.facade;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("Computer  startup begin!");
        this.cpu.startup();
        this.memory.startup();
        this.disk.startup();
        System.out.println("Computer  startup end!");
    }

    public void shutdown() {
        System.out.println("Computer  shutdown begin!");
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
        System.out.println("Computer  shutdown end!");
    }

}
