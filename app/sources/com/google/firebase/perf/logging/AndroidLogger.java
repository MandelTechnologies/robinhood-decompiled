package com.google.firebase.perf.logging;

import java.util.Locale;

/* loaded from: classes.dex */
public class AndroidLogger {
    private static volatile AndroidLogger instance;
    private boolean isLogcatEnabled;
    private final LogWrapper logWrapper;

    public static AndroidLogger getInstance() {
        if (instance == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (instance == null) {
                        instance = new AndroidLogger();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public AndroidLogger(LogWrapper logWrapper) {
        this.isLogcatEnabled = false;
        this.logWrapper = logWrapper == null ? LogWrapper.getInstance() : logWrapper;
    }

    private AndroidLogger() {
        this(null);
    }

    public void setLogcatEnabled(boolean z) {
        this.isLogcatEnabled = z;
    }

    public boolean isLogcatEnabled() {
        return this.isLogcatEnabled;
    }

    public void debug(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1045d(str);
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1045d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void info(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1047i(str);
        }
    }

    public void info(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1047i(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void warn(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1048w(str);
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1048w(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void error(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1046e(str);
        }
    }

    public void error(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.m1046e(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
