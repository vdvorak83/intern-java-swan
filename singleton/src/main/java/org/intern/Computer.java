package org.intern;

class Computer {
    private OS os;

    public void launch(String osName) {
        os = OS.getInstance(osName);
    }

    public OS getOS() {
        return os;
    }

    public void setOS(OS os) {
        this.os = os;
    }
}