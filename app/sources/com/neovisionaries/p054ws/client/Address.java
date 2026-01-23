package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class Address {
    private final String mHost;
    private final int mPort;
    private transient String mString;

    Address(String str, int i) {
        this.mHost = str;
        this.mPort = i;
    }

    String getHostname() {
        return this.mHost;
    }

    int getPort() {
        return this.mPort;
    }

    public String toString() {
        if (this.mString == null) {
            this.mString = String.format("%s:%d", this.mHost, Integer.valueOf(this.mPort));
        }
        return this.mString;
    }
}
