package io.sentry;

/* loaded from: classes21.dex */
public interface ReplayController {
    void captureReplay(Boolean bool);

    void pause();

    void resume();

    void start();

    void stop();
}
