package io.sentry.android.core;

/* loaded from: classes21.dex */
public final class AppState {
    private static AppState instance = new AppState();
    private Boolean inBackground = null;

    private AppState() {
    }

    public static AppState getInstance() {
        return instance;
    }

    public Boolean isInBackground() {
        return this.inBackground;
    }

    synchronized void setInBackground(boolean z) {
        this.inBackground = Boolean.valueOf(z);
    }
}
